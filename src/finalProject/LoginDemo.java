package finalProject;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginDemo {
	
	WebDriver driver;
		
	@Test
	 public void test1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32 (15)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.combyne.ag/login");				  
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@class='Input_input__3544m'])[1]")).sendKeys("sameera.p");
		
	  }
	

  @Test
  public void test2() {
	  
	  
	  
  }
 
}
