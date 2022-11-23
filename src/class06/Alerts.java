package class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();
        Thread.sleep(3000);
        //Handling the Alert
        Alert simpleAlert1 =driver.switchTo().alert();
        simpleAlert1.accept();
        //find the button for confirmation alert and click on it
        WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmationAlert.click();

        Thread.sleep(3000);
        Alert simpleAlert2 = driver.switchTo().alert();
        simpleAlert2.dismiss();
        // find the prompt alert and send some text then accept it
        WebElement sendkey = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        sendkey.click();
        Thread.sleep(3000);
        // switch the focus to the alert
        Alert sendkey2 = driver.switchTo().alert();
        sendkey2.sendKeys("Roman Sahel");
        Thread.sleep(4000);
        sendkey2.accept();
        driver.quit();



    }
}
