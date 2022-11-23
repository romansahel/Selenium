package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-first-form-demo.php");
       // driver.findElement(By.cssSelector("input[placeholder*='Please enter")).sendKeys("Roman");

        WebElement textBoox = driver.findElement(By.cssSelector("input[placeholder*='Please enter"));
        textBoox.sendKeys("Cyrus");

        WebElement button = driver.findElement(By.cssSelector("button[onclick^='show']"));
        button.click();




    }
}
