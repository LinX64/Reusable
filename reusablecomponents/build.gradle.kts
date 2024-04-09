import com.vanniktech.maven.publish.AndroidSingleVariantLibrary

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.mavenPublish)
}

android {
    namespace = "io.github.linx64.reusablecomponents"
    compileSdk = 34

    defaultConfig {
        minSdk = 24
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
        }

        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(11))
        }
    }

    buildFeatures {
        compose = true
        buildConfig = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.11"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.material.iconsExtended)

    debugImplementation(libs.androidx.ui.tooling)
}

publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "io.github.linx64"
            artifactId = "reusablecomponents"
            version = System.getenv("RELEASE_VERSION")
            artifact("build/outputs/aar/${artifactId}-release.aar")
        }

        repositories {
            maven {
                name = "Reusable"
                url = uri("https://maven.pkg.github.com/LinX64/Reusable")

                credentials {
                    username = System.getenv("GITHUB_ACTOR")
                    password = System.getenv("GITHUB_TOKEN")
                }
            }
        }
    }
}

mavenPublishing {
    configure(
        AndroidSingleVariantLibrary(
            variant = "release",
            sourcesJar = true,
            publishJavadocJar = true,
        )
    )
}

tasks.named("signReleasePublication") {
    dependsOn(":reusablecomponents:bundleReleaseAar")
}
