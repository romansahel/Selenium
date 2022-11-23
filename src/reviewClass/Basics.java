package reviewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Roman");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sahel");
        driver.findElement(By.xpath("//img[contains(@src,'https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zG')]")).click();






    }
}
