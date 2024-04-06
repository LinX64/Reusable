<p align="center">
  <img src="https://github.com/LinX64/Reusable/actions/workflows/publish.yaml/badge.svg" alt="master CI">
  <img src="https://github.com/LinX64/Reusable/actions/workflows/ci.yaml/badge.svg" alt="develop CI">
  <a href="https://central.sonatype.com/artifact/io.github.linx64/reusablecomponents/overview">
    <img src="https://img.shields.io/maven-central/v/io.github.linx64/reusablecomponents.svg?label=Maven%20Central&logo=android&style=flat-square" alt="Maven Central">
  </a>
</p>

# 🚀📘 Reusable Components library for Compose

This library is a treasure trove of reusable components tailored for Jetpack Compose, designed to
simplify the creation of complex interfaces. It's your go-to toolkit for crafting visually stunning
UIs effortlessly. So, let's cut to the chase and unleash the magic! 😃

<img src="https://i.imgur.com/mRCBlcG.png"  alt="banner"/>

## Installation

To use the library, add the following line of code to your `build.gradle` file if you are using
Kotlin DSL:

```Kotlin
implementation("io.github.linx64:reusablecomponents:<version>")
```

Groovy:

```Groovy
implementation 'io.github.linx64:reusablecomponents:<version>'
```

Version Catalog:

```Kotlin-dsl
reusable-components = <version>
reusableComponents = { group = "io.github.linx64", name = "reusablecomponents", version.ref = "reusable-components" }
```

## Components

Currently, the library contains the following components:

- [Containers](https://github.com/LinX64/Reusable/tree/develop/reusablecomponents/src/main/kotlin/com/client/reusablecomponents/containers)
- [Buttons](https://github.com/LinX64/Reusable/tree/develop/reusablecomponents/src/main/kotlin/com/client/reusablecomponents/buttons)
- [Columns](https://github.com/LinX64/Reusable/blob/develop/reusablecomponents/src/main/kotlin/com/client/reusablecomponents/containers/CenteredColumn.kt)
- [Previews](https://github.com/LinX64/Reusable/tree/develop/reusablecomponents/src/main/kotlin/com/client/reusablecomponents/previews)
- [Spacers](https://github.com/LinX64/Reusable/tree/develop/reusablecomponents/src/main/kotlin/com/client/reusablecomponents/spacers)
- Other necessary components will be added soon.

## Usage

Using the components is very simple. Just add the library to your project and based on your need,
let's say you want to have a Scrollable screen with a few Buttons:

```kotlin
ScrollableScreen {
    Text(
        modifier = Modifier.align(Alignment.CenterHorizontally),
        text = "Here is the Home Screen!"
    )
    FillHeightSpacer()
    FillHorizontalHeight()
    PrimaryButton(text = R.string.app_name, onClick = {})
    FillHorizontalHeight()
    PrimaryButton(text = R.string.app_name, onClick = {})
    FillHorizontalHeight()
    SecondaryButton(text = R.string.app_name, onClick = {})
}
```

And that's it! You have a scrollable screen with a few buttons

You can customize the container by passing your own `modifier` to it. The same goes for the buttons, you can pass your own `modifier` to the buttons.

**Important note:** To use the Preview components, you'll need to add your theme first, then use the
components to create your UI.

## 🙋‍Contributing

Please read [contribution guidelines](CONTRIBUTING.md) for more information regarding contribution.

## License

This library is licensed under the Apache 2.0 License. See the [LICENSE](LICENSE) file for more
information.
