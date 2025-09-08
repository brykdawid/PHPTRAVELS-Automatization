package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CarsMainPage {

    //Cars button
    @FindBy(xpath = "//a[@title='Cars']")
    private WebElement carsButton;

    //Pick Up Location
    @FindBy(xpath = "//input[@id='s2id_autogen2']")
    private WebElement pickUpLocation;

    //Pick Up Location List
    @FindBy(xpath = "//div[@id='select2-drop']//li")
    private List<WebElement> pickUpLocationList;

    //Drop off location
    @FindBy(xpath = "//input[@id='s2id_autogen3']")
    private WebElement dropOffLocation;

    //Drop off location list
    @FindBy(xpath = "//ul[@class='select2-results']//li")
    private List<WebElement> dropOffLocationList;

    //Pick Up Date
    @FindBy(xpath = "//input[@id='departcar']")
    private WebElement pickUpDate;

    //Pick Up Time
    @FindBy(xpath = "//select[@name='pickupTime']")
    private WebElement pickUpTime;

    //Pick Up Time list
    @FindBy(xpath = "//select[@name='pickupTime']//option")
    private List<WebElement> pickUpTimeList;

    //Drop Off Date
    @FindBy(xpath = "//input[@id='returncar']")
    private WebElement dropOffDate;

    //Drop Off Time
    @FindBy(xpath = "//select[@name='dropoffTime']")
    private WebElement dropOffTime;

    //Drop Off Time list
    @FindBy(xpath = "//select[@name='dropoffTime']//option")
    private List<WebElement> dropOffTimeList;

    //Search Button
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchBtn;
}


