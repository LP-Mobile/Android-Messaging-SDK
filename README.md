**Release date:** October 31, 2024

# Overview

Android Mobile Messaging SDK version 5.24.0 release includes new features, enhancements and bug fixes.

## Environment requirements

The Android Mobile Messaging SDK version 5.24.0 uses:

- Minimum API version 21
- Compile API version 34
- Target API version 34
- Maps SDK "com.google.android.gms:play-services-maps:18.1.0"
- Structured Content Library “com.liveperson.android:lp_structured_content:2.6.6”
- Date Picker Library “com.liveperson.android:lp-date-picker:2.2.1”
- Appointment List Library "com.liveperson.android:lp-appointment-scheduler:2.0.1"

## New features

### Blocking Publish Actions on Historical SC Messages 

Consumers are now prevented from triggering publish actions (e.g., PublishTextAction, DatePickerAction, AppointmentScheduler)
on Structured Content (SC) messages that are no longer the latest in the conversation.
This can be configured either at the site level for default behavior or at the JSON level for individual message control.
By default, this feature is not enabled and will not impact existing messaging flows. For configuration, please reach out to your account manager.

### Blocking Message Input on Action-Required SC Messages

Consumers are also blocked from sending messages when an action-required SC message (e.g., a DatePicker or AppointmentScheduler)
is the latest in the conversation.
Like the previous feature, this can be enabled site-wide or controlled on a per-message basis through the JSON schema.
By default, this feature is not enabled and will not impact existing messaging flows. For configuration, please reach out to your account manager.

### Blocked elements styles

Introduced new styles for blocked elements in structured content based on flags in its structure or per account.

- [sc_disabled_buttonElement_text_color](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#sc_disabled_buttonelement_text_color)
- [sc_disabled_buttonElement_background_color](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#sc_disabled_buttonelement_background_color)

## Enhancements

- Improved accessibility image announcement logic in structured content to follow the pattern: ToolTip (if present) + Action type + Element type.
- Added Structured Content texts rtl-ltr support. If "rtl" is absent, text direction will now follow the device locale, but when "rtl" is present, it will override the locale-based direction.
- Improved Appointment list accessibility content descriptions and announcements.

## Bugs fixed

- Resolved an issue where the unread message counter incorrectly increased when an agent sent a message after the consumer opened the app via a push notification.
- Fixed an issue that prevented users from continuing a conversation after clicking on a Quick Reply option sent by an agent or bot.
- Resolved an issue where the keyboard closed unexpectedly when a user sent or received a message in the SDK.
- Resolved a display issue that caused data to be cut off in the date-picker when larger font sizes were enabled in Accessibility settings.
- Fixed a bug where the first PCS message duplicated after logging back in and resuming a conversation.
- Updated the single-date DatePicker to display the selected date in the center.
- Restored the Appointment List functionality after changing the device language, and fixed issues with Confirm and Close buttons not functioning properly.

Please note, the SDK can be integrated to the app using Gradle dependency. For more information please refer to [the developers community](https://developers.liveperson.com/android-quickstart.html).