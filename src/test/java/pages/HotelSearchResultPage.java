package pages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;


public class HotelSearchResultPage extends HotelMainPage {
    private WebDriver driver;

    private static final Logger logger = LogManager.getLogger();
    //View Map button
    @FindBy(xpath = "//i[@class='icon-location-7 mob-filter']")
    private WebElement viewMapButton;

    //Map
    @FindBy(xpath = "//div[@class='gmnoprint']")
    private WebElement map;

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
    @FindBy(xpath = "//h4[@class='RTL go-text-right mt0 mb4 list_title']")
    private List<WebElement> hotelTitles;

    //Location of the hotel
    @FindBy(xpath = "//a[@class='go-right ellipsisFIX go-text-right mob-fs14']")
    private List<WebElement> cityResults;

    //Hotel desc
    @FindBy(xpath = "//div[@class='grey RTL fs12 hidden-xs']//p")
    private List<WebElement> hotelDescriptions;

    //Hotel rating
    @FindBy(xpath = "//div[@class='review text-center size18 hidden-xs']")
    private List<WebElement> hotelRaiting;

    //Hotel price
    @FindBy(xpath = "//div[@class='fs26 text-center']//b")
    private List<WebElement> hotelPrice;

    //Details button
    @FindBy(xpath = "//button[@class='btn btn-primary br25 loader loader btn-block']")
    private List<WebElement> detailsButton;

    public HotelSearchResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Open Map and check if its propely displayed
    public HotelSearchResultPage checkTheMap(){
        viewMapButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(map));
        if (map.isDisplayed()){
            logger.info("Map properly displayed");
        }
        else{
            logger.info("Map error!");
        }
        //Close map after method
        viewMapButton.click();

        return this;
    }

    //Get and assert hotels titles;
    public HotelSearchResultPage checkTitles(){

        List<String> compareHotelTitles = Arrays.asList("Jumeirah Beach Hotel", "Oasis Beach Tower", "Rose Rayhaan Rotana", "Hyatt Regency Perth");
        //Get Index from hotelTitles List and compare it with expected hotel titles
        for (int i = 0; i < hotelTitles.size(); i++){
            Assert.assertEquals(hotelTitles.get(i).getText(), compareHotelTitles.get(i), "Assertion failed: " +hotelTitles.get(i) +" and " +compareHotelTitles.get(i));
            logger.info("Itteration num: "+hotelTitles.get(i).getText() );
        }

        return this;
    }

    public HotelSearchResultPage checkLocation(){
        IntStream.range(0, cityResults.size()).forEach(i ->{
            String actualResult = cityResults.get(i).getText();
            String expectedResult = "dubai";
            logger.info("Itteration number: " +i);
            Assert.assertEquals(actualResult, expectedResult, "Assertion failed at: " +actualResult + " and " +expectedResult);

        });

        return this;
    }

    public HotelSearchResultPage checkPrice(){
        IntStream.range(0, hotelPrice.size()).forEach(i -> {
            System.out.printf("Price: "+hotelPrice.get(i).getText() +"\n");
        });

        return this;
    }

    public HotelSearchResultPage checkDesc(){
        IntStream.range(0, hotelDescriptions.size()).forEach(i -> {
            System.out.printf("Desc: "+hotelDescriptions.get(i).getText() +"\n");
        });
        return this;
    }

    public HotelOfferPage submitDetails () throws InterruptedException{
        int randomOffer = new Random().nextInt(detailsButton.size());
        logger.info("Selected index: " +randomOffer);
        detailsButton.get(randomOffer).click();
        Thread.sleep(1000);

        return new HotelOfferPage(driver);
    }


}
