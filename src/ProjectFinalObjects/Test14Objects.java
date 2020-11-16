package ProjectFinalObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test14Objects {

	private static WebElement element = null;
	
	public static WebElement CompleteTheSurvey(WebDriver driver) {
		element = driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB callToActionWidget__CallToActionButton-rmmc4i-5 kcRWZk'])[3]"));
		return element;
	}
	
	public static WebElement SurveyCode(WebDriver driver) {
		element = driver.findElement(By.xpath("(//input[@id='CN1'])"));
		return element;
	}
	
	public static WebElement StartSurvey(WebDriver driver) {
		element = driver.findElement(By.xpath("(//input[@id='NextButton'])"));
		return element;
	}
	
	
}
