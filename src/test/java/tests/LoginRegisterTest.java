package tests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.MainPage;

public class LoginRegisterTest extends TestMethods{

        //Logger Creation
        private static final Logger logger = LogManager.getLogger();


        @Test
        public void register() throws InterruptedException {
                MainPage mainPage = new MainPage(driver);
                mainPage.startRegister()
                        .sendName("Dawid")
                        .sendSurname("Cegla")
                        .sendPhoneNum("817628162")
                        .sendEmailAddress("kjdhssa3eo@wp.pl")
                        .sendPassword("ffffffff3333")
                        .submitRegister()
                        .returnToMainPage();


        }

        @Test
        public void login() throws InterruptedException {
                MainPage mainPage = new MainPage(driver);
                mainPage.startLogin()
                        .sendEmail("kjdhao@wp.pl")
                        .sendPassword("ffffffff3333")
                        .selectRememeberMe()
                        .submitLogin()
                        .returnToMainPage();


        }




}
