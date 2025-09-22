package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class HotelOfferPage {

    private WebDriver driver;

    private static final Logger logger = LogManager.getLogger();


    //Hotel title
    @FindBy(xpath = "//strong[@class='ellipsis ttu']//span")
    private WebElement hotelTitle;

    //Hotel location - ifVisible method needed
    @FindBy(xpath = "//span[@class='RTL']//text()")
    private WebElement hotelLocation;

    //Hotel address
    @FindBy(xpath = "//span[@class='RTL']//small")
    private WebElement hotelAddress;

    //Hotel Photos
    @FindBy(xpath = "//div[@class='fotorama__thumb fotorama__loaded fotorama__loaded--img']//img[@class='fotorama__img']")
    private List<WebElement> photos;

    //Social Media


    //Details
    //Desc title + Desc
    @FindBy(xpath = "//div[@class='visible-lg visible-md RTL']//p[text()]")
    private List<WebElement> hotelDesc;

    //Refine Dates
    //Check in date
    @FindBy(xpath = "//input[@name='checkin']")
    private WebElement checkInDate;

    //Check out date
    @FindBy(xpath = "//input[@name='checkout']")
    private WebElement checkOutDate;

    //Adults
    @FindBy(xpath = "//select[@id='adults']")
    private WebElement adults;

    //Adults options
    @FindBy(xpath = "//select[@id='adults']//option")
    private List<WebElement> adultOptions;

    //Child
    @FindBy(xpath = "//select[@id='child']")
    private WebElement child;

    //Adults options
    @FindBy(xpath = "//select[@id='child']//option")
    private List<WebElement> childOptions;

    //Nights count
    @FindBy(xpath = "//span[@class='pull-right go-left']//strong")
    private WebElement nightCount;

    //Modify button
    @FindBy(xpath = "//input[@value='Modify'")
    private WebElement modifyBtn;

    //Available Rooms cards
    @FindBy(xpath = "//tr//td[@class='wow fadeIn p-10-0 animated']")
    private List<WebElement> availableRoomCards;

    //Room title
    @FindBy(xpath = "//h4//b")
    private List<WebElement> roomTitle;

    //Amount of guests
    @FindBy(xpath = "//h4//small")
    private List<WebElement> amountOfGuest;

    //Room count
    @FindBy(xpath = "//select[@class='selectx input-sm']")
    private List<WebElement> roomCountSelect;

    //Options
    @FindBy(xpath = "//select[@class='selectx input-sm']//option")
    private List<WebElement> roomCountOptions;

    //Room more details button
    @FindBy(xpath = "//button[@data-toggle='collapse' and text()='More Details']")
    private List<WebElement> roomMoreDetailsBtn;

    //Photo gallery
    @FindBy(xpath = "//div[@class='magnific-gallery row']")
    private List<WebElement> photoGallery;

    //Room desc
    @FindBy(xpath = "//span[@class='rooms-text']//p")
    private List<WebElement> roomDetails;

    //Room amenities list
    @FindBy(xpath = "//div[@class='col-md-4']//li")
    private List<WebElement> roomAmenities;

    //Room availability button
    @FindBy(xpath = "//button[@data-toggle='collapse' and text()='Availability']")
    private List<WebElement> roomAvailabilityBtn;

    //Room Price
    @FindBy(xpath = "//h2//strong")
    private List<WebElement> roomPrice;

    //Select room checkbox
    @FindBy(xpath = "//label[@class='control control--checkbox ellipsis fs14']")
    private List<WebElement> roomSelectCheckbox;

    //Book now button
    @FindBy(xpath = "//button[@class='book_button btn btn-md btn-success btn-block btn-block chk mob-fs10 loader']")
    private WebElement bookNowBtn;

    //Privacy policy + Payment Types + Check In
    @FindBy(xpath = "//div[@class='clearfix']//p")
    private List<WebElement> additionalInfo;

    //Reviews
    @FindBy(xpath = "//div[@class='panel-body panel panel-default']//h4")
    private WebElement reviews;

    //Write Review Button
    @FindBy(xpath = "//button[@class='writeReview btn btn-primary btn-block']")
    private WebElement writeReviewBtn;

    //Select mark
    @FindBy(xpath = "//select[@id='32']")
    private List<WebElement> selectMark;

    //Select mark options
    @FindBy(xpath = "//select[@id='32']//option")
    private List<WebElement> selectMarkOptions;

    //Input name
    @FindBy(xpath = "//input[@name='fullname']")
    private WebElement inputName;

    //Input email
    @FindBy(xpath = "//input[@name='email']")
    private WebElement inputEmail;

    //Comment textarea
    @FindBy(xpath = "//textarea[@name='reviews_comments']")
    private WebElement commentTextarea;

    //Add comment button
    @FindBy(xpath = "//button[@id='32']")
    private WebElement addCommentBtn;

    //Comment added successfully popup
    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement commentAddedPopup;

    //Existing reviews usernames
    @FindBy(xpath = "//div[@id='REVIEWS']//tr//strong")
    private List<WebElement> reviewerNames;

    //Existing reviews dates
    @FindBy(xpath = "//div[@id='REVIEWS']//tr//small")
    private List<WebElement> reviewDate;

    //Existing reviews mark
    @FindBy(xpath = "//div[@id='REVIEWS']//span[@class='badge badge-warning pull-right go-left']")
    private List<WebElement> reviewMark;

    //Existing reviews desc
    @FindBy(xpath = "//div[@id='REVIEWS']//tr//br")
    private List<WebElement> existingReviews;


    //Related Listings
    //-to do


    public HotelOfferPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HotelOfferPage getHotelLocation(){
        logger.info("Hotel title: " +hotelTitle.getText());
        //logger.info("Hotel location: " +hotelLocation.getText());
        logger.info("Hotel address: " +hotelAddress.getText());


        return this;
    }

    public HotelOfferPage getHotelDetails(){
        logger.info("Paragraph Title: "+hotelDesc.get(0).getText());
        logger.info("Hotel desc: "+hotelDesc.get(1).getText());

        return this;
    }

    public HotelOfferPage refineDates() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
        Thread.sleep(500);

        checkInDate.click();
        //checkInDate.sendKeys("20/09/2025");

        checkOutDate.click();
        //checkOutDate.sendKeys("20/09/2025");
        adults.click();
        //Select random amount of adults
        int randomAdults = new Random().nextInt(adultOptions.size());
        adultOptions.get(randomAdults).click();
        //Select random amount of child
        int randomChild = new Random().nextInt(childOptions.size());
        childOptions.get(randomChild).click();
        //Wait until page reloads
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(nightCount));
        logger.info("Nights count: "+nightCount.getText());

        return this;
    }

    public HotelOfferPage getAvailableRoomsDetails() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 800);");
        Thread.sleep(500);

        for (int i = 0; i < roomTitle.size(); i++){
            logger.info("Iteration num: " +i);
            logger.info("Room title: "+roomTitle.get(i).getText());
            logger.info("Room size: "+amountOfGuest.get(i).getText());
            logger.info("Room price: "+roomPrice.get(i).getText());
        }

        return this;
    }

    public HotelOfferPage selectRoom(){
        int randomIndex = new Random().nextInt(availableRoomCards.size());

        //Select amount of rooms
        roomCountSelect.get(randomIndex).click();
        int randomOption = new Random().nextInt(roomCountOptions.size());
        roomCountOptions.get(randomOption);

        //More details
        roomMoreDetailsBtn.get(randomIndex).click();

        if (photoGallery.get(randomIndex).isDisplayed()){
            System.out.printf("Photo gallery propelry displayed");
        }
        else {
            System.out.printf("Photo gallery error");
        }
        logger.info("Room details: "+roomDetails.get(randomIndex).getText());
        IntStream.range(0,roomAmenities.size()).forEach(i ->
                System.out.println("Amenities num: "+i + " Amenities desc: "+roomAmenities.get(i).getText()));

        roomSelectCheckbox.get(randomIndex).click();

        bookNowBtn.click();

        return this;
        }


    }

