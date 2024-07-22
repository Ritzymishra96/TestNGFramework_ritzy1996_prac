QKart Automation Framework
This repository contains an automation framework for testing the QKart commercial website. 
The framework is built from scratch using the Page Object Model (POM) design pattern and utilizes various tools and libraries such as
TestNG, Maven, log4j, Apache POI, and Extent Report.

QKart project-root/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── base/
│   │   │   │   └── BaseClass.java
│   │   │   ├── QkartPageEvent/
│   │   │   │   └── PageEventClass.java
│   │   │   ├── QKartPageObjects/
│   │   │   │   └── PageObjectClass.java
│   │   │   ├── utils/
│   │   │   │   └── UtilityClass.java
│   │   ├── resources/
│   │       └── log4j.properties
│   │       └── config.properties
│   ├── test/
│       ├── java/
│       │   └── testCases/
│       │       └── TestCaseClass.java
│       └── resources/
│           └── test-data/
│               └── testData.xlsx
├── testNG.xml
├── extent-config.xml
├── pom.xml
└── README.md


Tools and Libraries Used
TestNG: For test execution and reporting.
Maven: For build and dependency management.
log4j: For logging.
Apache POI: For reading and writing Excel files.
Extent Report: For generating detailed test reports.
