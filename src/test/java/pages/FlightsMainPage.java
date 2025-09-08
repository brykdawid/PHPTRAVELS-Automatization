package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FlightsMainPage {

    //Flights button
    @FindBy(xpath = "//a[@title='Flights']")
    private WebElement flightsBtn;

    //Departure City or Airport Input
    @FindBy(xpath = "//input[@id='s2id_autogen12']")
    private WebElement departureInput;

    //Departure City results
    @FindBy(xpath = "//ul[@class='select2-results']//li")
    private List<WebElement> departureInputList;

    //Arrival City or Airport Input
    @FindBy(xpath = "//input[@id='s2id_autogen13']")
    private WebElement arrivalInput;

    //Arrival City results
    @FindBy(xpath = "//ul[@class='select2-results']//li")
    private List<WebElement> arrivalInputList;

    //Departure Date
    @FindBy(xpath = "//input[@name='departure']")
    private WebElement departureDate;

    //Arrival Date
    @FindBy(xpath = "//input[@name='arrival']")
    private WebElement returnDate;

    //Amount of passengers
    @FindBy(xpath = "//input[@name='totalManualPassenger']")
    private WebElement amountOfPassangers;

    //Adults
    @FindBy(xpath = "//select[@name='madult']")
    private WebElement adults;

    //Adults options
    @FindBy(xpath = "//select[@name='madult']//option")
    private WebElement adultsOptions;

    //Child
    @FindBy(xpath = "//select[@name='mchildren']")
    private WebElement child;

    //Child options
    @FindBy(xpath = "//select[@name='madult']//option")
    private WebElement childOptions;

    //Infant
    @FindBy(xpath = "//select[@name='madult']")
    private WebElement minfant;

    //Infant options
    @FindBy(xpath = "//select[@name='madult']//option")
    private WebElement infantOptions;

    //Triptype
    @FindBy(xpath = "//input[@name='triptype']")
    private List<WebElement> tripType;

    //Cabin class
    @FindBy(xpath = "//select[@name='cabinclass']")
    private WebElement cabinClass;

    //Cabin class options
    @FindBy(xpath = "//select[@name='cabinclass']//option")
    private List<WebElement> cabinClassOptions;

    //Search Button
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchBtn;
}
