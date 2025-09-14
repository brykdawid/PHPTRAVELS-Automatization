package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import java.util.List;


public class HotelSearchResultPage {

    //View Map button
    @FindBy(xpath = "//i[@class='icon-location-7 mob-filter']")
    private WebElement viewMapButton;

    //Search box
    //City
    @FindBy(xpath = "//input[@class='select2-input']")
    private WebElement cityInput;

    //Arrival Date
    @FindBy(xpath = "//input[@name='checkin']")
    private WebElement arrivalDate;

    //Leave day
    @FindBy(xpath = "//input[@name='checkout']")
    private WebElement leaveDate;

    //Adults & Child
    @FindBy(xpath = "//input[@id='adultInput']")
    private WebElement adultsInput;

    @FindBy(xpath = "//input[@id='childInput']")
    private WebElement childInput;

    // --- Filters ---
    //Star grade rozwijane menu
    @FindBy(xpath = "//button[@data-target='#collapse1']")
    private WebElement starGradeButton;

    //Star grades buttons
    @FindBy(xpath = "//div[@class='rating']//div[@class='go-right']")
    private List<WebElement> starGrade;

    //Price range rozwijane menu
    @FindBy(xpath = "//button[@data-target='#collapse2']")
    private WebElement priceRangeButton;

    //Price slidery
    @FindBy(xpath = "//div[@class='slider-handle round']")
    private List<WebElement> priceSlider;

    //Rozwijane menu Property types
    @FindBy(xpath = "//button[@data-target='#collapse3']")
    private WebElement propertyTypesButton;

    //Property types buttons
    @FindBy(xpath = "//input[@id='Hotel']")
    private List<WebElement> propertyTypesCheckBoxes;

    //Amenities rozwijane menu
    @FindBy(xpath = "//button[@data-target='#collapse4']")
    private WebElement amenitesButton;

    //Amenities opcje
    @FindBy(xpath = "//input[@id='amenities[]']")
    private List<WebElement> amenitesCheckBoxes;

    //Search button
    @FindBy(xpath = "//button[@id='searchform']")
    private WebElement submitFiltersButton;

    // --- Results ---

    //No results found
    @FindBy(xpath = "//div[@class='itemscontainer']//h2")
    private WebElement noResultsFound;

    //Hotel title
    @FindBy(xpath = "//h4[@class='RTL go-text-right mt0 mb4 list_title']//b")
    private List<WebElement> hotelTitles;

    //Location of the hotel
    @FindBy(xpath = "//a[@class='go-right ellipsisFIX go-text-right mob-fs14']//i")
    private List<WebElement> cityResults;

    //Hotel desc
    @FindBy(xpath = "//div[@class='grey RTL fs12 hidden-xs']//p")
    private List<WebElement> hotelDescriptions;

    //Hotel rating
    @FindBy(xpath = "//div[@class='review text-center size18 hidden-xs']")
    private List<WebElement> hotelRaiting;

    //Hotel price
    @FindBy(xpath = "//div[@class='fs26 text-center']")
    private List<WebElement> hotelPrice;

    //Details button
    @FindBy(xpath = "//button[@class='btn btn-primary br25 loader loader btn-block']")
    private List<WebElement> detailsButton;

}
