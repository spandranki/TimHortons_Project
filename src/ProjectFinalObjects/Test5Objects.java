package ProjectFinalObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test5Objects {

	private static WebElement element = null;
	
	// Choose delivery up option
	public static WebElement delivery(WebDriver driver) {
		element = driver.findElement(By.xpath("(//button[@class='styled-wrapper-button__StyledButton-sc-1sfisn8-0 kFjTER deliveryButton'])"));
		return element;
	}
	
	public static WebElement deiveryAddress(WebDriver driver) {
		element = driver.findElement(By.xpath("(//input[@class='base__StyledInput-sc-1glkhtz-7 gEoeUQ'])[2]"));
		return element;
	}
	
	public static WebElement phoneNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("(//input[@class='base__StyledInput-sc-1glkhtz-7 gEoeUQ'])[4]"));
		return element;
	}
	
	public static WebElement DeliverHereButton(WebDriver driver) {
		element = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB address-modal__StyledButton-sc-11nk7ey-3 dTksNK'])"));
		return element;
	}	
	
	
	
	
}
