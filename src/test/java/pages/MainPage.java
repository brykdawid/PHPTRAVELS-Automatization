package pages;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class MainPage {

    //Main Page Button
    @FindBy(xpath = "//img[@alt='PHPTRAVELS | Travel Technology Partner']")
    private WebElement mainPageButton;

    //Home Button
    @FindBy(xpath = "//a[text()='Home']")
    private WebElement homeButton;

    //Blog Button
    @FindBy(xpath = "//a[text()='Blog']")
    private WebElement blogButton;

    //Offers Button
    @FindBy(xpath = "//a[text()='Offers']")
    private WebElement offers;

    //My account
    @FindBy(xpath = "//i[@text()='My Account']")
    private WebElement myAccoutButton;

    //Login Options
    @FindBy(xpath = "//li[@id='li_myaccount']//ul[@class='dropdown-menu']")
    private List<WebElement> loginOptions;

    //Currency Hover Over
    @FindBy(xpath = "//i[@class='icon-money-2 go-right']")
    private WebElement currency;

    //Select Currency
    @FindBy(xpath = "//ul[@class='dropdown-menu wow fadeIn animated']//li//a[@onclick='change_currency(this)']")
    private List<WebElement> selectCurrency;

    //Language Hover Over
    @FindBy(xpath = "//li[@class='dropdown']//a[@class='go-text-right dropdown-toggle']")
    private WebElement language;

    //Select Language
    @FindBy(xpath = "//li//a[@class='go-text-right changelang']" )
    private List<WebElement> selectLanguage;


    //Blogs
    //Home Page Blogs
    @FindBy(xpath = "//div[@class='col-md-4']//div[@class='probox']")
    private List<WebElement> homePageBlogs;

    //Home Page Blogs Titles
    @FindBy(xpath = "//div[@class='col-md-4']//div[@class='probox']//h4//strong")
    private List<WebElement> homePageBlogsTitles;

    //Home Page Blogs Description
    @FindBy(xpath = "//div[@class='col-md-4']//div[@class='probox']//p")
    private List<WebElement> homePageBlogsDesc;



    //Featured Hotels
    //Right Arrow
    @FindBy(xpath = "//i[@class='icon-right-open-3']")
    private WebElement featuredHotelsArrowRight;

    //Left Arrow
    @FindBy(xpath = "//i[@class='icon-left-open-3']")
    private WebElement featuredHotelsArrowLeft;

    //Featured Hotel Card
    @FindBy(xpath = "//div[@class='owl-item']//div[@class='overlay']")
    private List<WebElement> featuredHotelCards;

    //Featured Hotels Titles
    @FindBy(xpath = "//div[@class='owl-item']//h4[@class='ellipsis go-text-right']")
    private List<WebElement> featuredHotelsTitles;

    //Featured Hotels Location
    @FindBy(xpath = "//div[@class='owl-item']//p[@class='go-text-right']")
    private List<WebElement> featuredHotelsLocation;

    //Featured Hotel Price
    @FindBy(xpath = "//div[@class='additional-info']//span[@class='text-center']")
    private List<WebElement> featuredHotelPrice;



    //Featured Flights
    //Arrow Right
    @FindBy(xpath = "//i[@class='glyphicon-chevron-right icon-angle-right flight-right']")
    private WebElement featuredFlightsArrowRight;

    //Arrow Left
    @FindBy(xpath = "//i[@class='glyphicon-chevron-right icon-angle-left flight-left']")
    private WebElement featuredFlightsArrowLeft;

    //Featured Flights Cards
    @FindBy(xpath = "//div[@class='flight-box-styling']")
    private List<WebElement> featuredFlightCards;

    //Featured Hotels Airlines
    @FindBy(xpath = "//div[@class='flight-box-styling']//p[@class='text-center']")
    private List<WebElement> featuredFlightsAirlines;

    //Featured Flights Price
    @FindBy(xpath = "//div[@class='flight-box-styling']//h3")
    private List<WebElement> featuredFlightsPrice;

    //Featured Tours
    //Cards
    @FindBy(xpath = "//div[@class='wpb_column vc_column_container vc_col-sm-6']")
    private List<WebElement> featuredToursCards;

    //Cards title
    @FindBy(xpath = "//div[@class='hotel-body']//h3")
    private List<WebElement> featuredToursTitles;

    //Cards location
    @FindBy(xpath = "//div[@class='hotel-body']//i[@class='icon-location-6 go-text-right go-right']")
    private List<WebElement> featuredToursLocation;

    //Card price
    @FindBy(xpath = "//div[@class='hotel-person']//span[@class='text-center']")
    private List<WebElement> featuredToursPrice;

    //Card Book Now Btn
    @FindBy(xpath = "//a[text()=' Book Now']")
    private List<WebElement> featuredToursBookNowBtn;

    //Featured Cars
    //Cards
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-6 owl-item mt25 cars']")
    private List<WebElement> featuredCarsCards;

    //Cards title
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-6 owl-item mt25 cars']//h4")
    private List<WebElement> featuredCarsTitle;
    
    //Cards location
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-6 owl-item mt25 cars']//p")
    private List<WebElement> featuredCarsLocation;

    //Cards Price
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-6 owl-item mt25 cars']//span[@class='text-center']")
    private List<WebElement> featuredCarsPrice;

    //Special Offer
    //Title
    @FindBy(xpath = "//div[@class='col-md-5']//strong")
    private WebElement specialOfferTitle;

    //Description
    @FindBy(xpath = "//div[@class='col-md-5']//p")
    private WebElement specialOfferDesc;

    //Big Save info
    @FindBy(xpath = "//div[@class='col-md-7']//span[@class='wow bounce ttu animated']")
    private WebElement bigSaveInfo;

    //View More Offers Button
    @FindBy(xpath = "//a[@class='loader btn btn-primary btn-block p16']")
    private WebElement viewMoreOffersBtn;


    //Mobile App Section
    //Title
    @FindBy(xpath = "//div[@class='col-md-8 fr tr']//h3")
    private WebElement mobileAppSectionTitle;

    //Desc
    @FindBy(xpath = "//div[@class='col-md-8 fr tr']//h5")
    private WebElement mobileAppSectionDesc;

    //Download button
    @FindBy(xpath = "//a[@class='footer__downloadButton']")
    private List<WebElement> mobileAppDownloadBtn;

    //Footer
    //Newsletter Columns
    //Title
    @FindBy(xpath = "//div[@class='col-md-3 grey go-right col-xs-12']//h2")
    private WebElement leftColumnTitle;

    //Email Input
    @FindBy(xpath = "//input[@type='email']")
    private WebElement leftColumnEmailInput;

    //Subscribe button
    @FindBy(xpath = "//button[text()=' Subscribe']")
    private WebElement leftColumnSubscribeBtn;

    //Other Columns Column
    //Title
    @FindBy(xpath = "//div[@class='wow fadeIn col-sm-4 col-xs-12 col-md-3 go-right animated']//h2")
    private List<WebElement> midLeftColumnTitle;

    //Links
    @FindBy(xpath = "//ul[@class='footerlist go-right go-text-right']//li")
    private List<WebElement> midLeftColumnLinks;

    //Under Footer
    //Supplier SignUp
    @FindBy(xpath = "//a[@class='btn btn-warning btn-block']")
    private WebElement supplierSignUpBtn;

    //Extranet Login
    @FindBy(xpath = "//a[@class='btn btn-success btn-block']")
    private WebElement extranetSignUpBtn;

    //Scroll Up Button
    @FindBy(xpath = "//a[@class='gotop scroll wow fadeInUp btn btn-default animated']")
    private WebElement scrollUpButton;

    //Social Media Buttons
    //Facebook
    @FindBy(xpath = "//a[@data-original-title='Facebook']")
    private WebElement facebookBtn;

    //Twitter
    @FindBy(xpath = "//a[@data-original-title='Twitter']")
    private WebElement twitterBtn;

    //Youtube
    @FindBy(xpath = "//a[@data-original-title='Youtube']")
    private WebElement youtubeBtn;

    //Google
    @FindBy(xpath = "//a[@data-original-title='Google+']")
    private WebElement googleBtn;

    //RSS
    @FindBy(xpath = "//a[@data-original-title='RSS']")
    private WebElement rrsBtn;



    


}
