**Release date:** August 16, 2024

# Overview

Android Mobile Messaging SDK version 5.23.0-beta01 release includes new features, enhancements and bug fixes.

## Environment requirements

The Android Mobile Messaging SDK version 5.23.0-beta01 uses:

- Minimum API version 21
- Compile API version 34
- Target API version 34
- Maps SDK "com.google.android.gms:play-services-maps:18.1.0"
- Structured Content Library “com.liveperson.android:lp_structured_content:2.6.5”
- Date Picker Library “com.liveperson.android:lp-date-picker:2.2.0-beta01”
- Appointment List Library "com.liveperson.android:lp-appointment-scheduler:2.0.0"

## New features

1. Separate styles for messages sent by bot. Especially

- `bot_bubble_stroke_width`. Default value is the same as `agent_bubble_stroke_width` 
- `bot_bubble_stroke_color`. Default value is the same as `agent_bubble_message_text_color`
- `bot_bubble_message_text_color`. Default value is the same as `agent_bubble_message_text_color`
- `bot_bubble_message_link_text_color`. Default value is the same as `agent_bubble_message_link_text_color`
- `bot_bubble_message_markdown_hyperlink_text_color`. Default value is the same as `agent_bubble_message_markdown_hyperlink_text_color`
- `bot_bubble_timestamp_text_color`. Default value is the same as `agent_bubble_timestamp_text_color`
- `bot_bubble_background_color`. Default value is the same as `agent_bubble_background_color`
- `bot_avatar_background_color`. Default value is the same as `agent_avatar_background_color`
- `bot_avatar_icon_color`. Default value is the same as  agent_avatar_icon_color

- `bot_bubble_link_preview_background_color`. Default value is the same as `agent_bubble_link_preview_background_color`
- `bot_bubble_link_preview_title_text_color`. Default value is the same as `agent_bubble_link_preview_title_text_color`
- `bot_bubble_link_preview_description_text_color`. Default value is the same as `agent_bubble_link_preview_description_text_color`
- `bot_bubble_link_preview_background_stroke_color`. Default value is the same as `agent_bubble_link_preview_background_stroke_color`
- `bot_bubble_link_preview_background_stroke_width`. Default value is the same as `agent_bubble_link_preview_background_stroke_width`

2. Provided new API call to get a list of active conversation for particular consumer.


## Enhancements

- Provided new intent to handle QR-option tap events.
- Added new flag `lp_is_connection_bar_enabled` to enable/disable connection banner. Default value is `true`.
- Added new flag `lp_announce_message_status_first` to manage message's timestamp/state order in content description 
- Edited accessibility announcements and content descriptions for Date Picker component.

## Bugs fixed

- Fixed scrolling flags behavior.
- Internal bug fixes.

Please note, the SDK can be integrated to the app using Gradle dependency. For more information please refer to [the developers community](https://developers.liveperson.com/android-quickstart.html).