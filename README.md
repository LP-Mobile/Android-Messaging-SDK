**Release date:** June 28, 2024

# Overview

Android Mobile Messaging SDK version 5.22.0 release includes new features, enhancements and bug fixes.

## Environment requirements

The Android Mobile Messaging SDK version 5.22.0 uses:

- Minimum API version 21
- Compile API version 34
- Target API version 34
- Maps SDK "com.google.android.gms:play-services-maps:18.1.0"
- Structured Content Library “com.liveperson.android:lp_structured_content:2.6.5”
- Date Picker Library “com.liveperson.android:lp-date-picker:2.1.0”
- Appointment List Library "com.liveperson.android:lp-appointment-scheduler:2.0.0"

## New features

- Compose support of ConversationFragment is now available. Example of `ConversationFragment` integration to compose ui could be found [here](https://github.com/LP-Messaging/sampleapp-compose).
- Provided API calls to send text messages and initiate file sharing flow. Visit this [page](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-apis-messaging-api.html#sendtextmessage) to get more information. An example of usage could be found [here](https://github.com/LP-Messaging/sampleapp-compose).
- Provided an API to change read only mode without re-launching activity or fragment. Visit this [page](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-apis-messaging-api.html#changereadonlymode) to get more information. An example of usage could be found [here](https://github.com/LP-Messaging/sampleapp-compose)
- Added ability to skip adding caption to attached file before sending it. Visit this [link](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#lp_is_consumer_file_caption_enabled) for more information.

## Enhancements

- Restricted http calls execution when link preview is disabled.

## Bugs fixed

- Fixed register/unregister pusher callback invocation.
- Fixed sending of notification event when consumer chooses QR-option.
- Fixed applying history control params for initial requests.
- Added null check for ConversationFragment instance when new intent was received by ConversationActivity.
- Fixed announcements of QR options.
- Fixed SecurityException crash when user tries to send a chosen photo or file.
- Internal bug fixes.

Please note, the SDK can be integrated to the app using Gradle dependency. For more information please refer to [the developers community](https://developers.liveperson.com/android-quickstart.html).