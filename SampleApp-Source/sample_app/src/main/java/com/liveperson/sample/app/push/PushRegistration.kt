package com.liveperson.sample.app.push

import android.content.Context
import android.util.Log
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.messaging.FirebaseMessaging
//import com.huawei.agconnect.config.AGConnectServicesConfig
//import com.huawei.hms.aaid.HmsInstanceId
//import com.huawei.hms.common.ApiException
import com.liveperson.infra.ICallback
import com.liveperson.infra.PushType
import com.liveperson.infra.auth.LPAuthenticationParams
import com.liveperson.infra.auth.LPAuthenticationType
import com.liveperson.messaging.sdk.api.LivePerson
import com.liveperson.sample.app.push.PushUtils.isGooglePlayServicesAvailable
//import com.liveperson.sample.app.push.PushUtils.isHuaweiServicesAvailable
import com.liveperson.sample.app.utils.SampleAppStorage
import com.liveperson.sample.app.utils.SampleAppUtils.createLPAuthParams

object PushRegistration {

	private val TAG = PushRegistration::class.java.simpleName

	fun getToken(baseContext: Context) {
		Log.d(TAG, "onHandleIntent: registering the token to pusher")

		if (isGooglePlayServicesAvailable(baseContext)) {
			FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
				if (!task.isSuccessful) {
					Log.w(TAG, "getInstanceId failed", task.exception)
					return@OnCompleteListener
				}

				// Get new Instance ID token
				val token = task.result
				registerLPPusher(baseContext, token, PushType.FCM)
			})
		}
	}

	fun registerLPPusher(context: Context, token: String?, pushType: PushType) {
		val brandId = SampleAppStorage.getInstance(context).account
		Log.i(TAG, "registerLPPusher: $token")
		val params = createLPAuthParams(context)
		LivePerson.registerLPPusher(brandId, SampleAppStorage.SDK_SAMPLE_FCM_APP_ID, token, pushType, params, object : ICallback<Void, Exception> {
			override fun onSuccess(value: Void?) {
				Log.d(TAG, "Registration to Pusher completed successfully")
			}

			override fun onError(exception: Exception?) {
				Log.e(TAG, "Registration to Pusher failed ${exception?.message}")
			}
		})
	}
}
