package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.UITest;

public class NewTest extends UITest{
	WebDriver driver;
	@BeforeMethod
  public void setUP(){
	  driver= new ChromeDriver();
	  super.init(driver);
  }
  @Test
  public void fa() {
	  driver.get("https://www.baidu.com");
	  String title = driver.getTitle();
	  Assert.assertEquals(title, "123");
  }
  @AfterMethod
  public void exit() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.quit();
  }
}
