package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select select = new Select(dropDown);
        select.selectByIndex(5);
        Thread.sleep(3000);
//        select by visible Text
        select.selectByVisibleText("Saturday");
        Thread.sleep(3000);
//     select by value
        select.selectByValue("Sunday");

//        get all the options available in the dropdown

        List<WebElement> options = select.getOptions();

//        traverse through the options
        for (int i = 0; i < options.size(); i++) {

            WebElement option = options.get(i);
            String text = option.getText();
            if (text.equalsIgnoreCase("Friday")) {
                select.selectByIndex(i);
            }
        }
    }
}
