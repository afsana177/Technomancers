package testSearch;

import base.CommonAPI;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearch  extends CommonAPI {

    @Test(priority = 1)
    public void rottenTomatoPage() throws InterruptedException {
        RottentomatoHome rtmHome = PageFactory.initElements(driver,RottentomatoHome.class);
        rtmHome.userGoToRottenTomatoPage();
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void userGetTicketInfo() throws InterruptedException {
        RottentomatoHome rtmHome = PageFactory.initElements(driver, RottentomatoHome.class);
        rtmHome.userGoToRottenTomatoPage();
        rtmHome.ticketsInfo();
        Thread.sleep(2000);
    }
}