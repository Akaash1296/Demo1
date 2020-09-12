package TestCases;

import org.testng.annotations.Test;

import Libraries.BaseTests;
import POMPages.HomePage;

public class TC001 extends BaseTests {


	@Test
	public void testTC001() throws InterruptedException {
		HomePage h = new HomePage(driver, wTools);	
		Thread.sleep(1000);
		h.clickModule();
		Thread.sleep(1000);
		
		
	}
}
