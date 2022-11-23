package class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://accounts.google.com/signup");
        // get the window handle for the current page
        String gmailHandle = driver.getWindowHandle();

        // print

        System.out.println("the handle of the current page is: "+gmailHandle);
    }
}
