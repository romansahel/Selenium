package class12;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class jsExecutorScroll {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("https://www.amazon.com/");
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-5000)");
    }
}
