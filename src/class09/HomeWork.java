package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //        enter the username in the text box
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("admin");
//        enter the password
        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        
//        click on login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@name='Submit']"));
        loginButton.click();
        WebElement PIMbtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        PIMbtn.click();
        List<WebElement> secondcollum = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));
        for (int i = 0; i < secondcollum.size(); i++) {
            String sctext = secondcollum.get(i).getText();

            if(sctext.equalsIgnoreCase("44969A") || sctext.equalsIgnoreCase("45021A")){

              //  int rowNumber = i + 1;
               // System.out.println(rowNumber);

                WebElement checkBox = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr[" + (i + 1) + "]/td[1]"));
                checkBox.click();


            }


        }
    }
}
