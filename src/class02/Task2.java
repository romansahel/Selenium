package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("roman");


        // driver.findElement(By.name("firstname")).sendKeys("Roman");
        //driver.findElement(By.name("lastname")).sendKeys("Sahel");
        //driver.findElement(By.name("reg_email__")).sendKeys("roman.sahel@yahoo.com");
        // driver.findElement(By.name("reg_passwd__")).sendKeys("12345");
        //driver.findElement(By.className("_8idr img")).click();




    }
}
