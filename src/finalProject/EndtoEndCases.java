package finalProject;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EndtoEndCases {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
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
		
		//1st test case "Order to pick up"
		
	//	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/nav/div/div[1]/a[2]")).click();
		
		driver.findElement(By.linkText("Order")).click();
	//	driver.findElement(By.className("link__Link-w4dtv0-0 base__StyledLink-zd37bd-0 indexth__StyledLink-sc-1kd6zkd-0 HKbAY")).click();
		
	//	driver.findElement(By.xpath("(//a[@class='link__Link-w4dtv0-0 base__StyledLink-zd37bd-0 indexth__StyledLink-sc-1kd6zkd-0 HKbAY'])")).click();
	//	driver.findElement(By.xpath("(//a[@href='/store-locator/service-mode'])")).click();
				
		//Write a valid address in the address field
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"storelocator-input\"]")).sendKeys("1255 Boulevard Robert-Bourassa, Montreal, QC, Canada");
		driver.findElement(By.xpath("//*[@id=\"result-item-0\"]/button")).click();
		//Choose the first store
		driver.findElement(By.xpath("(//button[@class='action-button__Button-sc-10odr36-0 CmmsP styled__OrderHereOrSelectStoreButton-sc-1mbmdoa-9 styledth__OrderHereOrSelectStoreButton-sc-181hdr-5'])[1]")).click();
		
	}
}
