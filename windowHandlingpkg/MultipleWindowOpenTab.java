package windowHandlingpkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MultipleWindowOpenTab {
  @Test
  public void f() throws Exception {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		  String parentWindow = driver.getWindowHandle();
		  System.out.println("Parent Window ID: " + parentWindow);
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='opentab']"))).click();
		  Set <String> allWindows = driver.getWindowHandles();

		  
		  for (String eachWindow : allWindows) {
			  if (!eachWindow.equals(parentWindow)) {
				  driver.switchTo().window(eachWindow);
			  }
		  }
		  Thread.sleep(4000);
		  driver.getTitle();
		  

		  
		  driver.switchTo().window(parentWindow);

		  System.out.println("Back to Main Window: " + driver.getTitle());
	  
		  
  }
}
