package finalProject;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32 (11)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 			 
		driver.get("https://www.timhortons.ca");				  
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB'])")).click();
		driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB right-navth__SignInLink-sc-17c5bjq-1 hFgsZG'])")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@class='base__StyledInput-sc-1glkhtz-7 gEoeUQ'])")).sendKeys("timhortonstesting@gmail.com");	
		driver.findElement(By.xpath("(//button[@class='styled__Button-sc-1dymple-0 hdnEMB'])")).click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("timhortonstesting@gmail.com");
		driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Tims@123");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("(//div[@class='xS'])")).click();
		driver.findElement(By.linkText("Log in / Connectez-vous")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
}
