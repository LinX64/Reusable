# 📘 Reusable Components library for Compose

![master CI](https://github.com/LinX64/Reusable/actions/workflows/publish.yaml/badge.svg)
![develop CI](https://github.com/LinX64/Reusable/actions/workflows/ci.yaml/badge.svg)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.linx64/reusablecomponents.svg)](https://central.sonatype.com/artifact/io.github.linx64/reusablecomponents/overview)

This library is a treasure trove of reusable components tailored for Jetpack Compose, designed to
simplify the creation of complex interfaces. It's your go-to toolkit for crafting visually stunning
UIs effortlessly. So, let's cut to the chase and unleash the magic! 😃

## Components

Currently, the library contains the following components:

- Containers
- Buttons
- Columns
- Preview
- Spacers
- Other necessary components will be added soon.

## Installation

To use the library, add the following line of code to your `build.gradle` file if you are using
Kotlin DSL:

```Kotlin
implementation("io.github.linx64:reusablecomponents:<version>")
```

Or this for Groovy:

```Groovy
implementation 'io.github.linx64:reusablecomponents:<version>'
```

Version Catalog:

```Kotlin
reusablecomponents_version = <version>

reusableComponents = { group = "io.github.linx64", name = "reusablecomponents", version.ref = "reuseableComponents" }
```

## Usage

Using the components is very simple. Just add the library to your project and based on your need,
let's say you want to have a Scrollable screen with a few Buttons:

```kotlin
ScrollableScreen {
    PrimaryButton(text = R.string.app_name, onClick = {})

    Spacer(modifier = Modifier.height(16.dp))

    PrimaryButton(text = R.string.app_name, onClick = {})

    Spacer(modifier = Modifier.height(16.dp))

    PrimaryButton(text = R.string.app_name, onClick = {})

    Spacer(modifier = Modifier.height(16.dp))

    PrimaryButton(text = R.string.app_name, onClick = {})
}
```

And that's it! You have a scrollable screen with a few buttons. You can customize the container by
passing your own `modifier` to it. The same goes for the buttons, you can pass your own `modifier`
to it.

This is how it will look like:

<img src="https://i.imgur.com/9AfnPTk.png" width="250" />

## License

This library is licensed under the Apache 2.0 License. See the [LICENSE](LICENSE) file for more
information.
