package ProjectFinalObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test9Objects {

	private static WebElement element = null;

	// Click on More button
	public static WebElement more(WebDriver driver) throws InterruptedException {
		element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/nav/div/div[1]/button"));
		Thread.sleep(50);
		return element;
	}
	
	// Choose Contact us
	public static WebElement contactUs(WebDriver driver) throws InterruptedException {
		element = driver.findElement(By.linkText("Contact Us"));
		Thread.sleep(100);
		return element;
	}
	
	// Click on Facebook icon
	public static WebElement facebook(WebDriver driver) {
		element = driver.findElement(By.xpath("(//div[@class='indexth__IconBubble-lsqfno-12 jevrru'])[1]"));
		return element;
	}
	
	
}
