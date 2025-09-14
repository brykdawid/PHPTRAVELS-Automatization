package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutPage {

    //First Name
    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstName;

    //Last Name
    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastName;

    //Email
    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;

    //Confirmemail
    @FindBy(xpath = "//input[@name='confirmemail']")
    private WebElement confirmemail;

    //Phone
    @FindBy(xpath = "//input[@name='phone']")
    private WebElement phone;

    //Address
    @FindBy(xpath = "//input[@name='address']")
    private WebElement address;

    //Country
    @FindBy(xpath = "//input[@id='s2id_autogen2']")
    private WebElement country;

    //Country List
    @FindBy(xpath = "//li[@class='select2-results-dept-0 select2-result select2-result-selectable']")
    private List<WebElement> coutnryList;

    //Notes checkbox
    @FindBy(xpath = "//label[@data-toggle='collapse']")
    private WebElement additionalNotesCheckbox;

    //Notes textbox
    @FindBy(xpath = "//textarea[@class='form-control']")
    private WebElement additionalNotesTextarea;

    //Confirm this booking BTN
    @FindBy(xpath = "//div[@class='form-group']//button")
    private WebElement confirmBtn;

}
