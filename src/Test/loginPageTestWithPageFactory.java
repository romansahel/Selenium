package Test;

import Pages.loginPagewithPageFactory;
import utils.CommonMethods;

public class loginPageTestWithPageFactory {
    public static void main(String[] args) {
        CommonMethods.openWithSpecificUrl ("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
                loginPagewithPageFactory login =new loginPagewithPageFactory();
        login.usernamefield.sendKeys("Admin");
        login.passwordfield.sendKeys("Hum@nhrm123");
        login.loginbtn.click();
    }
}
