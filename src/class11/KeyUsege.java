package class11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class KeyUsege {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement userName = driver.findElement(By.xpath("//input [@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester", Keys.TAB);
        WebElement sendPass = driver.findElement(By.xpath("//input [@name='ctl00$MainContent$password']"));
        sendPass.sendKeys("test",Keys.ENTER);

    }
}
