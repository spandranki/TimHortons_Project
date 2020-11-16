package ProjectFinalObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Test11Objects {

	private static WebElement element = null;
	
	//Contact Us
	
	public static WebElement ContactUs(WebDriver driver) {
		element = driver.findElement(By.xpath("(//a[@href='/contact-us'])"));
		return element;
	}

	public static WebElement ViewOurFAQs(WebDriver driver) {
		element = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB callToActionWidget__CallToActionButton-rmmc4i-5 kcRWZk'])[1]"));
		return element;
	}
	
	
}
