# BigBasketTest
## Base Class
* Base.java

For Browser invokation one Base class is implemented, whatever test cases are there, they will inherit this Base class to invoke the browser as per the requirement
## properties File
* globalVariables.properties

For Global Variables declaration one properties file is implemented global variables like Browser, URL, Username & Password can be provided as key-value pair in this properties file
## PageObjectModel with Page Classes
* BeveragesSelectionPage.java
* LandingPage.java

Totally we've to work on 2 webpages for that pageobjectmodel with 2 Page classes is implemented Whatever the objects we are going to work with and methods for that objects are built in these pages
## Fetching data into Excel File
With the help of "ExcelUtility.java" we can fetch the data into excel file after test execution
## TestCase
* BigBasketTest.java

"BigBasketTest" is our actual testclass which has our test steps.
## pom.xml & testng.xml
pom.xml and testng.xml are implemented as per the requirement

## Test Results
For test results we will access the "index.html" file in "test-output" directory of the project

## Note
BigBasket front end development is done through "AngularJS".AngularJS applications can be automatable through "Protractor" tool.We can't automate them using Selenium,
that's why my approach in this assignment is different.Some objects are not at all getting identified with "Xpath", that's why i used Thread.sleep() and "Actions" class most of the times
to identify them.Because of objects not getting identified easily, i am unable to fetch some more data into Excel file.Please consider this.
