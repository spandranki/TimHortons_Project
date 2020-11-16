package finalProject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import finalProject.Login;

public class TC14 {

			public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32 (15)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 			 
			driver.get("https://demo.combyne.ag/login");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("(//input[@class='Input_input__3544m'])[1]")).sendKeys("sameera.p");
			
		
			  
	}

}
