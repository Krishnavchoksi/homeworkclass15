package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
    public static void main(String[] args)  throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.setProperty("Webdriver.Chrome.driver", "C:\\Software\\chromedriver_win32 (3).exe");

        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("Email")).sendKeys("krishna0309choksi@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("Password")).sendKeys("haridham123456");
        Thread.sleep(3000);
        driver.findElement(By.className("button-1 login-button")).click();
        Thread.sleep(3000);
        driver.close();

    }


}
