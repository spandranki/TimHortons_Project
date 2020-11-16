package ProjectFinalObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Test13Objects {

	private static WebElement element = null;
	
	public static WebElement Menu(WebDriver driver) {
		element = driver.findElement(By.xpath("(//img[@class='menu-item tagged'])[4]"));
		return element;
	}
	
	public static WebElement Breakfast(WebDriver driver) {
		element = driver.findElement(By.xpath("(//a[@href='/ca/en/menu/breakfast.php'])[1]"));
		return element;
	}
	
	public static WebElement ItemSandwich(WebDriver driver) {
		element = driver.findElement(By.xpath("(//div[@class='product-title'])[1]"));
		return element;
	}
	
	public static WebElement NutritionInfo(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"accordion-2597\"]/a/div/div"));
		return element;
	}
	
	 public static Select Variety(WebDriver driver) {			
			Select	select = new Select(driver.findElement(By.xpath("//*[@id=\"nutsnap-variety-select\"]")));
			return select;
		
	}
	
	 public static WebElement FullNutritionInfo(WebDriver driver) {
			element = driver.findElement(By.xpath("(//a[@id='seeButton'])"));
			return element;
	}
	 
	 
}
