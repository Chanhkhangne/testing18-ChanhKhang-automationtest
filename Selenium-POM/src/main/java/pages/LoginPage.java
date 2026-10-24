package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Basepage{
//    <input data-v-1f99f73c=""
//    class="oxd-input oxd-input--active"
//    name="username" placeholder="Username" autofocus="">
//    xpath:rule de tim locator trên website
//    //input[@name='username']=> tìm tất cả các thẻ input có thuộc tính name với value username
private static final By INPUT_USERNAME = By.xpath("//input[@name='username']");
private static final By INPUT_PASSWORD = By.xpath("//input[@name='password']");
private static final By LOGIN_BUTTON   = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver, WebDriverWait wait){
        super(driver,wait);
    }
//    step 1
    public void open(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wait.until(ExpectedConditions.visibilityOfElementLocated(INPUT_USERNAME));
    }
//    step 2:login
//    enterUsername,enterPassword,clickLoginBtn
//    2 cách viết
//    Ưu điểm:dễ dàng log kiểm tra,dễ sửa
//    c2:gom các step chung 1 function
    public void login(String username , String password ) throws InterruptedException {
        WebElement usernameInput = driver.findElement(INPUT_USERNAME);
        usernameInput.sendKeys(username);

        Thread.sleep(2000);

        WebElement passwordInput =driver.findElement(INPUT_PASSWORD);
        passwordInput.sendKeys(password);

        Thread.sleep(2000);
        WebElement loginBtn = driver.findElement(LOGIN_BUTTON);
        loginBtn.click();

        Thread.sleep(10_000);

    }

}
