package com.liveperson.sample.app.proactive.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil.ItemCallback
import androidx.recyclerview.widget.ListAdapter
import com.liveperson.infra.model.PushMessage
import com.liveperson.sample.app.R

class PendingProactiveMessageAdapter(
    itemCallback: ItemCallback<PushMessage>
) : ListAdapter<PushMessage, PendingProactiveMessageVH>(itemCallback) {

    var onPushMessageInteractListener: OnPushMessageInteractListener? = null
        set(value) {
            field = value
            notifyItemRangeChanged(0, itemCount)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PendingProactiveMessageVH {
        val view = with(LayoutInflater.from(parent.context)) {
            inflate(R.layout.item_push_message, parent, false)
        }
        return PendingProactiveMessageVH(view)
    }

    override fun onBindViewHolder(holder: PendingProactiveMessageVH, position: Int) {
        holder.bind(getItem(position), onPushMessageInteractListener)
    }

    override fun onViewRecycled(holder: PendingProactiveMessageVH) {
        super.onViewRecycled(holder)
        holder.recycle()
    }
}