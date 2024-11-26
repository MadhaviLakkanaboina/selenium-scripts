package Program;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// Declare the WebDriver is global variable 
		WebDriver driver;
		
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		//	 Navigate to FitPeo homepage
		 driver.get("https://www.fitpeo.com");
		 
		// Maximize browser window
		 driver.manage().window().maximize();
		 
		 //Declare the implicitly wait ,it wait for element is present
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
      // Navigate to the Revenue Calculator Page
		 driver.findElement(By.xpath("//div[contains(text(),'Revenue Calculator')]")).click();
		 //create the object for Actions class 
		 Actions ac = new Actions(driver);
		 // Scroll down the page until slider is visible
		 ((RemoteWebDriver)driver).executeScript("window.scrollBy(0, 500)","");
		 
		 // inspect the slider and store in to reference variable
		 
		WebElement slider = driver.findElement(By.xpath("//span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-1sfugkh']"));
		
	
		//	Wait for the page to load
		Thread.sleep(2000);
		// Adjust the slider into 820
		 ac.dragAndDropBy(slider, 93, 0).build().perform();
		 
		 ac.moveToElement(slider).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).perform();
		// Wait for the page to load
		 Thread.sleep(2000);
		 
		  // inspect the text field and store in to reference variable
		 WebElement ele =  driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-129j43u']"));
		// click on text field
		 ele.click();
		 // clear the text filed 
		 ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
		 // Adjust the slider into 560 
		 ac.dragAndDropBy(slider, 84, 0).build().perform();

	 ac.moveToElement(slider).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).perform();

	 // Wait for the page to load
		 Thread.sleep(2000);
	 
		 
			 
		// Scroll the page until the check boxes are visible
		 ((RemoteWebDriver)driver).executeScript("window.scrollBy(0, 1000)","");
		
		 //Wait for the page to load
		 Thread.sleep(2000);
		 
	// select the check boxes 
			WebElement checkbox= driver.findElement(By.xpath("//div[@class='MuiBox-root css-rfiegf']//div[1]//label[1]//span[1]//input[1]"));
		checkbox.click();
		
		WebElement checkbox1 = driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']//div[2]//label[1]//span[1]//input[1]"));
		
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.xpath("//div[3]//label[1]//span[1]//input[1]"));
		checkbox2.click();
		WebElement checkbox3 = driver.findElement(By.xpath("//div[8]//label[1]//span[1]//input[1]"));
		checkbox3.click();
		// validate the Recurring Reimbursement
		
		Assert.assertEquals(true, false);

		
		
		
	
	 
     
		 
		 
		
		 
	
		 
		 
		 

	}

}
