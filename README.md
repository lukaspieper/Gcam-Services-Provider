# Gcam Services Provider

[![continuous](https://github.com/lukaspieper/Gcam-Services-Provider/workflows/continuous/badge.svg)](https://github.com/lukaspieper/Gcam-Services-Provider/actions)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/lukaspieper/Gcam-Services-Provider/blob/master/LICENSE)

This app "simulates" the Google Play Services that the Google Camera app (Gcam) requires, allowing the camera app to be
used on devices without Google Play Services.

### Comparison: [GrapheneOS' Gcam support](https://grapheneos.org/usage#google-camera)

> [!NOTE]
> The only reason to consider Gcam-Services-Provider on GrapheneOS is the ability to use the button in Gcam that opens
> the last taken photo without having Google Photos installed. If you can do without it, you don't need this app.

Since April 2023 GrapheneOS is able to run Gcam without additional steps. Here is the relevant part of
the [changelog](https://grapheneos.org/releases#2023040400):

> add generic compatibility shim catching the exception from the Gservices provider being missing to enable apps like
> Google Camera [...] to work without GSF installed since they don't have any actual hard dependency on either GSF or
> Play
> services

Before that, back in July 2021, GrapheneOS implemented a compatibility layer to use the original Google Play services
without advanced permissions. For Gcam it was sufficient to install the Google Service Framework (GSF).

### Comparison: [microG](https://github.com/microg)

microG is a open source re-implementation of the Google Play Services (client side). Among other
things, [signature spoofing](https://github.com/microg/android_packages_apps_GmsCore/wiki/Signature-Spoofing) is used to
achieve this goal. In comparison, this app only aims to get Gcam running without Play Services. Therefore this app does
not need any security compromising hacks or permissions (no Internet access, no storage access and of course no root
access).

## How to install this app?

> [!IMPORTANT]
> Using GrapheneOS? Make sure you read the comparison with *GrapheneOS' Gcam support* above!

There are three versions of this app named "basic", "photos", and "photosonly". "Basic" includes everything you need to get
Gcam running but the button showing the last taken photo in full size will not work. The "photos" version has all
features from "basic" and adds support for this button but you cannot have the Google Photos app installed for technical
reasons. The "photosonly" version adds support for this button without a shim for GSF; it is meant to be used on GrapheneOS alongside the sandboxed Play Services.

Note that this app comes without UI and therefore has no icon in the app drawer. But of course it is listed in the
Android settings (e.g. for uninstallation).

|                | Incompatible apps                                                 | Download                                                                                                                                              |
|----------------|-------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------|
| Basic version  | - Google Service Framework (GSF)<br/>- microg                     | [GitHub](https://github.com/lukaspieper/Gcam-Services-Provider/releases)<br/>[F-Droid](https://f-droid.org/de/packages/de.lukaspieper.gcam.services/) |
| Photos version | - Google Service Framework (GSF)<br/>- microg<br/>- Google Photos | [GitHub](https://github.com/lukaspieper/Gcam-Services-Provider/releases)                                                                              |
| Photosonly version | - microg<br/>- Google Photos | [GitHub](https://github.com/lukaspieper/Gcam-Services-Provider/releases) |

### Gcam Compatibility

| Google camera version | Requirements                                                                                                 | Relevant issues                                                                               |
|-----------------------|--------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------|
| 7.4 & 7.5             |                                                                                                              |                                                                                               |
| >=7.6                 | [Compatible Android OS](https://github.com/lukaspieper/Gcam-Services-Provider/discussions/28) or modded Gcam | [#22](https://github.com/lukaspieper/Gcam-Services-Provider/issues/22#issuecomment-814239882) |

## Known from/recommended by

- [XDA Developers](https://www.xda-developers.com/google-camera-port-hub/)
- [GCam Hub (celsoazevedo)](https://www.celsoazevedo.com/files/android/google-camera/troubleshooting/)
- [Kuketz-Blog (German IT security and privacy blog)](https://www.kuketz-blog.de/?s=gcam+services+provider)
