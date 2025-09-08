package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VisaMainPage {

    //Visa Button
    @FindBy(xpath = "//a[@title='Ivisa']")
    private WebElement visaButton;

    //Nationality Input
    @FindBy(xpath = "//input[@id='s2id_autogen5']")
    private WebElement nationalityInput;

    //Nationality List
    @FindBy(xpath = "//select[@name='nationality_country']//option")
    private List<WebElement> nationalityList;

    //Destination Input
    @FindBy(xpath = "//input[@id='s2id_autogen7']")
    private WebElement destinationInput;

    //Destination List
    @FindBy(xpath = "//select[@name='destination_country']//option")
    private List<WebElement> destinationList;

    //Search Button
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchBtn;


}
