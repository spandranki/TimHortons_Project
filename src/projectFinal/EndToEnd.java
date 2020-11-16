package projectFinal;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ProjectFinalObjects.LoginPage;
import ProjectFinalObjects.Test10Objects;
import ProjectFinalObjects.Test11Objects;
import ProjectFinalObjects.Test12Objects;
import ProjectFinalObjects.Test13Objects;
import ProjectFinalObjects.Test14Objects;
import ProjectFinalObjects.Test15Objects;
import ProjectFinalObjects.Test1Objects;
import ProjectFinalObjects.Test2Objects;
import ProjectFinalObjects.Test3Objects;
import ProjectFinalObjects.Test4Objects;
import ProjectFinalObjects.Test5Objects;
import ProjectFinalObjects.Test6Objects;
import ProjectFinalObjects.Test8Objects;
import ProjectFinalObjects.Test9Objects;

public class EndToEnd {
	
	WebDriver driver;
	
	@BeforeTest
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sameera\\Downloads\\chromedriver_win32 (11)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 			 
		driver.get("https://www.timhortons.ca");				  
		driver.manage().window().maximize();
		
		LoginPage.Apply(driver).click();
		LoginPage.LoginButton(driver).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage.EmailAddress(driver).sendKeys("timhortonstesting@gmail.com");
		LoginPage.Signin(driver).click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		@SuppressWarnings("unused")
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://www.gmail.com");
		
		LoginPage.GmailLoginfield(driver).sendKeys("timhortonstesting@gmail.com");
		LoginPage.GmailLoginNext(driver).click();
		LoginPage.GmailPwd(driver).sendKeys("Tims@123");
		LoginPage.PwdNext(driver).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		LoginPage.ClickOnEmail(driver).click();
		LoginPage.LoginLinkText(driver).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	
	//Order to pickup
	 
  @Test
  public void test1() throws InterruptedException {
	  
		  	Test1Objects.order(driver).click();
			Test1Objects.pickUp(driver).click();
			Test1Objects.adress(driver).sendKeys("1255 Boulevard Robert-Bourassa, Montreal, QC, Canada");
			Test1Objects.chooseAdress(driver).click();
			Test1Objects.chooseStore(driver).click();
			Test1Objects.orderHere(driver).click();
			Test1Objects.takeOut(driver).click();
			Test1Objects.chooseItem(driver).click();
			Test1Objects.addToCart(driver).click();
			System.out.println("Test case (1) 'order to pick up' PASSED");
			driver.get("https://www.timhortons.ca");
	  
  }
  
//2nd test case "Order to Deliver"
  
  @Test
  public void test2() throws InterruptedException {
	  
	  Test1Objects.order(driver).click();
		Test2Objects.deliver(driver).click();
		Test2Objects.adress(driver).sendKeys("1255 Boulevard Robert-Bourassa, Montreal, QC, Canada");
		Test2Objects.chooseAdress(driver).click();
		Test2Objects.telNo(driver).sendKeys("5146789000");
		Test2Objects.deliverHere(driver).click();
		Test1Objects.chooseItem(driver).click();
		Test1Objects.addToCart(driver).click();
		System.out.println("Test case (2) 'order to Deliver' PASSED");
		driver.get("https://www.timhortons.ca");
	  
  }
  
  // 3rd test case "Buy a digital Tim Card"
  @Test
  public void test3() {
	  
	  Test3Objects.More(driver).click();
	  Test3Objects.TimCard(driver).click();
	  Test3Objects.BuyNow(driver).click();
	  Test3Objects.DigitalTimCard(driver).click();
	  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
	  driver.switchTo().frame("ext_content");
	  
	  Test3Objects.RecipientName(driver).sendKeys("TimHortons");
	  Test3Objects.RecipientEmail(driver).sendKeys("timhortonstesting@gmail.com");
	  Test3Objects.AddToCart(driver).click();
	  
	  driver.switchTo().defaultContent();
	  
	  Test3Objects.CheckOut(driver).click();
	  Test3Objects.CreditCard(driver).sendKeys("2340283712846283");
	  Test3Objects.NameOnCard(driver).sendKeys("Tim Hortons");
	  
	  driver.switchTo().frame("ext_content");
	  
	  Test3Objects.CVD(driver).sendKeys("(//input[@id='cc_address'])");
	  Test3Objects.Address(driver).sendKeys("711-3480 Rue Simpson");
	  Test3Objects.City(driver).sendKeys("Montreal");
	  Test3Objects.Province(driver).selectByVisibleText("Quebec");
	  Test3Objects.ZipCode(driver).sendKeys("H3G2N7");
	  Test3Objects.BillingPhone(driver).sendKeys("4389298796");
	  Test3Objects.Email(driver).sendKeys("Timhortonstesting@gmail.com");
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  driver.get("https://www.timhortons.ca");
	  
	  System.out.println("Test Case(3) 'Buy Digital Tim Card' passed");
	  driver.get("https://www.timhortons.ca");
	  
	//  login();
	  
  } 
  
  //test case 4 "Start pick up order in 20min"
  
  @Test
  public void test4() throws InterruptedException {
	  
	  Test1Objects.order(driver).click();
		Test1Objects.pickUp(driver).click();
		Test1Objects.adress(driver).sendKeys("1255 Boulevard Robert-Bourassa, Montreal, QC, Canada");
		Test1Objects.chooseAdress(driver).click();
		Test1Objects.chooseStore(driver).click();
		Test1Objects.orderHere(driver).click();
		Test1Objects.takeOut(driver).click();
		Test1Objects.chooseItem(driver).click();
		Test1Objects.addToCart(driver).click();
		Test6Objects.Cart(driver).click();
		Test6Objects.CheckOut(driver).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Test4Objects.StartOrderIn20min(driver).click();
		Test4Objects.ClosePaymentPage(driver).click();
	  
		System.out.println("Test Case (4) 'Start pick up order in 20min' Passed ");
		driver.get("https://www.timhortons.ca");
  }
  
  // test case 5 "Delivery order using Tims card"
  
  @Test
  public void test5() throws InterruptedException {
	  
	  Test1Objects.order(driver).click();
	  Test5Objects.delivery(driver).click();
	  Test5Objects.deiveryAddress(driver).sendKeys("3480 Rue Simpson");
	  Test5Objects.phoneNumber(driver).sendKeys("4389298796");
	  Test5Objects.DeliverHereButton(driver).click();
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  Test1Objects.chooseItem(driver).click();
	  Test1Objects.addToCart(driver).click();
	  
	  System.out.println("Test case (5) 'Delivery order using Tims card' Passed");	  
	  driver.get("https://www.timhortons.ca");
  }
  
  // Test case 6 "Apply rewards discount"
  
  @Test
  public void test6() throws InterruptedException {
	  
		Test1Objects.order(driver).click();
		Test1Objects.pickUp(driver).click();
		Test1Objects.adress(driver).sendKeys("1255 Boulevard Robert-Bourassa, Montreal, QC, Canada");
		Test1Objects.chooseAdress(driver).click();
		Test1Objects.chooseStore(driver).click();
		Test1Objects.orderHere(driver).click();
		Test1Objects.takeOut(driver).click();
		Test1Objects.chooseItem(driver).click();
		Test1Objects.addToCart(driver).click();
		Test6Objects.Cart(driver).click();
		Test6Objects.CheckOut(driver).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Test4Objects.ClosePaymentPage(driver).click();
		
		System.out.println("Test case (6) 'Apply rewards discount' Passed");
		driver.get("https://www.timhortons.ca");
	  
  }
  
  //Test case 7 "Dine In order"
  
  @Test
  public void test7() {
	  
	  //Dine-in is currently unavailable 
	  
	  System.out.println("Test (7) is currently unexecutable");
	  
  }
  
  // Test case 8 "Careers - to apply job in any restaurant"
  
  @Test
  public void test8() {
	  
	  Test8Objects.BrowseOpportunities(driver).click();
	  Test8Objects.ApplyNow(driver).click();
	  
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  
	  Test8Objects.Apply(driver).click();
	  Test8Objects.JobPosition(driver).selectByVisibleText("Management");
	  Test8Objects.JobType(driver).click();
	  Test8Objects.Availability(driver).click();
	  Test8Objects.Days(driver).click();
	  Test8Objects.HoursPerWeek(driver).sendKeys("10");
	  Test8Objects.PayExceptation(driver).sendKeys("16");
	  Test8Objects.FirstName(driver).sendKeys("Tim");
	  Test8Objects.LastName(driver).sendKeys("Hortons");
	  Test8Objects.StreetAddress(driver).sendKeys("711-3480 Rue Simpson");
	  Test8Objects.City(driver).sendKeys("Montreal");
	  Test8Objects.Province(driver).selectByVisibleText("Quebec");
	  Test8Objects.Zipcode(driver).sendKeys("H3G2N7");
	  Test8Objects.PhoneNumber(driver).sendKeys("4389298796");
	  Test8Objects.Email(driver).sendKeys("timhortonstesting@gmail.com");
	  Test8Objects.HowDidYouHear(driver).selectByVisibleText("Online at TimHortons.com");
	  Test8Objects.EducationLevel(driver).selectByVisibleText("College/University");
	  Test8Objects.Language(driver).click();
	  Test8Objects.ApplytoSubmitApplication(driver).click();
	  
	  System.out.println("Test Case (8) 'Careers - to apply job in any restaurant' Passed");
	  
	  driver.get("https://www.timhortons.ca");
  }
  
  //9th test case " Connect with us on FB "
  
  @Test
  public void test9() throws InterruptedException {
	  
	  	Test9Objects.more(driver).click();
		Test9Objects.contactUs(driver).click();
		Test9Objects.facebook(driver).click();
		System.out.println("Test case (9) 'Go to Facebook page' PASSED");
		driver.get("https://www.timhortons.ca");
	  
  }
  
  //10th test case " Connect with us on Instagram"
  
  @Test
  public void test10() throws InterruptedException {
	  
	  	Test9Objects.more(driver).click();
		Test9Objects.contactUs(driver).click();
		Test10Objects.Insta(driver).click();
		System.out.println("Test case (10) 'Go to Instagram' PASSED");
		
		driver.get("https://www.timhortons.ca");

  }
  
  // Test case 11 "Contact Us - View FAQs"
  
  @Test
  public void test11() {
	  
	  Test11Objects.ContactUs(driver).click();
	  Test11Objects.ViewOurFAQs(driver).click();
	  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
	  System.out.println("Test case (11) 'Contact Us - View FAQs' Passed");
	  
	  driver.get("https://www.timhortons.ca");
	  
  }
  
  // test case 12 "Display Nutrition value of any item "
  
  @Test
  public void test12() throws InterruptedException {
	  
	  Test12Objects.More(driver).click();
	  Test12Objects.Nutrition(driver).click();
	  Thread.sleep(10000);
	  Test12Objects.ItemSearch(driver).sendKeys("Four Cheese Bagel");
	  Test12Objects.SearchButton(driver).click();
	  Thread.sleep(9000);
	  
	  System.out.println("Test Case (12) 'Display nutritional value of any item' Passed");
	  
	  driver.get("https://www.timhortons.ca");
  }
  
  // Test case 13 "View Breakfast item and its full nutrition info"
  
  @Test
  public void test13() throws InterruptedException {
	  
	  Test12Objects.More(driver).click();
	  Test12Objects.Nutrition(driver).click();
	  Thread.sleep(10000);
	  Test13Objects.Menu(driver).click();
	  Test13Objects.Breakfast(driver).click();
	  Test13Objects.ItemSandwich(driver).click();
	  Test13Objects.NutritionInfo(driver).click();
	  Test13Objects.Variety(driver).selectByVisibleText("Beyond Sausage™ Egg & Cheese");
	  Test13Objects.FullNutritionInfo(driver).click();
	  Thread.sleep(5000);
	 
	  System.out.println("Test case (13) 'View Breakfast item and its full nutrition info' Passed");
	  
	  driver.get("https://www.timhortons.ca");
  }
  
  //Test case 14 "Submit restaurant feedback by completing a Survey"
  
  @Test
  public void test14() throws InterruptedException {
	  
	  Test11Objects.ContactUs(driver).click();
	  Test14Objects.CompleteTheSurvey(driver).click();
	  Test14Objects.SurveyCode(driver).sendKeys("123412341234123412345");
	  Test14Objects.StartSurvey(driver).click();
	  
	  Thread.sleep(4000);
	  
	  System.out.println("Test case (14) 'Submit restaurant feedback by completing a survey' Passed");
	  
	  driver.get("https://www.timhortons.ca");
	  
  }
  
  //test case 15 "Pickup order placed on web site"
  
  @Test
  public void test15() throws InterruptedException {
	  
		Test15Objects.order(driver).click();
		Test15Objects.pickUp(driver).click();
		Test15Objects.adress(driver).sendKeys("1255 Boulevard Robert-Bourassa, Montreal, QC, Canada");
		Test15Objects.chooseAdress(driver).click();
		Test15Objects.chooseStore(driver).click();
		Test15Objects.orderHere(driver).click();
		Test15Objects.takeOut(driver).click();
		Test15Objects.chooseItem(driver).click();
		Test15Objects.addToCart(driver).click();
		Test6Objects.Cart(driver).click();
		Test6Objects.CheckOut(driver).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Test4Objects.ClosePaymentPage(driver).click();
		
		System.out.println("Test case (15) 'Pick up order placed on website' PASSED");
	  
  }
  
  
}
