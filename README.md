# Gcam Services Provider

[![continuous](https://github.com/lukaspieper/Gcam-Services-Provider/workflows/continuous/badge.svg)](https://github.com/lukaspieper/Gcam-Services-Provider/actions)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/lukaspieper/Gcam-Services-Provider/blob/master/LICENSE)

This app 'simulates' certain components of Google Play Services required by the Google Camera (Gcam) app, enabling it
to be used on devices without Google Play Services.

### Comparison: [GrapheneOS' Gcam support](https://grapheneos.org/usage#google-camera)

> [!IMPORTANT]
> On GrapheneOS the *photosonly* flavor is the only one that is supported.

Since April 2023 GrapheneOS is able to run Gcam without additional steps. Here is the relevant part of
the [changelog](https://grapheneos.org/releases#2023040400):

> add generic compatibility shim catching the exception from the Gservices provider being missing to enable apps like
> Google Camera [...] to work without GSF installed since they don't have any actual hard dependency on either GSF or
> Play services

However, the button that opens the last photo taken won't work unless Google Photos is installed. If you want to use
your favourite gallery app instead, install the *photosonly* flavor of this app.

### Comparison: [microG](https://github.com/microg)

microG is a open source re-implementation of the Google Play Services (client side). Among other
things, [signature spoofing](https://github.com/microg/android_packages_apps_GmsCore/wiki/Signature-Spoofing) is used to
achieve this goal. In comparison, this app only aims to get Gcam running without Play Services. Therefore this app does
not need any security compromising hacks or permissions (no Internet access, no storage access and of course no root
access).

## How to install this app?

> [!IMPORTANT]
> Using GrapheneOS? Make sure you read the comparison with *GrapheneOS' Gcam support* above!

There are three flavors of this app named *basic*, *photos*, and *photosonly*. All come without UI and therefore have no
icon in the app drawer. But of course the installation is listed in the Android settings (e.g. for uninstallation).

*Basic* includes everything you need to get Gcam running but the button opening the last taken photo will not work. The
*photosonly* flavor supports this button but does **not** provide the features of the *basic* flavor; it is meant to be
used alongside Play Services/microg. The *photos* flavor has all features from *basic* and *photosonly* combined in one 
app.

| Flavor       | Incompatible apps                                                 | Download                                                                                                                                              |
|--------------|-------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------|
| *Basic*      | - Google Service Framework (GSF)<br/>- microg                     | [GitHub](https://github.com/lukaspieper/Gcam-Services-Provider/releases)<br/>[F-Droid](https://f-droid.org/de/packages/de.lukaspieper.gcam.services/) |
| *Photosonly* | - Google Photos                                                   | [GitHub](https://github.com/lukaspieper/Gcam-Services-Provider/releases)                                                                              |
| *Photos*     | - Google Service Framework (GSF)<br/>- microg<br/>- Google Photos | [GitHub](https://github.com/lukaspieper/Gcam-Services-Provider/releases)                                                                              |

### Gcam compatibility

* Use a [compatible Android OS](https://github.com/lukaspieper/Gcam-Services-Provider/discussions/28) ([#22](https://github.com/lukaspieper/Gcam-Services-Provider/issues/22#issuecomment-814239882)) or modded Gcam
* Gcam version 10.x is currently unsupported ([#190](https://github.com/lukaspieper/Gcam-Services-Provider/issues/190))
