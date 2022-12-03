package class12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class uploadfile {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("https://www.amazon.com/");
        driver.get("https://the-internet.herokuapp.com/upload");

                WebElement choosefile = driver.findElement(By.xpath("//input[@id='file-upload']"));
        choosefile.sendKeys("C:\\Users\\roman\\OneDrive\\Desktop\\Book2.xlsx");


    }
}
    }
}
