package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.loginpage;

public class demodoc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		loginpage lg= new loginpage(driver);
		WebDriverWait wait = new WebDriverWait(driver,10);
		lg.typeusername("admin");
		lg.typepassword("123456");
		lg.clickloginbutton();
		driver.findElement(By.cssSelector("a[href='/zentao/doc/']")).click();
		driver.findElement(By.cssSelector("a[href='/zentao/doc-browse-product.html']")).click();
    	driver.findElement(By.cssSelector("li[id='bysearchTab']")).click();
    	//driver.findElement(By.xpath(".//*[@id='searchmore']")).click();
    	WebElement el = wait.until(new ExpectedCondition<WebElement>() {  
            @Override  
            public WebElement apply(WebDriver driver) {  
           //   return driver.findElement(By.cssSelector("i.icon-double-angle-down icon-2x"));  //不能识别元素
            	return driver.findElement(By.xpath(".//*[@id='searchmore']")); //可以识别元素
            }			
        }); 
    	((JavascriptExecutor) driver).executeScript(  
    			"arguments[0].style.border='5px solid yellow'", el); 
	}
}
