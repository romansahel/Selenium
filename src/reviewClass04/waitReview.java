package reviewClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waitReview {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        WebElement removebtn = driver.findElement(By.xpath("//button[text()='Remove']"));
        removebtn.click();
        WebElement text = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(text.getText());

        WebElement btn = driver.findElement(By.xpath("//button[text()='Enable']"));
        btn.click();

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sahel");
        WebElement disable = driver.findElement(By.xpath("//button[text()='Disable']"));
        disable.click();

    }
}
