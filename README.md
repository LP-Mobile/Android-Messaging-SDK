**Release date:** August 30, 2024

# Overview

Android Mobile Messaging SDK version 5.23.0 release includes new features, enhancements and bug fixes.

## Environment requirements

The Android Mobile Messaging SDK version 5.23.0 uses:

- Minimum API version 21
- Compile API version 34
- Target API version 34
- Maps SDK "com.google.android.gms:play-services-maps:18.1.0"
- Structured Content Library “com.liveperson.android:lp_structured_content:2.6.5”
- Date Picker Library “com.liveperson.android:lp-date-picker:2.2.0”
- Appointment List Library "com.liveperson.android:lp-appointment-scheduler:2.0.0"

## New features

- Provided the ability to identify the bot user messages and decorate the UI different from human agent messages. There are additional branding configurations provided for this purpose:

    - [`bot_bubble_stroke_width`](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#bot_bubble_stroke_width). Default value is the same as `agent_bubble_stroke_width`.
    - [`bot_bubble_stroke_color`](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#bot_bubble_stroke_color). Default value is the same as `agent_bubble_message_text_color`
    - [`bot_bubble_message_text_color`](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#bot_bubble_message_text_color). Default value is the same as `agent_bubble_message_text_color`
    - [`bot_bubble_message_link_text_color`](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#bot_bubble_message_link_text_color). Default value is the same as `agent_bubble_message_link_text_color`
    - [`bot_bubble_message_markdown_hyperlink_text_color`](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#bot_bubble_message_markdown_hyperlink_text_color). Default value is the same as `agent_bubble_message_markdown_hyperlink_text_color`
    - [`bot_bubble_timestamp_text_color`](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#bot_bubble_timestamp_text_color). Default value is the same as `agent_bubble_timestamp_text_color`
    - [`bot_bubble_background_color`](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#bot_bubble_background_color). Default value is the same as `agent_bubble_background_color`
    - [`bot_avatar_background_color`](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#bot_avatar_background_color). Default value is the same as `agent_avatar_background_color`
    - [`bot_avatar_icon_color`](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#bot_avatar_icon_color). Default value is the same as  agent_avatar_icon_color
    - [`bot_bubble_link_preview_background_color`](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#bot_bubble_link_preview_background_color). Default value is the same as `agent_bubble_link_preview_background_color`
    - [`bot_bubble_link_preview_title_text_color`](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#bot_bubble_link_preview_title_text_color). Default value is the same as `agent_bubble_link_preview_title_text_color`
    - [`bot_bubble_link_preview_description_text_color`](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#bot_bubble_link_preview_description_text_color). Default value is the same as `agent_bubble_link_preview_description_text_color`
    - [`bot_bubble_link_preview_background_stroke_color`](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#bot_bubble_link_preview_background_stroke_color). Default value is the same as `agent_bubble_link_preview_background_stroke_color`
    - [`bot_bubble_link_preview_background_stroke_width`](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#bot_bubble_link_preview_background_stroke_width). Default value is the same as `agent_bubble_link_preview_background_stroke_width`

- Provided new API call to get a list of active conversation for particular consumer. Check this [link](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-apis-messaging-api.html#checkactiveconversations) for more info.

- A new SDK callback is provided that will be invoked when welcome message option gets tapped. Check this [link](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-apis-callbacks-index.html#on-welcome-message-option-tapped) for more info.


## Enhancements

- Added new flag `lp_is_connection_bar_enabled` to show/hide connection banner. Check this [link](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#lp_is_connection_bar_enabled) for more info.
- Added new flag `lp_announce_message_status_first` to manage order of message's description's data. Check this [link](https://developers.liveperson.com/mobile-app-messaging-sdk-for-android-sdk-attributes-5-0-and-above.html#lp_announce_message_status_first) for more info.
- Improved accessibility announcements and added missed content descriptions for Date Picker component.

## Bugs fixed

- Fixed scrolling flags behavior.
- Internal bug fixes.