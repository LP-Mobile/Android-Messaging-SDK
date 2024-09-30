**Release date:** September 30, 2024

# Overview

Android Mobile Messaging SDK version 5.23.1 release includes new features, enhancements and bug fixes.

## Environment requirements

The Android Mobile Messaging SDK version 5.23.1 uses:

- Minimum API version 21
- Compile API version 34
- Target API version 34
- Maps SDK "com.google.android.gms:play-services-maps:18.1.0"
- Structured Content Library “com.liveperson.android:lp_structured_content:2.6.5”
- Date Picker Library “com.liveperson.android:lp-date-picker:2.2.0”
- Appointment List Library "com.liveperson.android:lp-appointment-scheduler:2.0.0"


## New features

- Provided new API call to get a list of active conversation for particular consumer. Check this [link](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-apis-messaging-api.html#checkactiveconversations) for more info.
- Provided new API and configuration to get pending proactive messages. Check [getPendingProactiveMessages](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-apis-messaging-api.html#getpendingproactivemessages) and [lp_fetch_pending_proactive_messages](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#lp_fetch_pending_proactive_messages) for more info.
- Provided a new [callback](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-apis-callbacks-index.html#remote-message-link-clicked) and [flag](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#lp_message_link_as_callback) to intercept consumer's link tapped.

## Enhancements

- Resolved possible security vulnerabilities.
- SDK now supports markdown hyperkink in a welcome message (included Proactive message).

## Bugs fixed

- Fixed the wrong description of bot messages in the unread indicator.
- Remove cached CCUI welcome message when new engagement does not have attached welcome message.
- Internal bug fixes.

Please note, the SDK can be integrated to the app using Gradle dependency. For more information please refer to [the developers community](https://developers.liveperson.com/android-quickstart.html).