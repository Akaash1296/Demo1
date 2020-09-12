package Libraries;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebTools {

	public WebDriver driver;
	public JavascriptExecutor js;
	public WebDriverWait wait;
	
	public WebTools(WebDriver driver) {
		this.driver = driver;
		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, 20);
	}
	
	public void clickElement(WebElement element, String Name) {
	      if(wait.until(ExpectedConditions.elementToBeClickable(element)).isDisplayed()) {
	    	  System.out.println("Clicking on " + Name);
	    	 element.click();
	      }
	      else {
	    	  System.out.println("Unable to click the " + Name);
	    	  Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(element))==null);
	      }
	}
	
	public void typeText(WebElement element, String Name, String value) {
	      if(wait.until(ExpectedConditions.elementToBeClickable(element)).isDisplayed()) {
	    	 System.out.println("Enter the value into " + Name);
	    	 element.sendKeys(value);
	    	 System.out.println("The user is able to type " + value + " into " + Name);
	    	 
	      }
	      else {
	    	  System.out.println("User is unable to type " + value + " into " + Name);
	    	  Assert.fail("User is unable to type " + Name);
	      }
	}
	
}
