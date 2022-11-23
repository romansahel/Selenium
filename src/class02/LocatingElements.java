package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fb.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.partialLinkText("Forgot")).click();

        //driver.findElement(By.linkText("Forgot password?")).click();

        driver.findElement(By.id("email")).sendKeys("roman.sahel12");
        driver.findElement(By.name("pass")).sendKeys("Sahel123");
        driver.findElement(By.name("login")).click();




    }
}
