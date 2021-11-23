package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverIE {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new InternetExplorerDriver();
        System.setProperty("WebDriver.InternalExploreDriver","C:\\Software\\IEDriverServer_x64_4.0.0.exe");
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        Thread.sleep(3000);
         String title = driver.getTitle();
         System.out.println("title");
   // Expected  vs Actual
        if(title.equals("https://demo.nopcommerce.com/login?returnUrl=%2F")){
            System.out.println("The title is Correct");

        } else{
            System.out.println("The title is incorrect");
        }
        driver.close();
    }
}
