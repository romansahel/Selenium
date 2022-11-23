package reviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://chercher.tech/practice/frames");
        //        switch the focus of the driver to the parent iframe whose id is iframe1
        driver.switchTo().frame("frame1");
//        switch the focus to the child frame
        driver.switchTo().frame(0);

        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

//        switch the focus back to home content
        driver.switchTo().defaultContent();

//          switching to the frame which has drop down
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(frame);

//        find the select tag
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));

        Select sel= new Select(dropDown);

        sel.selectByIndex(3);
    }
}
