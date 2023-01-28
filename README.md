# Unosquare Challenge

This is a modularized project of WEB UI testing and API testing.

Where the API module is being consumed in order to obtain information that will be used in UI tests.

For more information, you can review more information in the README file of each module.

qa-web/README.md

qa-api/README.md

Basic tips:

# JAVA
Java required: 11

You can download it from [here](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
* It may be necessary to install Rosetta to continue with the Java 11 installation.

* Rosetta enables Intel-based features to run on Apple Silicon Macs.

To validate that you have java installed, open terminal and execute

```
java -version
```
## GRADLE WRAPPER
Currently to run automation project is not need to install gradle. You can use gradle-wrapper
Just add "./gradle" for any command

-E.g:
  ```
  ./gradlew runControlPanel
  ```

Note. Make sure to user ./gradlew if gradle was not installed on your local. Otherwise install gradle to use only gradle.


## GRADLE INSTALLATION(Optional)
Gradle v.7.4 or superior

*Tip* Verify your installation:
Open a console (or a Windows command prompt) and run

To launch the web UI project, use the following command:

    ./gradle clean runWeb

Current Browsers supported:

## Chrome
This framework downloads the Chrome selenium webDriver automatically according to the version of chrome you have installed.~~**~~**
