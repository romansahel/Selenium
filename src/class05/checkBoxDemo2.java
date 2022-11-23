package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        List<WebElement> chekboxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for(WebElement chekboxe:chekboxes){
            String optionName = chekboxe.getAttribute("value");
            if(optionName.equals("Option-2")){
                chekboxe.click();
            }
        }
    }
}
