**Release date:** April 30, 2024

# Overview

Android Mobile Messaging SDK version 5.21.0 release includes new features, enhancements and bug fixes.

## Environment requirements

The Android Mobile Messaging SDK version 5.21.0 uses:

- Minimum API version 21
- Compile API version 34
- Target API version 34
- Maps SDK "com.google.android.gms:play-services-maps:18.1.0"
- Structured Content Library “com.liveperson.android:lp_structured_content:2.6.4”
- Date Picker Library “com.liveperson.android:lp-date-picker:2.1.0”
- Appointment List Library "com.liveperson.android:lp-appointment-scheduler:2.0.0"

## New features

- SDK can now render the Welcome Message set on Window Configuration on Mobile Engagement. Reach out to your account representative to enable and adjust.
- SDK now allows users to switch to picture-in-picture mode. This allows users to minimize the call view while the call is still active and see/interact with the chat view. Check [this attribute](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#lp_cobrowse_picture_in_picture_enabled) for more information. Picture in Picture is supported on Android N (API 24) and above. Previous versions will default to full screen call view.

## Enhancements

- Removed configuration [thumbnail_longer_dimension_resize](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#thumbnail_longer_dimension_resize). The default value = 100 will be used.
- Improved conversation initiation by sending messages improvements.
- Updated `nimbus-jose-jwt` library's version to prevent vulnerabilities. Check this [table]( https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-resources-open-source-list-and-dependencies.html#previous-dependencies-per-sdk-version) for more information.

## Bugs fixed

- Fixed issue for authentication headers with unexpected chars. [Original issue.](https://github.com/LP-Messaging/Android-Messaging-SDK/issues/139)
- Fixed crash caused by ViewHolders representation.
- Fixed crash caused by attempt to write a readonly database.
- Fixed crash caused by certificate pinning keys setup. Update doc how to setup certificate pinning keys for Android can be found [here](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-advanced-features-certificate-pinning.html).
- Internal bug fixes.

Please note, the SDK can be integrated to the app using Gradle dependency. For more information please refer to [the developers community](https://developers.liveperson.com/android-quickstart.html).