package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OffersResultPage {

    //Offer title
    @FindBy(xpath = "//h3[@class='text-success text-center']")
    private WebElement offerTitle;

    //Phone number
    @FindBy(xpath = "//h3[@class='go-text-right']")
    private WebElement offerPhoneNum;

    //Details title
    @FindBy(xpath = "//div[@class='panel-heading panel-green hidden-xs']")
    private WebElement detailsTitle;

    //Offer desc
    @FindBy(xpath = "//div[@class='main-title go-right']//p")
    private WebElement offerDesc;

}
