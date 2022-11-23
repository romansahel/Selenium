package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[2]")).click();
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Roman Sahel");
        driver.findElement(By.xpath("//button[@onclick='showInput();']")).click();

    }
}
