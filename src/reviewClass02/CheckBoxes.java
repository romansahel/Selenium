package reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@name='color']"));
        for(WebElement checkboxe:checkboxes){
            String color = checkboxe.getAttribute("value");
            if(color.equalsIgnoreCase("blue")){
                checkboxe.click();
                break;
            }


        }
    }
}
