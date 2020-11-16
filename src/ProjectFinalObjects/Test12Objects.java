package ProjectFinalObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test12Objects {

	private static WebElement element = null;
	
	public static WebElement More(WebDriver driver) {
		element = driver.findElement(By.xpath("(//button[@class='nav-menu-itemth__NavMenuItem-x65s8r-0 fFWsUZ ignore-react-onclickoutside'])"));
		return element;
	}
	
	public static WebElement Nutrition(WebDriver driver) {
		element = driver.findElement(By.linkText("Nutrition"));
		return element;
	}
	
	public static WebElement ItemSearch(WebDriver driver) {
		element = driver.findElement(By.linkText("(//input[@id='hdr-search-field-1'])"));
		return element;
	}
	
	public static WebElement SearchButton(WebDriver driver) {
		element = driver.findElement(By.linkText("(//input[@id='product-search-btn'])"));
		return element;
	}
	
	
	
}
