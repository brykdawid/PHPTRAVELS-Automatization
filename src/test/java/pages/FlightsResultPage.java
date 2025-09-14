package pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FlightsResultPage {

    //Search box
    //Departure City input
    @FindBy(xpath = "//input[@id='s2id_autogen1']")
    private WebElement departureCityInput;

    //Arrival City Input
    @FindBy(xpath = "//input[@id='s2id_autogen2']")
    private WebElement arrivalCityInput;

    //Date from
    @FindBy(xpath = "//input[@name='departure']")
    private WebElement dateFrom;

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

    //Dates Availability
    //Title
    @FindBy(xpath = "//div[@class='col-md-12']//div[@class='panel-heading']")
    private WebElement title;

    //Arrow left
    @FindBy(xpath = "//i[@class='glyphicon-chevron-right fa fa-angle-left']")
    private WebElement arrowLeft;

    //Arrow right
    @FindBy(xpath = "//i[@class='glyphicon-chevron-right fa fa-angle-right']")
    private WebElement arrowRight;

    //Available dates
    @FindBy(xpath = "//div[@class='col-md-12']//li[@class]")
    private List<WebElement> availableDates;

    //Filter Search
    //Title
    @FindBy(xpath = "//div[@class='col-md-3']//div[@class='panel-heading']")
    private WebElement filterTitle;

    //Options
    //Transit - Non-Stop/Transit
    @FindBy(xpath = "//label//div[@class='icheckbox_square-grey']")
    private List<WebElement> typeOfTransit;

    //Refundable
    @FindBy(xpath = "//label[@for='Refundable']")
    private WebElement refundableOption;

    //Airline Filter
    @FindBy(xpath = "//label[@class='css-label go-left ellipsis']")
    private List<WebElement> airlineFilter;

    //Results
    //Title
    @FindBy(xpath = "//div[@class='col-md-9']//div[@class='panel-heading']")
    private WebElement resultsTitle;

    //Found results
    @FindBy(xpath = "//table[@id='load_data']//tr")
    private List<WebElement> foundResults;

    //Flight number
    @FindBy(xpath = "//div[@class='col-md-2 col-xs-4 text-center']//small")
    private List<WebElement> flightNumber;

    //Departure/Arrival country code
    @FindBy(xpath = "//strong//span[@data-toggle='tooltip']")
    private List<WebElement> countryCodes;

    //Lenght of flight
    @FindBy(xpath = "//div[@class='col-sm-3 col-xs-8 hidden-xs']//strong")
    private List<WebElement> flightLenght;

    //Price
    @FindBy(xpath = "//p[@class='listing-price text-center']//span[@class='strong']")
    private List<WebElement> flightPrice;

    //More Details
    @FindBy(xpath = "//a[text()='More Details']")
    private List<WebElement> moreDetailsBtn;

    //Book now Btn
    @FindBy(xpath = "//button[@id='bookbtn']")
    private List<WebElement> bookNowBtn;




}
