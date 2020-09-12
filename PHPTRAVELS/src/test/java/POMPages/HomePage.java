package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Libraries.WebTools;

public class HomePage extends BasePage {
	@FindBy(xpath="(//li)[3]")
	private WebElement modules;


	@FindBy(id="logout")
	private WebElement lgOut;
	
	public HomePage(WebDriver driver, WebTools wTools) {
		super(driver, wTools);
	}

	public void clickModule() {
		wTools.clickElement(modules, "Modules");
	}
	
	public void clickLogOut() {
		wTools.clickElement(lgOut, "Log Out");
	}

}
