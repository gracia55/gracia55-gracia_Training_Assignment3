package pckg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CssSelectorLocatot {
	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.myntra.com/login");

        // Using CSS selector ID
        driver.findElement(By.cssSelector("#mobileNumberPass")).sendKeys("9876543210");

        // Continue button using class selector
        driver.findElement(By.cssSelector(".submitBottomOption")).click();
    }

}
