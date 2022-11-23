package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tableBasic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        //print the whole table on consol
        WebElement allTable = driver.findElement(By.xpath("//table[@id='customers']"));
        String textAllTable = allTable.getText();
        // System.out.println(textAllTable);


        // print all the rows in table
        //modifcation print all the rows which have the company google

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row:rows){
           String rowText = row.getText();
           //   System.out.println(rowText);
           //   System.out.println("---------------------------");
            if(rowText.contains("Meta")){
                System.out.println(rowText);
            }

        }
        // print all the individual colums of the table
        List<WebElement> colums = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement colum:colums){
            String columeText = colum.getText();
            System.out.println(columeText);
            System.out.println("----------------------");
        }
        WebElement fransco = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[2]"));
        String franscotext = fransco.getText();
        System.out.println(franscotext);

    }
}
