package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Java");
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();

    }
}
