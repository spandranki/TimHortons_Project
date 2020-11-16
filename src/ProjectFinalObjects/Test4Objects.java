package ProjectFinalObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test4Objects {

	private static WebElement element = null;
	
	//Start order in 20min
	
	public static WebElement StartOrderIn20min(WebDriver driver) {
		element = driver.findElement(By.xpath("(//label[@class='styledth__Label-fxo5d0-3 jOZbBD'])[4]"));
		return element;
	}
	
	public static WebElement ClosePaymentPage(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"router-wrapper\"]/div/div/div/button/svg"));
		return element;
	}
	
}
