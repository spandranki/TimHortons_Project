package ProjectFinalObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Test1Objects {

	private static WebElement element = null;

	// Click on Ordering button
	public static WebElement order(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/nav/div/div[1]/a[2]"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return element;
	}

	// Choose pick up option
	public static WebElement pickUp(WebDriver driver) {
		element = driver.findElement(By.xpath("(//span[@class='prompts__TextWrapper-krlgo-0 gQnDgj'])[2]"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return element;
	}

	// Write a valid address in the address field
	public static WebElement adress(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"storelocator-input\"]"));
		return element;
	}

	// Choose the desired address
	public static WebElement chooseAdress(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("//*[@id=\"result-item-0\"]/button"));
		return element;
	}

	// Choose the second store
	public static WebElement chooseStore(WebDriver driver) throws InterruptedException {
		Thread.sleep(200);
		element = driver.findElement(By.xpath("//*[@id=\"store-locator-tabpanel-0\"]/div/div/div[2]/div/div[3]/div/p"));
		return element;
	}

	// Order here
	public static WebElement orderHere(WebDriver driver) throws InterruptedException {
		Thread.sleep(200);
		element = driver.findElement(By.xpath(
				"(//button[@class='styled__Button-sc-1dymple-0 kvCGeG styled__OrderHereOrSelectStoreButton-sc-1mbmdoa-9 styledth__OrderHereOrSelectStoreButton-sc-181hdr-5 kKzGDO'])[2]"));
		return element;
	}

	// Take-out option
	public static WebElement takeOut(WebDriver driver) throws InterruptedException {
		Thread.sleep(50);
		element = driver
				.findElement(By.xpath("/html/body/reach-portal/div[3]/div/div/div/div/div/div/button[1]/div/h4"));
		return element;
	}

	// choose items from the menu
	public static WebElement chooseItem(WebDriver driver) throws InterruptedException {
		Thread.sleep(200);
		element = driver.findElement(By.linkText("Coffee"));
		return element;
	}

	// Add item to cart
	public static WebElement addToCart(WebDriver driver) throws InterruptedException {
		Thread.sleep(200);
		element = driver
				.findElement(By.xpath("//*[@id=\"router-wrapper\"]/div/div/div/main/div[2]/div[2]/div/div[2]/button"));
		return element;
	}
	
	
}
