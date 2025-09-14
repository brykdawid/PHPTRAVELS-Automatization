package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OffersPage {

    //Offers
    @FindBy(xpath = "//div[@class='col-md-6 owl-item go-right']")
    private List<WebElement> offers;

    //Offer price
    @FindBy(xpath = "//b[text()]")
    private List<WebElement> offersPrice;

    //Offers title
    @FindBy(xpath = "//div[@class='col-md-6 owl-item go-right']//h4")
    private List<WebElement> offersTitle;

    //Offers desc
    @FindBy(xpath = "//div[@class='col-md-6 owl-item go-right']//p")
    private List<WebElement> offersDesc;

    //Read more button
    @FindBy(xpath = "//a[@class='btn btn-primary go-right loader']")
    private List<WebElement> readMoreBtn;

}
