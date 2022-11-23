package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleSelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select sel=new Select(DD);
        sel.selectByIndex(0);
        sel.selectByVisibleText("Ohio");
        Thread.sleep(3000);
        sel.deselectByVisibleText("Ohio");
        // To Select all
        List<WebElement> options = sel.getOptions();
        for(int i=0;i<options.size();i++){

            sel.selectByIndex(i);
        }
        Thread.sleep(4000);

        //Deselect All
        sel.deselectAll();
    }
}
