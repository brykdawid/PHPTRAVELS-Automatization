package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.random.RandomGenerator;


public class HotelMainPage {

    private WebDriver driver;

    //Hotels Button
    @FindBy(xpath = "//a[@title='Hotels']")
    private WebElement hotelsButton;

    //Search Input Box
    @FindBy(xpath = "//div[@id='s2id_autogen8']")
    private WebElement searchInputBox;

    //Search Input
    @FindBy(xpath = "//div[@id='select2-drop']//input" )
    private WebElement searchInput;

    //Search results
    @FindBy(xpath = "//ul[@class='select2-result-sub']//li")
    private List<WebElement> searchResults;

    //Check in date
    @FindBy(xpath = "//input[@name='checkin']")
    private WebElement checkInDate;

    //Check out date
    @FindBy(xpath = "//input[@name='checkout']")
    private WebElement checkOutDate;

    //Amount of travelers
    @FindBy(xpath = "//input[@id='travellersInput']")
    private WebElement amountOfTravelers;

    //Adults amount
    @FindBy(xpath = "//input[@id='adultInput']")
    private WebElement amountOfAdults;

    //Child amount
    @FindBy(xpath = "//input[@id='childInput']")
    private WebElement amountOfChildren;

    //Search Button
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchBtn;

    public HotelMainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    public HotelMainPage() {
    }

    public HotelMainPage setCity(String cityName) throws InterruptedException {
        searchInputBox.click();
        searchInput.sendKeys(cityName);

        Thread.sleep(500);

        if(!searchResults.isEmpty()){
            WebElement randomResult = searchResults.get(RandomGenerator.getDefault().nextInt(searchResults.size()));
            randomResult.click();
        }
        Thread.sleep(500);

        return this;
    }

    public HotelMainPage setDates(String checkIn, String checkOut) throws InterruptedException {
        checkInDate.click();
        checkInDate.sendKeys(checkIn);
        Thread.sleep(500);
        checkOutDate.click();
        checkOutDate.sendKeys(checkOut);
        Thread.sleep(500);

        return this;
    }

    public HotelMainPage setTravelers(int adult, int child) throws InterruptedException {
        amountOfTravelers.click();
        Thread.sleep(500);
        amountOfAdults.sendKeys(String.valueOf(adult));
        amountOfChildren.sendKeys(String.valueOf(child));

        return this;

    }

    public HotelMainPage submitSearch(){
        searchBtn.click();
        return new HotelSearchResultPage(driver);
    }

}
