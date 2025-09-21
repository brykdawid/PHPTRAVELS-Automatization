package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class DashboardPage extends LoginPage {
    private WebDriver driver;

    //Logger Creation
    private static final Logger logger = LogManager.getLogger();

    public DashboardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
    //Main Page Button
    @FindBy(xpath = "//img[@alt='My Account']")
    private WebElement mainPageButton;

    //My account
    @FindBy(xpath = "//a[@class='dropdown-toggle go-text-right']")
    private List<WebElement> myAccoutButton;

    public MainPage returnToMainPage() throws InterruptedException{
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(mainPageButton));

        Assert.assertEquals(myAccoutButton.get(2).getText(), "DAWID", "User DAWID logged in correctly");


        mainPageButton.click();
        Thread.sleep(500);

        return new MainPage(driver);
    }

}
