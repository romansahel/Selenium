package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Roman");
        driver.findElement(By.id("customer.lastName")).sendKeys("Sahel");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 near ct");
        driver.findElement(By.id("customer.address.city")).sendKeys("Walnut Creek");
        driver.findElement(By.id("customer.address.state")).sendKeys("CA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("94596");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("4153053587");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-456-7890");
        driver.findElement(By.id("customer.username")).sendKeys("roman.sahel");
        driver.findElement(By.id("customer.password")).sendKeys("123-456-7890");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123-456-7890");
        driver.findElement(By.className("button")).click();
        driver.quit();










    }
}
