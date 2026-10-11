public class LoginPage {
    // Thuộc tính : ô input username,password,nút login
    String username;
    String password;
    String loginBtn;

    public LoginPage() {
    }

    public LoginPage(String username, String password, String loginBtn) {
        this.username = username;
        this.password = password;
        this.loginBtn = loginBtn;
    }

    public void enterUsername() {
        System.out.println("Enter Username: ");
        this.username = username;
    }

    public void enterPassword() {
        System.out.println("Enter Password: ");
        this.password = password;
    }

    public void clickLoginBtn() {
        System.out.println("Click Login Button: ");
    }

    public void login(String username, String password) {
        enterUsername();
        enterPassword();
        clickLoginBtn();
    }

    public boolean isLoginSuccess() {
        if ("admin".equals(username) && "123456".equals(password)) {
            return true;
        }
        return false;
    }
}
