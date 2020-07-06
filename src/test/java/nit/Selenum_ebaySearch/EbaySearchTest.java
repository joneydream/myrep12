package nit.Selenum_ebaySearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EbaySearchTest {
public WebDriver driver;	
  @Test
  public void search() {
	      WebDriverManager.chromedriver().version("83").setup();
	      driver=new ChromeDriver();
	      driver.manage().window().maximize();
		  driver.get("http://ebay.com");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.id("gh-ac")).sendKeys("LG");
		  driver.findElement(By.id("gh-btn")).click();
	    
  }
}
