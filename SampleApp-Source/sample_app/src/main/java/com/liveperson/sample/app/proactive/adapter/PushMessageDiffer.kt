package com.liveperson.sample.app.proactive.adapter

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import com.liveperson.infra.model.PushMessage

class PushMessageDiffer: DiffUtil.ItemCallback<PushMessage>() {
    override fun areItemsTheSame(oldItem: PushMessage, newItem: PushMessage): Boolean {
        return oldItem.pushMessageId == newItem.pushMessageId
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: PushMessage, newItem: PushMessage): Boolean {
        return oldItem.equals(newItem)
    }
}