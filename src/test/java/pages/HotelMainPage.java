package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HotelMainPage {


    //Hotels Button
    @FindBy(xpath = "//a[@title='Hotels']")
    private WebElement hotelsButton;

    //Search Input
    @FindBy(xpath = "//input[@id='s2id_autogen9']")
    private WebElement searchInput;

    //Search results
    @FindBy(xpath = "//ul[@class='select2-result-sub']//li")
    private List<WebElement> serchResults;

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
}
