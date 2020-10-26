# Gcam Services Provider

[![continuous](https://github.com/lukaspieper/Gcam-Services-Provider/workflows/continuous/badge.svg)](https://github.com/lukaspieper/Gcam-Services-Provider/actions)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/lukaspieper/Gcam-Services-Provider/blob/master/LICENSE)

This app "simulates" the Google Play Services that the Google Camera app (Gcam) requires, allowing the camera app to be used on devices without Google Play Services. Note that this app comes without Ui and therefore has no icon in the app drawer. But of course it is listed in the Android settings (e.g. for uninstallation).

#### What is the difference between this app and [microG](https://github.com/microg)?

microG is a open source re-implementation of the Google Play Services. Among other things, [signature spoofing](https://github.com/microg/android_packages_apps_GmsCore/wiki/Signature-Spoofing) is used to achieve this goal. In comparison, this app has only one goal: to get Gcam running without Play Services. Therefore this app does not need any security compromising hacks or permissions (no Internet access, no storage access and of course no root access needed).

#### How to install this app

If you can, the recommended way is to build the app from source. After all, software is usually a matter of trust. Alternatively you can find an apk for sideloading under [releases](https://github.com/lukaspieper/Gcam-Services-Provider/releases).
