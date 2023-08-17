# MavenSeleniumTesting
Java Selenium POM (Page Object Model) project using Spring Boot for Dependency Injection


# Java Selenium Testing Project

This repository contains a Java Selenium testing project designed to demonstrate a practical approach to automated browser testing. With the power of Selenium and the robustness of Java, this project showcases tests that can be executed both within an IDE and via the command line using Maven.

Utilizing Dependency Injection and the Page Object Model, this project ensures a modular and maintainable codebase. These patterns enhance reusability, readability, and ease of testing, fostering a robust and efficient testing framework.

## Prerequisites

- Java JDK
- Maven
- Google Chrome Browser
- ChromeDriver

> **Note**: Ensure that you have the latest version of ChromeDriver installed, which should be compatible with the version of your Chrome browser.

## Getting Started

1. **Clone the Repository**
```
git clone https://github.com/Tyler-Marsh/MavenSeleniumTesting.git
```

2. **Navigate to the project directory**
```
cd path_to_project_directory
```

3. **Run the tests via Maven**
```
mvn clean test
```

## Generating Test Reports

After running the tests, you can generate a report using the following command:

```
mvn surefire-report:report
```

This will produce a report in `target/site/surefire-report.html`.

## Contributions

While this project is primarily a demonstration, contributions and suggestions are welcome. Please open an issue or submit a pull request if you have something to add!

## License
