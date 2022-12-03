package class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class screenShot {
    public static void main(String[] args) throws IOException {

                System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
                // create a WebDriver instance
                WebDriver driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
                driver.manage().window().maximize();
                //  go to the website
                driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
                WebElement userName = driver.findElement(By.xpath("//input [@name='ctl00$MainContent$username']"));
                userName.sendKeys("Tester", Keys.TAB);
                WebElement sendPass = driver.findElement(By.xpath("//input [@name='ctl00$MainContent$password']"));
                sendPass.sendKeys("test",Keys.ENTER);

                TakesScreenshot ss= (TakesScreenshot) driver;
                File scourceFile = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scourceFile,new File("screenshots/SmartBear/Test.png"));




            }
        }


