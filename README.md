# Toqio Website QA Automation Project 

This project contains automated tests for the Toqio website (https://toqio.co/) using Selenium WebDriver with Java, Cucumber, and JUnit.

## Project Structure

```
src
├── test
│   ├── java
│   │   ├── pages
│   │   │   └── HomePage.java
│   │   ├── stepdefinitions
│   │   │   └── HomePageSteps.java
│   │   └── runners
│   │       └── TestRunner.java
│   └── resources
│       └── features
│           └── homepage.feature
```

## Prerequisites

- Java 17
- Maven
- IntelliJ IDEA (recommended)
- Chrome and Firefox browsers
- ChromeDriver and GeckoDriver (ensure they are in your system PATH)

## Setup

1. Clone this repository:
   ```
   git clone https://github.com/your-username/toqio-qa-automation.git
   ```

2. Open the project in IntelliJ IDEA.

3. Ensure that the project is using Java 17. You can check this in File > Project Structure > Project.

4. Allow Maven to download all the necessary dependencies.

## Running the Tests

You can run the tests in two ways:

1. Using the TestRunner class:
   - Navigate to `src/test/java/runners/TestRunner.java`
   - Right-click on the file and select "Run 'TestRunner'"

2. Using Maven:
   - Open a terminal in the project root
   - Run the command: `mvn test`

## Adding New Tests

1. Create new feature files in `src/test/resources/features/`
2. Implement step definitions in `src/test/java/stepdefinitions/`
3. Add new page objects in `src/test/java/pages/` as needed

## Reporting

After running the tests, you can find the Cucumber reports in the `target` directory.

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE.md file for details.
 
 
