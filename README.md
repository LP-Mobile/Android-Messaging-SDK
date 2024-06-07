**Release date:** June 7, 2024

# Overview

Android Mobile Messaging SDK version 5.22.0-beta01 release contains:

- Compose support of ConversationFragment is now available. Example of `ConversationFragment` integration to compose ui could be found [here](https://github.com/LP-Messaging/sampleapp-compose).

- SDK now provides an API to send text messages and initiate file sharing flow. More info and example could be found [here](https://github.com/LP-Messaging/sampleapp-compose).

- SDK now has an ability to change read only mode without re-launching activity or fragment. More info and example could be found [here](https://github.com/LP-Messaging/sampleapp-compose).

- Added ability to skip caption flow to attached file before sending it. By default caption preview is enabled. Set `lp_is_consumer_file_caption_enabled` to false to skip caption preview flow on consumer side. 

- Restricted http calls execution when link preview is disabled.

- Fixed announcements of QR option.

- Internal bug fixes.

Please note, the SDK can be integrated to the app using Gradle dependency. For more information please refer to [the developers community](https://developers.liveperson.com/android-quickstart.html).