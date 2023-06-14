/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 *
 * Detailed information about configuring a multi-project build in Gradle can be found
 * in the user manual at https://docs.gradle.org/6.3/userguide/multi_project_builds.html
 */

rootProject.name = "SlimeVR Server"

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }

	val kotlinVersion: String by settings
	val spotlessVersion: String by settings
	val shadowJarVersion: String by settings
	val buildconfigVersion: String by settings
	plugins {
		kotlin("plugin.serialization") version kotlinVersion
		kotlin("jvm") version kotlinVersion
		id("org.jetbrains.kotlin.android") version kotlinVersion
		id("org.jetbrains.kotlin.jvm") version kotlinVersion
		id("com.diffplug.spotless") version spotlessVersion
		id("com.github.johnrengelman.shadow") version shadowJarVersion
		id("com.github.gmazzo.buildconfig") version buildconfigVersion
	}
}

include(":solarxr-protocol")
project(":solarxr-protocol").projectDir = File("solarxr-protocol/protocol/java")

include(":server")
project(":server").projectDir = File("server")
include(":server:core")
include(":server:desktop")
//include(":server:android")
