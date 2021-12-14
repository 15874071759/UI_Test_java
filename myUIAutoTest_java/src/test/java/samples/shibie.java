package samples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.loginpage;

public class shibie {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	//	driver.get("http://127.0.0.1/zentao/user-login.html");
		WebDriverWait wait = new WebDriverWait(driver,10);
		loginpage lg= new loginpage(driver);
		lg.typeusername("admin");
		lg.typepassword("123456");
		lg.clickloginbutton();
		driver.findElement(By.cssSelector("a[href='/zentao/doc/']")).click();
		//driver.findElement(By.cssSelector("a[href='/zentao/doc-browse-product.html']")).click();
		driver.findElement(By.cssSelector("a[href='/zentao/doc-createLib.html']")).click();
    //	driver.findElement(By.cssSelector("li[id='bysearchTab']")).click();
    	Thread.sleep(1000);
   // 	driver.findElement(By.cssSelector("i.icon-double-angle-down icon-2x")).click();
   //  	driver.findElement(By.cssSelector("table.table active-disabled table-fixed select#field1 option[value='keywords']")).click();
    //	Select sel=new Select(driver.findElement(By.cssSelector("select#field1")));
	//	sel.selectByValue("id");
		WebElement el = wait.until(new ExpectedCondition<WebElement>() {  
		            @Override  
		            public WebElement apply(WebDriver driver) {  
		                return driver.findElement(By.cssSelector("/zentao/doc-browse-product.html"));  //
		            }			
		        }); 
		((JavascriptExecutor) driver).executeScript(  
		        "arguments[0].style.border='5px solid yellow'", el); 
}
}


