import com.vanniktech.maven.publish.AndroidSingleVariantLibrary

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.detekt)
    id(libs.plugins.mavenPublish.get().pluginId)
}

android {
    namespace = "io.github.linx64.reusablecomponents"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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

    detekt {
        config.setFrom(file("$rootDir/app/config/detekt/config.yml"))
        parallel = true
        buildUponDefaultConfig = true
        autoCorrect = true
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

    detektPlugins(libs.detekt.formatting)

    testImplementation(libs.junit)
    debugImplementation(libs.androidx.ui.test.manifest)
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
