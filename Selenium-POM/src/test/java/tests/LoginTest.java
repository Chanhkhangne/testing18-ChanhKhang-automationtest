package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends Basetest{
     @Test(description = "Test login success")
    public void testLoginSuccess() throws InterruptedException{
//        tạo đối tượng loginpages
        LoginPage loginPage = new LoginPage(driver,wait);
        loginPage.open();
        loginPage.login("admin", "admin123");
//        so sánh expected voi actual
         String currentURL = driver.getCurrentUrl();
         System.out.println(currentURL);
        Assert.assertTrue(currentURL.contains("dashboard"));
    }
}
