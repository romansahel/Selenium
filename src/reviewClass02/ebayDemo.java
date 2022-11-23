package reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ebayDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://ebay.com");
        //        select from the drop down
        WebElement dropDwn = driver.findElement(By.xpath("//select[@id='gh-cat']"));

        Select sel= new Select(dropDwn);

        sel.selectByValue("58058");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

//        verify the title


        String title = driver.getTitle();

        if(title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
            System.out.println("the title is verified");
        }
        else{
            System.out.println("the title is incorrect");
        }

    }
}
