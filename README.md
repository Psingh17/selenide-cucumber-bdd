# Selenide Cucumber BDD Framework

This is a lightweight UI automation testing framework built using **Selenide**, **Cucumber (BDD)**, **TestNG**, and **Allure Reporting**. It demonstrates a modular test structure with Page Object Model (POM) and supports multiple environments and tagging strategies.

---

## Features

- ✅ Selenide for concise and fluent browser automation
- ✅ Cucumber BDD with readable feature files
- ✅ TestNG as the test runner
- ✅ Allure reporting with screenshot capture on failure
- ✅ Page Object Model (POM) design pattern
- ✅ Environment and browser configuration via `config.properties`
- ✅ Tag-based test execution support (`@regression`, `@smoke`, `@sanity`)
- ✅ Supports browser execution via Maven parameters (`chrome`, `edge`, `firefox`)

---

## 💠 Tech Stack

| Tool           | Purpose                        |
|----------------|--------------------------------|
| Selenide       | UI automation wrapper over Selenium WebDriver |
| Cucumber       | BDD framework for writing tests in Gherkin |
| TestNG         | Test runner with parallel/test suite support |
| Allure         | Rich, interactive test reporting |
| Maven          | Build and dependency management |

---

## 📁 Project Structure

```
.
├── src
│   ├── test
│   │   ├── java
│   │   │   ├── hooks               # Test setup and teardown
│   │   │   ├── pages               # Page Object classes
│   │   │   ├── stepdefs            # Step Definitions
│   │   │   ├── utils               # Utility classes (e.g., ConfigReader)
│   │   │   └── runner              # Test runner class
│   │   └── resources
│   │       ├── features           # Cucumber .feature files
│   │       └── config.properties  # Central config (base URL, etc.)
└── pom.xml                        # Maven build file
```

---

## 🔧 Setup Instructions

### Prerequisites

- Java 17+
- Maven installed and configured
- Git installed

---

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/Psingh17selenide-cucumber-bdd.git
cd selenide-cucumber-bdd
```

---

### 2️⃣ Configure Properties

Update `src/test/resources/config.properties`:
```properties
base.url=https://automationexercise.com
```

---

### 3️⃣ Run Tests with Maven

#### Run all tests:
```bash
mvn test
```

#### Run specific tag (e.g., `@regression`):
```bash
mvn test -Dcucumber.filter.tags="@regression"
```

#### Run in a specific browser:
```bash
mvn test -Dselenide.browser=firefox
```

---

### 4️⃣ Generate Allure Report

#### Generate & view:
```bash
allure serve target/allure-results
```

OR

```bash
allure generate target/allure-results --clean -o target/allure-report
allure open target/allure-report
```

---

## 📸 Screenshots on Failure

Screenshots are automatically attached to the Allure report on test failure using:

```java
@Attachment(value = "Screenshot on Failure", type = "image/png")
public byte[] saveScreenShotOnFailure() {
    return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
}
```

---

## ✅ Sample Tags

| Feature File        | Tags Applied          |
|---------------------|-----------------------|
| `home.feature`      | `@regression @sanity` |
| `contact_us.feature`| `@smoke`             |
| `product.feature`   |                      |

---

## 👨‍💼 Author

**Pranav Singh**  
️📧 [pranavsingh007@gmail.com](mailto:pranavsingh007@gmail.com)  
🔗 [github.com/Psingh17](https://github.com/Psingh17)

---

