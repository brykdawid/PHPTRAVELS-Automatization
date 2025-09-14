package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class BlogPage {

    //Page title
    @FindBy(xpath = "//div[@class='panel-heading title_rtl']")
    private WebElement pageTitle;

    //Blogs titles
    @FindBy(xpath = "//div[@class='col-md-8']//h4")
    private List<WebElement> blogTitles;

    //Blogs dates
    @FindBy(xpath = "//div[@class='col-md-8']//span")
    private List<WebElement> blogDates;

    //Blog desc
    @FindBy(xpath = "//p[@class='RTL']")
    private List<WebElement> blogDesc;

    //Quick Search title
    @FindBy(xpath = "//div[@class='panel-heading go-text-right']")
    private WebElement searchTitle;

    //Search Box
    @FindBy(xpath = "//input[@name='s']")
    private WebElement searchBox;

    //Search Button
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchBtn;

    //Categories and Posts
    @FindBy(xpath = "//div[@class='list-group']//div[@class='panel-heading go-text-right']")
    private WebElement categoriesAndPostsTitle;

    //Categories and Posts options
    @FindBy(xpath = "//a[@class='list-group-item']")
    private List<WebElement> categoriesAndPostsOptions;

    //Categories and Posts titles
    @FindBy(xpath = "//a[@class='list-group-item']//strong")
    private List<WebElement> categoriesAndPostsTitles;

    //Popular posts section title
    @FindBy(xpath = "//div[@class='panel panel-default']//div[@class='panel-heading go-text-right']" )
    private WebElement popularPostsSectionTitle;

    //Popular posts content
    @FindBy(xpath = "//div[@class='content']//div[@class='row']")
    private List<WebElement> popularPostsContent;

    //Popular posts title
    @FindBy(xpath = "//div[@class='row']//h5")
    private List<WebElement> popularPostsTitle;

    //Popular posts date
    @FindBy(xpath = "//div[@class='row']//p[@class='text-warning weak']")
    private List<WebElement> popularPostsDate;

    //Select page
    @FindBy(xpath = "//ul[@class='nav nav-pills nav-justified']//li")
    private List<WebElement> selectPage;







}
