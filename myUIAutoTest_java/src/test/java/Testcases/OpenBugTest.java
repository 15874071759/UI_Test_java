package Testcases;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Common.UITest;
import Workflow.workflow;

public class OpenBugTest extends UITest{
	WebDriver driver = null;
  @BeforeSuite
  public void setup(){
	  driver = new ChromeDriver();
	  super.init(driver);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  @AfterSuite
  public void exit(){
	  driver.quit();
  }
	@Test
  public void f() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		workflow.setdriver(driver);
		String title = workflow.openbugpage();
		Assert.assertEquals(title.contains("Bug列表"), true);
  }
	
}
