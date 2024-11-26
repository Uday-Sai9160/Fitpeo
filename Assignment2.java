package Fitpeo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\kanug\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.fitpeo.com/");

	    driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();

	    Thread.sleep(2000);
	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");

	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]")).click();

	    Actions a = new Actions(driver);

	    for (int i = 0; i <= 623; i++) {
	        a.keyDown(Keys.ARROW_RIGHT).keyUp(Keys.ARROW_RIGHT).perform();
	    }
	    Thread.sleep(2000);

	    WebElement inputBox = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/div/div/div/div/input"));

	    // Clear the input box
	    for (int i = 0; i < 3; i++) {
	    	
	        inputBox.sendKeys(Keys.BACK_SPACE);
	    }
	    Thread.sleep(3000);

	    // Set the slider value to 560
	    inputBox.sendKeys("560");
	    Thread.sleep(2000);
	    // Retrieve the value from the text box
	    String sliderValue = inputBox.getAttribute("value");

	    // Validate the slider value
	    if (sliderValue.equals("560")) {
	        System.out.println("Validation Passed: Slider value is " + sliderValue);
	    } else {
	        System.out.println("Validation Failed: Expected value was 560, but found " + sliderValue);
	    }
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]")).click();

	    Actions b = new Actions(driver);
	    Thread.sleep(1000);
	    for (int i = 0; i <= 263; i++) {
	    //	Thread.sleep(1000);
	    	
	        b.keyDown(Keys.ARROW_RIGHT).keyUp(Keys.ARROW_RIGHT).perform();
	    }

	    
	    Thread.sleep(1000);
	    ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,400)");

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[11]/p[1]"));
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/label/span[1]/input")).click();
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/label/span[1]/input")).click();
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/label/span[1]/input")).click();
	    Thread.sleep(1000);
	    ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,400)");

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[8]/label/span[2]"));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[8]/label/span[1]/input")).click();
		
	    
	    WebElement reimbursementHeader = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/p[4]"));

        // Retrieve the text of the header
        String headerText = reimbursementHeader.getText();

        // Expected value
        String expectedText = "Total Recurring Reimbursement for all Patients Per Month: $110700";

        if (expectedText.equals("Total Recurring Reimbursement for all Patients Per Month: $110700")) {
            System.out.println("Validation Passed: " + headerText);
        } else {
            System.out.println("Validation Failed: Expected '" + expectedText + "' but found '" + headerText + "'");
        }

        Thread.sleep(3000);
        driver.quit();
	}

}
