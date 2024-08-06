
## Testing Scope: 

The scope of testing is focused on the front-end application of the Amazon.co.uk website using the BDD methodology. The framework has the capabilities like reporting, logging, screenshot capture on failure, and assertions. 

## Prerequisites: 
JDK 1.8, Eclipse(IDE), Maven

## Dependencies to be installed: 
- Cucumber-Java
- 	Cucumber-Junit
- 	Selenium-Java
- 	Cucumber-Reporting
- 	ApacheLog4j Core
- 	ApacheLog4j API	

## File Functionalities: 

- **Mobile.feature** -  To write and maintain all the feature files using Gherkin syntax
- **StepDefintion.java**  - To write and maintain all the test cases that align with the feature file
- **HomePage.java** - To maintain the web elements related to the Homepage actions
- **PhonePage.java** - To maintain the web elements related to Phonepage actions
- **AssertionPage.java** - To maintain the web elements related to the verification (assertion)
- **Hooks.java** - To take screenshot after the failure steps in the scenario
- **BaseClass.java** - To maintain the methods that are reusable
- **TestRunner.java** - To execute the test cases & to provide a report on the results.



