package TestWebsite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextDemo {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbag.in/collections/stationery");

		driver.findElement(By.linkText("Stabilo Point 88 Neon 6 Shades Fine Liner")).click();

		driver.navigate().back();

		driver.findElement(By.partialLinkText("Stabilo")).click();
	}
}


