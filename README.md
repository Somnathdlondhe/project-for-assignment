# Selenium Automation with Java and TestNG

This project demonstrates automation testing using Selenium WebDriver, Java, and the TestNG framework.

## Prerequisites

1. Install **Java JDK** (version 8 or higher).
   - [Download Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
   - Verify installation:
     ```bash
     java -version
     ```

2. Install **Apache Maven**.
   - [Download Apache Maven](https://maven.apache.org/download.cgi)
   - Verify installation:
     ```bash
     mvn -version
     ```

3. Install a web browser (e.g., Google Chrome, Firefox).

4. Download the corresponding **WebDriver** for your browser:
   - [ChromeDriver](https://sites.google.com/chromium.org/driver/)
   - [GeckoDriver for Firefox](https://github.com/mozilla/geckodriver/releases)

## Project Setup

1. **Clone the Repository**:
   ```bash
   git clone [https://github.com/yourusername/your-repo.git](https://github.com/Somnathdlondhe/project-for-assignment.git)
   cd your-repo

   
Project Structure:
   YourProject
│
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── yourpackage
│   │               ├── pages
│   │               │   ├── HomePage.java
│   │               │   └── LoginPage.java
│   │               └── utils
│   │                   └── WebDriverManager.java
│   │
│   └── test
│       └── java
│           └── com
│               └── yourpackage
│                   ├── tests
│                   │   ├── LoginTest.java
│                   │   └── HomeTest.java
│                   └── testng.xml
│
└── pom.xml
