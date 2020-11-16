package ProjectFinalObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test2Objects {

	private static WebElement element = null;

	// Choose Delivery option
	public static WebElement deliver(WebDriver driver) {
		element = driver.findElement(By.xpath("(//span[@class='prompts__TextWrapper-krlgo-0 gQnDgj'])[1]"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return element;
	}

	// Write a valid address in the address field
	public static WebElement adress(WebDriver driver) {
		element = driver.findElement(By.id("autocomplete-address-4-input"));
		return element;
	}

	// Choose the desired address
	public static WebElement chooseAdress(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"result-item-0\"]/button"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return element;
	}

	// Write a valid tel. number
	public static WebElement telNo(WebDriver driver) throws InterruptedException {
		element = driver.findElement(By.xpath("//*[@id=\"floating-label-input-9\"]"));
		Thread.sleep(100);
		return element;
	}

	// Click on Deliver Here
	public static WebElement deliverHere(WebDriver driver) throws InterruptedException {
		element = driver
				.findElement(By.xpath("/html/body/reach-portal/div[3]/div/div/div/div/div/div/div/form/button"));
		return element;
	}

	
	
}
