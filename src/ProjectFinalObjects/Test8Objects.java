package ProjectFinalObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Test8Objects {

	private static WebElement element = null;
	
	//Careers - Browse Opportunities
	
	public static WebElement BrowseOpportunities(WebDriver driver) {
		element = driver.findElement(By.xpath("(//a[@href='/join-our-team'])"));
		return element;
	}
	
	public static WebElement ApplyNow(WebDriver driver) {
		element = driver.findElement(By.xpath("(//a[@href='/search'])[3]"));
		return element;
	}
	
	public static WebElement Apply(WebDriver driver) {
		element = driver.findElement(By.xpath("(//button[@class='button--apply button is-primary is-rounded'])[1]"));
		return element;
	}
	
	public static Select JobPosition(WebDriver driver) {
			Select	select = new Select(driver.findElement(By.xpath("(//*[@id='jobPosition'])")));
			return select;			
	}
	
	public static WebElement JobType(WebDriver driver) {
			element = driver.findElement(By.xpath("//*[@id=\"block-thicareers-content\"]/locations-map-app/div/div[2]/form/article/dialog/section/div/div[3]/div/div[2]/div/div/ul/li[2]/label"));
			return element;
		}
	 
	public static WebElement Availability(WebDriver driver) {
			element = driver.findElement(By.xpath("//*[@id=\"block-thicareers-content\"]/locations-map-app/div/div[2]/form/article/dialog/section/div/div[3]/div/div[3]/div/div/ul/li[2]/label"));
			return element;
		}
	
	public static WebElement Days(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"block-thicareers-content\"]/locations-map-app/div/div[2]/form/article/dialog/section/div/div[3]/div/div[4]/div/div/ul/li[1]/label"));
		return element;
	}		
	 
	public static WebElement HoursPerWeek(WebDriver driver) {
		element = driver.findElement(By.xpath("(//input[@id='hoursPerWeek'])"));
		return element;
	}		
	
	public static WebElement PayExceptation(WebDriver driver) {
		element = driver.findElement(By.xpath("(//input[@id='payExpectations'])"));
		return element;
	}		
	
	//personal information
	
	public static WebElement FirstName(WebDriver driver) {
		element = driver.findElement(By.xpath("(//input[@id='firstName'])"));
		return element;
	}	
	
	public static WebElement LastName(WebDriver driver) {
		element = driver.findElement(By.xpath("(//input[@id='lastName'])"));
		return element;
	}		
	
	public static WebElement StreetAddress(WebDriver driver) {
		element = driver.findElement(By.xpath("(//input[@id='address'])"));
		return element;
	}	
		
	public static WebElement City(WebDriver driver) {
		element = driver.findElement(By.xpath("(//input[@id='city'])"));
		return element;
	}	
	
	public static Select Province(WebDriver driver) {
		Select	select = new Select(driver.findElement(By.xpath("(//*[@id='state'])")));
		return select;			
	}
	
	public static WebElement Zipcode(WebDriver driver) {
		element = driver.findElement(By.xpath("(//input[@id='zipcode'])"));
		return element;
	}	
	
	public static WebElement PhoneNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("(//input[@id='phoneNumber'])"));
		return element;
	}	
	
	public static WebElement Email(WebDriver driver) {
		element = driver.findElement(By.xpath("(//input[@id='email'])"));
		return element;
	}		
	
	public static Select HowDidYouHear(WebDriver driver) {
		Select	select = new Select(driver.findElement(By.xpath("(//*[@id='referrerType'])")));
		return select;			
	}
	
	public static Select EducationLevel(WebDriver driver) {
		Select	select = new Select(driver.findElement(By.xpath("(//*[@id='educationLevel'])")));
		return select;			
	}
	
	public static WebElement Language(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"block-thicareers-content\"]/locations-map-app/div/div[2]/form/article/dialog/section/div/div[3]/div/div[19]/div/div/ul/li[1]/label"));
		return element;
	}	
	
	public static WebElement ApplytoSubmitApplication(WebDriver driver) {
		element = driver.findElement(By.xpath("(//button[@class='button is-primary is-rounded'])"));
		return element;
	}	
	
}
