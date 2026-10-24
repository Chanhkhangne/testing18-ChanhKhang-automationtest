package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardTest extends Basetest{
    @Test(description = "Find locators")
    public void findLocators() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.open();
        loginPage.login("admin", "admin123");


        wait.until(ExpectedConditions.urlContains("dashboard"));
//        đợi xuất hiện  1 trong các element thì bypass
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")));
        DashboardPage dashboardPage = new DashboardPage(driver,wait);
        Assert.assertTrue(dashboardPage.isElementPresnt());
    }

}
