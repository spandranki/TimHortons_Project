package ProjectFinalObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test10Objects {

	private static WebElement element = null;

	// Click on Instagram icon
	
	public static WebElement Insta(WebDriver driver) {
		element = driver.findElement(By.xpath("(//div[@class='indexth__IconBubble-lsqfno-12 jevrru'])[4]"));
		return element;
	}
	
}
