// Top-level build file where you can add configuration options common to all sub-projects/modules.

/*Hiddify{*/

buildscript {
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
    dependencies {
        
        classpath 'com.android.tools.build:gradle:7.4.2'


        // Make sure that you have the Google services Gradle plugin dependency
        classpath 'com.google.gms:google-services:4.3.15'


        // Add the dependency for the Crashlytics Gradle plugin
        classpath 'com.google.firebase:firebase-crashlytics-gradle:2.9.5'
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.2" apply false
    id("com.android.library") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
}