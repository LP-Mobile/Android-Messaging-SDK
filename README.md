**Release date:** April 12, 2024

# Overview

Android Mobile Messaging SDK version 5.21.0-beta01 release contains:

- SDK now allows users to switch to picture-in-picture mode. This allows users to minimize the call view while the call is still active and see/interact with the chat view.
  `lp_cobrowse_picture_in_picture_enabled = true`

- SDK can now render the Welcome Message that has been set on Window Configuration on Mobile Engagement. Reach out to your account representative to enable and adjust.

- Replace `addCertificatePinningKey(String publicKey)` by `addCertificatePinningKey(String domain, String publicKey)`

- Upgrade `com.nimbusds:nimbus-jose-jwt` version to 9.37.3

- Remove thumbnail size configuration `thumbnail_longer_dimension_resize`. The default value = 100 will be used.

- Crashes fixed.

Please note, the SDK can be integrated to the app using Gradle dependency. For more information please refer to [the developers community](https://developers.liveperson.com/android-quickstart.html).
