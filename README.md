README: Fitpeo Selenium Automation Script
Overview
This project demonstrates the use of Selenium WebDriver for
automating interactions with a web application. The script automates
various tasks on the Fitpeo website, including interacting with
sliders, input fields, checkboxes, and verifying the output of
calculations.
The script is written in Java and is suitable for beginners learning
Selenium WebDriver. It highlights key functionalities such as locating
elements, interacting with them, scrolling the webpage, and
performing validations.
Prerequisites
Before running this script, ensure you have the following installed:
1. Java Development Kit (JDK): Version 8 or higher.
2. Eclipse IDE or any preferred Java IDE.
3. Selenium WebDriver: Ensure the chromedriver executable is
compatible with your installed version of Google Chrome.
4. Google Chrome Browser: Ensure it is up-to-date.
5. Maven or Selenium JAR files: Add Selenium dependencies or
import the JAR files into your project.
Setup Instructions
1. Download the ChromeDriver:
- Download the appropriate version of ChromeDriver for your Chrome
browser from https://chromedriver.chromium.org/.
- Extract the file and copy the path of the chromedriver executable.
2. Configure the Script:
- Update the path to the ChromeDriver executable in the line:
System.setProperty("webdriver.chrome.driver",
"PATH_TO_CHROMEDRIVER");
- Replace PATH_TO_CHROMEDRIVER with the copied path.
3. Run the Script:
- Open your Java IDE and import the Selenium JAR files or set up
Maven dependencies.
- Copy and paste the provided Java code into your IDE.
- Execute the script by running the `main` method.
Features Demonstrated
- Launching a Chrome browser and navigating to the Fitpeo website.
- Clicking buttons and interacting with sliders using Actions class.
- Scrolling through the webpage with JavaScript Executor.
- Entering values in input boxes and validating their correctness.
- Selecting checkboxes and verifying the calculated results.
Expected Output
The script validates the slider value and the reimbursement header
text displayed on the webpage. If the values match the expected
ones, the script prints validation success messages in the console.
Note:
This script is a beginner-friendly example and may require
adjustments for changes in the Fitpeo website structure.
