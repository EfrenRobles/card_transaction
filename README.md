Authorizer in Java [package com.chucuaz.authorizer]
===========================================

# Overview

The authorizer is a lightweight application that authorizes transactions for a specific account following a set of predefined rules.

**Project goals include:**

    • Use a file that contains the transactions as input via STDIN.
    • Return the result via STDOUT of the transactions.
    • Easy to build no frameworks are needed just the OpenJDK Runtime Environment.
    • Designed and tested on openjdk version "1.8.0_292" to openjdk version "18.0".
    • The package test is only for run tests in debugging only.
    • The source code of the authorizer lives in com.chucuaz.authorizer package.

# Code design choices:

    • Language: I have chosen Java because it is a language cross-platform, it is stable, and has a great performance along with extensive documentation.
    • Build: OpenJDK or java version 1.8 to 18, no framework was needed.
    • Test: Due to the application was done in java pure, I just add an extra class with functions that run as tests, verify each rule and the behavior of the requirements.

# Build Instructions

The package can be built from the command line

** Building from the command line **

*Creating the release directory in /src*

    mkdir release

*Copy the manifest.txt file in release directory*

    cp manifest.txt release

*Compile the classes files from the package and put them in the release directory*

    javac org/*.java -d release

*Change to the release directory*

    cd release

*Create the jar file*

    jar cfvm auth.jar manifest.txt org

*Execute the app*

    java -jar auth.jar < operations

# Build Instructions for tests

The package can be built from the command line

** Building from the command line **

*Creating the debug directory in /src*

    mkdir debug

*Copy the manifest.txt file in debug directory*

    cp manifest.test debug/manifest.txt

*Compile the classes files from the package and put them in the debug directory*

    javac org/*.java test/*.java -d debug

*Change to the debug direcotry*

    cd debug

*Create the jar file*

    jar cfvm test.jar manifest.txt .

*Execute the app*

    java -jar test.jar

** Classes structure **

    +com
     +---chucuaz
         +---authorizer
    
    only in debug
    +test

**Patterns**:
undefined