package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFirefox {
    public static void main(String[] args)  throws InterruptedException{
        WebDriver driver = new FirefoxDriver();{

            System.setProperty("Webdriver.geckodriver", "C:\\Software\\geckodriver-v0.30.0-win64.exe");
            driver.get("https://www.nopcommerce.com/en/login?returnUrl=%2Fen%2Fcart");
            Thread.sleep(3000);
            driver.manage().window().maximize();
            driver.close();
        }


    }
}
