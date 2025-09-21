package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterPage extends MainPage{

        private WebDriver driver;

        //Register Page
        //First name
        @FindBy(xpath = "//input[@name='firstname']")
        private WebElement firstName;

        //Last Name
        @FindBy(xpath = "//input[@name='lastname']")
        private WebElement lastName;

        //Mobile Number
        @FindBy(xpath = "//input[@name='phone']")
        private WebElement phoneNumber;

        //Email Address
        @FindBy(xpath = "//input[@name='email']")
        private WebElement emailAddress;

        //Password
        @FindBy(xpath = "//input[@type='password']")
        private List<WebElement> password;

        //Submit Btn
        @FindBy(xpath = "//button[@type='submit']")
        private WebElement submitBtn;


        public RegisterPage(WebDriver driver) {
                this.driver = driver;
                PageFactory.initElements(driver, this);
        }


        public RegisterPage sendName(String name){
                firstName.click();
                firstName.sendKeys(name);
                return this;
        }

        public RegisterPage sendSurname(String surname){
                lastName.click();
                lastName.sendKeys(surname);
                return this;
        }

        public RegisterPage sendPhoneNum(String phone){
                phoneNumber.click();
                phoneNumber.sendKeys(phone);
                return this;
        }

        public RegisterPage sendEmailAddress(String email){
                emailAddress.click();
                emailAddress.sendKeys(email);
                return this;
        }

        public RegisterPage sendPassword(String pass){
                for (int i = 0; i < password.size(); i++){
                        password.get(i).click();
                        password.get(i).sendKeys(pass);
                }
                return this;
        }

        public DashboardPage submitRegister() throws InterruptedException{
                submitBtn.click();

                return new DashboardPage(driver);
        }

}