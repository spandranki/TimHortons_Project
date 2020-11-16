package ProjectFinalObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test6Objects {

	private static WebElement element = null;
	
	//cart button
	
	public static WebElement Cart(WebDriver driver) {
		element = driver.findElement(By.xpath("(//button[@class='cart-menu-buttonth__CartMenuButton-sc-1t0s979-0 iafevH ignore-react-onclickoutside'])"));
		return element;
	}
	
	public static WebElement CheckOut(WebDriver driver) {
		element = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB'])"));
		return element;
	}
	
	
}
