package com.liveperson.sample.app.proactive

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.liveperson.infra.ICallback
import com.liveperson.infra.model.PushMessage
import com.liveperson.messaging.sdk.api.LivePerson
import com.liveperson.sample.app.R
import com.liveperson.sample.app.proactive.adapter.OnPushMessageInteractListener
import com.liveperson.sample.app.proactive.adapter.PendingProactiveMessageAdapter
import com.liveperson.sample.app.proactive.adapter.PushMessageDiffer
import com.liveperson.sample.app.utils.SampleAppStorage
import com.liveperson.sample.app.utils.SampleAppUtils

class PendingProactiveMessagesFragment : Fragment(),
    OnPushMessageInteractListener {

    private val messagesAdapter = PendingProactiveMessageAdapter(PushMessageDiffer())
    private var fetchMessagesButton: Button? = null
    private var clearAllCheckBox: CheckBox? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pending_proactive_messages, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val emptyListView: TextView = view.findViewById(R.id.empty_list_view)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        messagesAdapter.onPushMessageInteractListener = this
        recyclerView.setup()

        fetchMessagesButton = view.findViewById(R.id.fetchButton)
        fetchMessagesButton?.setOnClickListener {
            loadPendingMessages { messages ->
                if (messages.isEmpty()) {
                    emptyListView.visibility = View.VISIBLE
                    recyclerView.visibility = View.GONE
                } else {
                    emptyListView.visibility = View.GONE
                    recyclerView.visibility = View.VISIBLE
                }
                messagesAdapter.submitList(messages)
            }
        }

        clearAllCheckBox = view.findViewById(R.id.clearOthersCheckBox)
    }

    override fun onDestroyView() {
        fetchMessagesButton = null
        clearAllCheckBox = null
        messagesAdapter.onPushMessageInteractListener = null
        fetchMessagesButton?.setOnClickListener(null)
        super.onDestroyView()
    }

    private fun RecyclerView.setup() {
        val manager = LinearLayoutManager(context)
        layoutManager = manager
        adapter = messagesAdapter
        addItemDecoration(DividerItemDecoration(context, manager.orientation))
    }

    override fun onButtonClick(message: PushMessage, position: Int) {
        val clearOthers = clearAllCheckBox?.isChecked ?: false
        context?.showToast("Tapped: ${message.pushMessageId} clearOthers : $clearOthers")
        LivePerson.setPushNotificationTapped(message.pushMessageId, clearOthers)
    }

    private fun Context.showToast(text: String, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, text, length).show()
    }

    private inline fun loadPendingMessages(crossinline block: (List<PushMessage>) -> Unit) {
        LivePerson.getPendingProactiveMessages(SampleAppStorage.SDK_SAMPLE_FCM_APP_ID,
            SampleAppUtils.createLPAuthParams(context),
            object : ICallback<List<PushMessage?>?, Exception?> {
                override fun onSuccess(value: List<PushMessage?>?) {
                    Log.d(TAG, "onSuccess Pending proactive msg:  + ${value?.size}")
                    block(value?.filterNotNull() ?: emptyList())
                }

                override fun onError(exception: Exception?) {
                    Log.d(TAG, "onError", exception)
                    block(emptyList())
                }
            })
    }

    companion object {

        const val TAG = "PRMSGSFragment"
    }
}