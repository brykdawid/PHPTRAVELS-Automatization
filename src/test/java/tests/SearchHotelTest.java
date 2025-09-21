package tests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.HotelMainPage;

public class SearchHotelTest extends TestMethods {

    //Logger Creation
    private static final Logger logger = LogManager.getLogger();


    @Test
    public void searchHotelTest () throws InterruptedException {

        HotelMainPage hotelSearchPage = new HotelMainPage(driver);

        HotelMainPage resultsPage = hotelSearchPage
                .setCity("Dubai")
                .setDates("21/07/2022","28/07/2022")
                .setTravelers(2,1)
                .submitSearch();

    }

}
