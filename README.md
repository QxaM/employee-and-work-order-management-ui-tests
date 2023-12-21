# MaxQ Work Manager - UI Tests

This repository is a codebase for UI testing a MaxQ Work Manager application.
Application can be found directly below. This repository focuses on 
functional UI tests of an application. It runs tests using GitHub Actions CI 
environment in 4 different browsers - Chrome, Firefox, Edge and Safari.

## 🌐 Demo
[MaxQ Work Manager Repository](https://github.com/QxaM/employee-and-work-order-management-ui-tests)

[MaxQ Work Manager Demo](https://work-manager-jp4bempx6a-lm.a.run.app)

Application is hosted serverless using Google Cloud Platform and Cloud Run.
Deployed automatically with GitHub Actions.

**Demo Credentials (If applicable):**
- **Username:** ReplaceThisWithUsername
- **Password:** ReplaceThisWithPassword

## ✔️ UI Tests

### ✔️ Chrome 
![GitHub Workflow Status (with event)](https://img.shields.io/github/actions/workflow/status/QxaM/employee-and-work-order-management-ui-tests/chrome-test.yaml?label=Chrome%20UI%20Tests)
![Static Badge](https://img.shields.io/badge/Allure-blue?logo=Google%20Chrome&logoColor=black&link=https%3A%2F%2Fqxam.github.io%2Femployee-and-work-order-management-ui-tests%2Fchrome)

### ✔️ Firefox
![GitHub Workflow Status (with event)](https://img.shields.io/github/actions/workflow/status/QxaM/employee-and-work-order-management-ui-tests/firefox-test.yaml?label=Firefox%20UI%20Tests)
![Static Badge](https://img.shields.io/badge/Allure-orange?logo=firefox&logoColor=black&link=https%3A%2F%2Fqxam.github.io%2Femployee-and-work-order-management-ui-tests%2Ffirefox)

### ✔️ Edge
![GitHub Workflow Status (with event)](https://img.shields.io/github/actions/workflow/status/QxaM/employee-and-work-order-management-ui-tests/edge-test.yaml?label=Edge%20UI%20Tests)
![Static Badge](https://img.shields.io/badge/Allure-lightblue?logo=microsoftedge&logoColor=black&link=https%3A%2F%2Fqxam.github.io%2Femployee-and-work-order-management-ui-tests%2Fedge)

### ✔️ Safari
![GitHub Workflow Status (with event)](https://img.shields.io/github/actions/workflow/status/QxaM/employee-and-work-order-management-ui-tests/safari-test.yaml?label=Safari%20UI%20Tests)

Safari Allure reports are not available since GitHub Action allure reporter 
cannot post from macOS environment - see Gradle Scan for [Safari Action](https://github.com/QxaM/employee-and-work-order-management-ui-tests/actions/workflows/safari-test.yaml):

## 📖 About this Software

The UI tests are written using Java and Selenium Webdriver. Reporting is 
achieved using Allure Reports and hosted on repository GitHub pages (links 
to actual reports above).

Tests are run in GitHub Actions runners environments using Selenium 
Standalone docker images. Safari tests are run using preinstalled Safari and 
macOS 13.

Tests use a Page Object Model and Test Steps to model page models and page 
test steps. Tests are run using JUnit.

### Features tested:

1. **User can open dashboard**
2. **Application name is present on header**
3. **Author name is present on footer**