package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends MainPage {
    private WebDriver driver;

    @FindBy(xpath = "//input[@type='email']" )
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@id='remember-me']")
    private WebElement rememberMeCheckBox;

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public LoginPage() {
    }


    public LoginPage sendEmail(String email){
        emailAddress.click();
        emailAddress.sendKeys(email);
        return this;
    }

    public LoginPage sendPassword(String password){
        passwordInput.click();
        passwordInput.sendKeys(password);
        return this;
    }

    public LoginPage selectRememeberMe(){
        rememberMeCheckBox.click();
        return this;
    }

    public DashboardPage submitLogin() throws InterruptedException{
        loginBtn.click();
        return new DashboardPage(driver);
    }

}
