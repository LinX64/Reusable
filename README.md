# 📘 Reusable Components library for Compose

![master CI](https://github.com/LinX64/Reusable/actions/workflows/publish.yaml/badge.svg)
![develop CI](https://github.com/LinX64/Reusable/actions/workflows/ci.yaml/badge.svg)

This library is a treasure trove of reusable components tailored for Jetpack Compose, designed to simplify the creation of complex interfaces. It's your go-to toolkit for crafting visually stunning UIs effortlessly. So, let's cut to the chase and unleash the magic! 😃

## Components

Currently, the library contains the following components:

- Containers
- Buttons
- Columns
- TODO: Preview
- TODO: Spacers

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

## Installation

...I will add this section once it is published to Maven Central.

## License

This library is licensed under the Apache 2.0 License. See the [LICENSE](LICENSE) file for more
information.
