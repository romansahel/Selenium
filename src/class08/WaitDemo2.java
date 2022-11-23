package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WaitDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        // click on the button that pops up the alerts

        WebElement button1 = driver.findElement(By.xpath("//button[@id='alert']"));
        button1.click();
        driver.switchTo().alert();


    }
}
