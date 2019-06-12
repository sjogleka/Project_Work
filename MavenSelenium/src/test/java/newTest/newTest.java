package newTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;		

public class newTest {
	private WebDriver driver;  
		public void delay() {
		try {
			Thread.sleep(4000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("In Catch Block");
			e.printStackTrace();
		}
	}
		@Test
	  public void f() {
		//long start = System.currentTimeMillis();
		//driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		System.out.println("Launching Website Now ...");
		driver.navigate().to("https://sjogleka.github.io");	
		long start = System.currentTimeMillis();
		System.out.println(start);
		delay();
		WebDriverWait  wait = new WebDriverWait(driver, 50);
		System.out.println("Launching ML site page..");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		delay();
		/*
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='portfolio-single.html']"))).click();
		System.out.println("Current Execution Time ...."+System.currentTimeMillis());
		//driver.findElement(By.xpath("//a[@href='portfolio-single.html']")).click();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		System.out.println("...Current Execution Time ...."+System.currentTimeMillis());
		System.out.println(driver.getCurrentUrl());
		delay();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://github.com/sjogleka/Machine-Learning']")));
		driver.findElement(By.xpath("//a[@href='https://github.com/sjogleka/Machine-Learning']")).click();
		delay();
		driver.navigate().back();
		delay();
		driver.navigate().back();*/
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Sumedh Joglekar");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("sumedh.joglekar@charter.com");
		driver.findElement(By.cssSelector("textarea[id='message']")).sendKeys("This is Test Message from Selenium...");
		//delay();
		long time = System.currentTimeMillis() - start;
		//System.out.println("Time Required in Millis :-"+time);*/
	  /*	driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			AssertJUnit.assertTrue(title.contains("Demo Guru99 Page")); */
	  }
	  @BeforeTest
	  public void beforeTest() {
	  	System.out.println("launching chrome browser");
			System.setProperty("webdriver.chrome.driver", "/Users/Shared/Jenkins/Home/workspace/First_Project/chromedriver");
			ChromeOptions options =  new ChromeOptions();
			options.addArguments("headless");
      options.addArguments("window-size=1200x600");
			driver = new ChromeDriver(options);
	  }

	  @AfterTest
	  public void afterTest() {
	  	driver.quit();
	  }


}
