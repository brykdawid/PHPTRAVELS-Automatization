package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.sql.Driver;

public class TestTest {


    @Test
    public void test() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(2000);

    }
}
