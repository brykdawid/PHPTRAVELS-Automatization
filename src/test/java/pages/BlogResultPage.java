package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class BlogResultPage {

    //Blog info 1.Title 2.Date 3.xyz
    @FindBy(xpath = "//h3[@class='wow fadeInUp animated title go-right ttu bold animated']//text()")
    private List<WebElement> blogInfo;

    //Blog desc
    @FindBy(xpath = "//div[@class='col-md-12']//p")
    private WebElement blogDesc;

    //You might like section title
    @FindBy(xpath = "//h3[@lcass='go-right ttu bold']")
    private WebElement YMLTitle;

    //Cards title
    @FindBy(xpath = "//div[@class='panel-body']//strong")
    private WebElement cardsTitle;
}
