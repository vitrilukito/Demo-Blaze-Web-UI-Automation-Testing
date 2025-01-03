# Demo Blaze Web UI Automation Testing Framework

This repository contains the web UI automation test project for [Demo Blaze Product Store](https://www.demoblaze.com) e-commerce website. It is built using Cucumber, WebDriverManager, and Selenium, and aims to ensure the functionality of the homepage, login page, product page, signup page, contact page and cart. The repository includes source code for the project, POM implementation, Gherkin test cases, and Cucumber implementation, along with sample test cases.

## Table of Contents

- Technologies Used
- Project Structure
- Requirements
- Dependencies
- Installation
- Configurations
- Running Tests
- Test Cases

## Technologies Used

- **Java**: The primary programming language for the project.
- **Cucumber**: A testing tool that supports Behavior Driven Development (BDD) for defining test cases in Gherkin syntax.
- **Gradle**: A build automation tool used to manage dependencies and build the project.
- **Selenium**: A web automation tool for interacting with web applications.

## Project Structure

Here is the breakdown of the project structure:
- **login.feature**: Contains scenarios for testing the login functionality, including valid and invalid login attempts.
- **products.feature**: Tests the product page, such as displaying available products and adding them to the cart.
- **cart.feature**: Tests the shopping cart functionalities, including viewing items and removing products.
- **contact.feature**: Tests the functionality of the contact form.
- **home.feature**: Test the functionality of the category buttons and carousel slides in the homepage.
- **signup.feature**: Contains scenarios for testing the signup functionality, including valid and invalid signup attempts.
- **Models**: Encapsulate the interactions with the UI elements on each page, providing methods to perform actions (like clicking buttons, entering text) and verify page content.
- **Utility**: This includes classes for managing the WebDriver instance, handling configuration settings, and providing reusable methods for various tasks.
- **WebPage**: Each class defines the elements on the page and the methods that encapsulate interactions with those elements. The methods within these classes are called by step definitions in the Cucumber tests.
- **WebStep**: Contains the step definition classes for Cucumber scenarios. Each class corresponds to a feature file and implements the methods that define how to interact with the web application during testing.
- **CucumberTest**: This is used to generate reports in HTML and JSON files.
- **Hooks**: These are blocks of code that run before or after each scenario. They allow us to set up any preconditions or perform clean-up tasks after tests.

## Requirements

- [Java 8 or above](https://www.oracle.com/java/technologies/javaese-downloads.html)
- [IntelliJ IDEA](https://www.jetbrains.com/idea) or another Java IDE
- [Gradle](https://www.gradle.org/install/) for dependency management and build automation
- [JUnit](https://junit.org/junit5/)
- [RestAssured](https://rest-assured.io/)
- [Maven Repository](https://mvnrepository.com)
- [Cucumber](https:cucumber.io)
- [JSONValidator](https://github.com/json-schema-org./json-schema-validator)
- [Selenium Web Driver](https://www.selenium.dev/documentation/webdriver/)
- Browser: The latest version of Google Chrome with the latest version of the WebDriver installed

## Dependencies

The following dependencies are included in the project:

- testImplementation platform('org.junit:junit-bom:5.10.0')
- testImplementation 'org.junit.jupiter:junit-jupiter'
- testImplementation 'org.junit.vintage:junit-vintage-engine:5.7.2'
- implementation group: 'io.cucumber', name: 'cucumber-java', version: '7.20.1'
- implementation group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '4.27.0'
- testImplementation group: 'junit', name: 'junit', version: '4.13.2'
- testImplementation("io.github.bonigarcia:webdrivermanager:5.9.2")
- testImplementation group: 'io.cucumber', name: 'cucumber-junit', version: '7.20.1'
- testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.9.0'
- testImplementation group: 'org.assertj', name: 'assertj-core', version: '3.26.3'

## Installation

1. Clone the repository:
   git clone https://github.com/vitrilukito/Demo-Blaze-Web-UI-Automation-Testing
2. Install Gradle:
   Ensure you have Gradle installed on your machine. You can check if Gradle is installed by running: gradle -v. If not, you can install it by following the instructions on the [Gradle website](https://gradle.org/)
3. Install IntelliJIDEA.
4. Build the project on IntelliJIDEA.

## Configurations

To run this project, make sure you have the following configured:
1. **Java Development Kit (JDK)**: Install JDK 8 or higher on your machine. You can download it from the [Oracle website](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html) or use [OpenJDK](https://www.openjdk.java.net/install/).
2. **Gradle**: Ensure you have Gradle installed. You can install it following the instructions on the [Gradle website](https://gradle.org/install/).
3. **IntelliJ IDEA**: Use IntelliJ IDEA as your IDE for coding. You can download it from the [JetBrains website](https://jetbrains.com/idea/download/).
4. **Dependencies**: The project uses the following dependencies, which are included in the 'build.gradle' file:
   - JUnit
   - Selenium
   - Cucumber
   - Assertion 
  
After setting up these tools, you can run the tests and work on the project.

## Running Tests

You can run the tests in the project using the Gradle wrapper or directly from the IDE.

### Running via IDE

1. Navigate to the Runner class.
2. Right-click the class and select "Run" to execute the Cucumber feature.

### Running via Command Line
1. Use the Gradle command: ./gradlew test

## Test Cases

This project includes a total of 6 pages and 39 test cases categorized into:
- **Positive Test Cases**: Validate the successful execution of the homepage, login page, product page, signup page, cart and contact page with valid inputs.

**Sample of positive test case:**


<img width="546" alt="image" src="https://github.com/user-attachments/assets/e422fbbe-ffa8-46fb-a159-3bdd317e7795">



**Step Definitions:**
Here are the step definitions that implement the above test case:


<img width="520" alt="image" src="https://github.com/user-attachments/assets/b0e28c3b-9a6c-4173-81d2-29b95992ca03">



**Page Object:**
The WebPage class of the above test case is as below:


<img width="605" alt="image" src="https://github.com/user-attachments/assets/6f698fcb-04b3-44d6-aae8-50d210fe211e">
<img width="668" alt="image" src="https://github.com/user-attachments/assets/26711b62-9e73-4d3b-916d-00bc6f6c2373">



- **Negative Test Cases**: To ensure that the website behaves correctly in adverse conditions and can handle invalid inputs or unexpected user actions.

**Sample of negative test case:**


<img width="628" alt="image" src="https://github.com/user-attachments/assets/4f4484b5-b5ba-4009-bee6-ff8aae1bfce0">



**Step Definitions:**
Here are the step definitions that implement the above test case:


<img width="706" alt="image" src="https://github.com/user-attachments/assets/656317a4-e52f-4fad-a70f-2269ff3c4d6b">



**Page Object:**
The WebPage class of the above test case is as below:


<img width="887" alt="image" src="https://github.com/user-attachments/assets/e478d370-de54-4c7f-806c-c8269ac248ef">



- **Boundary Test Cases**: Ensure correct handling of boundary values, including invalid inputs.

**Sample of boundary test case:**


<img width="647" alt="image" src="https://github.com/user-attachments/assets/9664d31e-a293-48ba-bb20-e795d2a7021c">



**Step Definitions:**
Here are the step definitions that implement the above test case:


<img width="681" alt="image" src="https://github.com/user-attachments/assets/824e59ee-120e-4fac-be04-3d19b3d743dd">


**Page Object:**
The WebPage class of the above test case is as below:


<img width="747" alt="image" src="https://github.com/user-attachments/assets/647fe189-6f8b-4abf-8f4b-0ead2a84ed89">

The test cases are presented in 6 different files. You can view all the test cases here:
- [cart.feature](src/test/resources/features/cart.feature)
- [home.feature](src/test/resources/features/home.feature)
- [login.feature](src/test/resources/features/login.feature)
- [products.feature](src/test/resources/features/products.feature)
- [contact.feature](src/test/resources/features/contact.feature)
- [signup.feature](src/test/resources/features/signup.feature)

## Flaky Tests Disclaimer

*Issue Overview:*

Some of the tests in this repository have been identified as flaky, particularly those that depend on the timely loading of web pages. These tests may fail intermittently due to race conditions related to the asynchronous nature of web page loading. Specifically, when the website takes longer than expected to load, elements that the test interacts with may not be available within the initially defined timeout, resulting in a timeout error or element not found error.
An example of such a failure is captured in the screenshot below, which shows the error message when the page is not fully loaded before the test attempts to interact with a web element.

<img width="1385" alt="image" src="https://github.com/user-attachments/assets/c7b7c0f4-02b6-4cf5-a2f2-685072afbf58" />

### Solutions Implemented:

1. **Explicit Waits**: Using WebDriver's *WebDriverWait* to wait for elements to become visible before interacting with them.
<img width="1020" alt="image" src="https://github.com/user-attachments/assets/f97ade7e-2a6c-4d99-9dba-437720b88ff4" />

2. **Thread.sleep()**: Introducing controlled delays when necessary to account for page load variability.
<img width="542" alt="image" src="https://github.com/user-attachments/assets/2bb45caf-01b8-4d9d-8b81-7dc6c3ec58b2" />

3. **Page Refresh**: Refreshing the page in cases where elements are not correctly loaded or where stale elements are causing issues.
<img width="1061" alt="image" src="https://github.com/user-attachments/assets/67944d56-19ec-40a6-aace-d0d573a62719" />

4. **Increased Timeouts**: Extending timeout durations for waiting on elements to ensure sufficient time for loading.

The tests are still under active monitoring, and improvements will continue to be made to enhance their reliability.
