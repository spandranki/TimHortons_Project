package ProjectFinalObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Test3Objects {

	
private static WebElement element = null;
	
	
	public static WebElement More(WebDriver driver) {
	
		element = driver.findElement(By.xpath("(//button[@class='nav-menu-itemth__NavMenuItem-x65s8r-0 fFWsUZ ignore-react-onclickoutside'])"));
		return element;
	}
	
	public static WebElement TimCard(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//a[@href='tim-card'])"));
		return element;
	}
	
	public static WebElement BuyNow(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB callToActionWidget__CallToActionButton-rmmc4i-5 kcRWZk'])[2]"));
		return element;
	}
	
	public static WebElement DigitalTimCard(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//a[@href='/ca/en/timcard/egift-tim-card.php'])[1]"));
		return element;
	}
	
	public static WebElement RecipientName(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@id='email_recipient_name'])"));
		return element;
	}	
	
	public static WebElement RecipientEmail(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@id='email_recipient_email'])"));
		return element;
	}	
	
	public static WebElement AddToCart(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@id=\\\"delivery-info\\\"]/div/a[2]/span"));
		return element;
	}	
	
	public static WebElement CheckOut(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@id=\"control\"]/a[2]/span"));
		return element;
	}	
	
	public static WebElement CreditCard(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@id=\"control\"]/a[2]/span"));
		return element;
	}	

	public static WebElement NameOnCard(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@id='cc_name'])"));
		return element;
	}	
	
	public static WebElement CVD(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@id='cc_cvd'])"));
		return element;
	}	

	public static WebElement Address(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@id='cc_address'])"));
		return element;
	}	
	
	public static WebElement City(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@id='cc_city'])"));
		return element;
	}		
	
	 public static Select Province(WebDriver driver) {
			
			Select	select = new Select(driver.findElement(By.xpath("(//*[@id='cc_state'])")));
			return select;
			
			}
	 public static WebElement ZipCode(WebDriver driver) {
			
			element = driver.findElement(By.xpath("(//input[@id='cc_zip'])"));
			return element;
		}	
	
	 public static WebElement BillingPhone(WebDriver driver) {
			
			element = driver.findElement(By.xpath("(//input[@id='cc_phone'])"));
			return element;
		}	

	 public static WebElement Email(WebDriver driver) {
			
			element = driver.findElement(By.xpath("(//input[@id='cc_email'])"));
			return element;
		}	

	
	
	
	
	
	
	
}
