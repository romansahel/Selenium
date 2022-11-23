package reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for(WebElement radioBtn:radioBtns){
            String option = radioBtn.getAttribute("value");
            if (option.equalsIgnoreCase("5 - 15")){
                radioBtn.click();
            }

        }
    }
}
