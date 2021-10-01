# Gcam Services Provider

[![continuous](https://github.com/lukaspieper/Gcam-Services-Provider/workflows/continuous/badge.svg)](https://github.com/lukaspieper/Gcam-Services-Provider/actions)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/lukaspieper/Gcam-Services-Provider/blob/master/LICENSE)

This app "simulates" the Google Play Services that the Google Camera app (Gcam) requires, allowing the camera app to be used on devices without Google Play Services. Note that this app comes without UI and therefore has no icon in the app drawer. But of course it is listed in the Android settings (e.g. for uninstallation).

### What is the difference between this app and [microG](https://github.com/microg)?

microG is a open source re-implementation of the Google Play Services (client side). Among other things, [signature spoofing](https://github.com/microg/android_packages_apps_GmsCore/wiki/Signature-Spoofing) is used to achieve this goal. In comparison, this app only aims to get Gcam running without Play Services. Therefore this app does not need any security compromising hacks or permissions (no Internet access, no storage access and of course no root access needed).

### How to install this app

If you can, the recommended way is to build the app from source. After all, software is usually a matter of trust. Alternatively you can find an apk for sideloading under [releases](https://github.com/lukaspieper/Gcam-Services-Provider/releases).

Currently there are two versions of this app named "basic" and "photos". "Basic" includes everything you need to get Gcam running but the button showing the last photo in full size will not work. The "photos" version has all features from "basic" and adds support for this button but you cannot have the Google Photos app installed for technical reasons.

In short: if you have Google Photos installed go with "basic" else install the "photos" version.

### Compatibility

|Google camera version|Requirements                        |Relevant issues                                                                              |
|---------------------|------------------------------------|---------------------------------------------------------------------------------------------|
|7.4 & 7.5            |                                    |                                                                                             |
|>=7.6                |Compatible Android OS or modded Gcam|[#22](https://github.com/lukaspieper/Gcam-Services-Provider/issues/22#issuecomment-814239882)|

### Known from/recommended by

- [XDA Developers](https://www.xda-developers.com/google-camera-port-hub/)
- [GCam Hub (celsoazevedo)](https://www.celsoazevedo.com/files/android/google-camera/troubleshooting/)
- [Kuketz-Blog (German IT security and privacy blog)](https://www.kuketz-blog.de/?s=gcam+services+provider)