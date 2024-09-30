package com.liveperson.sample.app.proactive.adapter

import com.liveperson.infra.model.PushMessage

interface OnPushMessageInteractListener {

    fun onButtonClick(message: PushMessage, position: Int)
}