package ProjectFinalObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

	private static WebElement element = null;
	
	
	public static WebElement Apply(WebDriver driver) {
	
		element = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB'])"));
		return element;
	}
	
	public static WebElement LoginButton(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB right-navth__SignInLink-sc-17c5bjq-1 hFgsZG'])"));
		return element;
	}
		
	public static WebElement EmailAddress(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='base__StyledInput-sc-1glkhtz-7 gEoeUQ'])"));
		return element;
	}
	
	public static WebElement Signin(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB'])"));
		return element;
	}
	
	public static WebElement GmailLoginfield(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		return element;
	}
	
	public static WebElement GmailLoginNext(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])"));
		return element;
	}
	
	public static WebElement GmailPwd(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		return element;
	}
		
	public static WebElement PwdNext(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]"));
		return element;
	}
	
	public static WebElement ClickOnEmail(WebDriver driver) {
		
	//	element = driver.findElement(By.linkText("Tim Hortons"));
		element = driver.findElement(By.xpath("(//td[@class='yX xY '])[1]"));
		return element;
	}		

	public static WebElement LoginLinkText(WebDriver driver) {
		
		element = driver.findElement(By.linkText("Log in / Connectez-vous"));
		return element;
	}		
}

