package pckg;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Browser Name (Chrome / Firefox / Edge): ");
        String name = sc.next().trim();  // removes unwanted spaces
        WebDriver driver = null;

        if (name.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (name.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (name.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Invalid Browser name. Please enter Chrome / Firefox / Edge");
            System.exit(0);
        }

        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/feed/");
    }
}
