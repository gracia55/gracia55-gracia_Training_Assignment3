package windowHandlingpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NavigateDemoTest {
  @Test
  public void f() throws Exception {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	  driver.navigate().to("https://www.google.com/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	 
	  driver.navigate().to("https://www.flipkart.com/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	  
	  driver.navigate().back();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	  
	  driver.navigate().forward();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	  
	  driver.navigate().to("https://www.google.com/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	  
	  driver.navigate().refresh();
	  driver.quit();
	  
	  
	  
	  
  }
}
