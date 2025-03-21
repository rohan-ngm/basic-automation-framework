# Automation

## Overview
This project is a Selenium-based automation framework using TestNG for testing. It is configured to run tests in parallel on multiple browsers.

## Prerequisites
- Java 8 or higher
- Maven 3.6.0 or higher

## Project Structure
- `pom.xml`: Maven configuration file with dependencies.
- `testNG.xml`: TestNG configuration file for running tests.
- `.gitignore`: Git ignore file to exclude unnecessary files from version control.

## Dependencies
- **TestNG**: 7.10.2
- **Selenium**: 4.25.0
- **WebDriverManager**: 5.9.3
- **SLF4J**: 2.0.16
- **Logback**: 1.5.16

## Running Tests
To run the tests, use the following Maven command:
```sh
mvn test