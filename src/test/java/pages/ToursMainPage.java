package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class ToursMainPage {

    //Tours button
    @FindBy(xpath = "//a[@title='Tours']")
    private WebElement toursBtn;

    //Search Input
    @FindBy(xpath = "//input[@id='s2id_autogen11']")
    private WebElement searchInput;

    //Date selector
    @FindBy(xpath = "//input[@name='date']")
    private WebElement dateSelector;

    //Amount of Participants
    @FindBy(xpath = "//select[@id='adults']")
    private WebElement amountOfParticipants;

    //Select amount - po kliknięciu ^
    @FindBy(xpath = "//select[@id='adults']//option")
    private List<WebElement> selectAmount;

    //Type of tour
    @FindBy(xpath = "//input[@class='select2-input']")
    private WebElement typeOfTour;

    //Select type of tour - po kliknęciu ^
    @FindBy(xpath = "//ul[@class='select2-results']//li")
    private List<WebElement> typeOfTours;

    //Search Button
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchBtn;

}
