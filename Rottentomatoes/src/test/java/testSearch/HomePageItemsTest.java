package testSearch;

import home.HomePageItems;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageItemsTest extends RottentomatoHome {

    @Test(priority = 1)
    public void userCanMouseHoverOnItems() throws InterruptedException {
        HomePageItems hmpg = PageFactory.initElements(driver,HomePageItems.class);
        hmpg.userCanMouseHoverOnMoviesAndDvds();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void userMouseHoverOnTv() throws InterruptedException {
        HomePageItems hmpg = PageFactory.initElements(driver,HomePageItems.class);
        hmpg.userCanMouseHoverOnMoviesAndDvds();
        hmpg.userCanMouseHoverOnTv();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void userMouseHoverOnNews(){
        HomePageItems hmpg = PageFactory.initElements(driver,HomePageItems.class);
        hmpg.userCanMouseHoverOnMoviesAndDvds();
        hmpg.userCanMouseHoverOnTv();
        hmpg.userCanMouseHoverOnNews();
    }
    @Test(priority = 4)
    public void userClickOnTicketsAndShowtimes() throws InterruptedException {
        HomePageItems hmpg = PageFactory.initElements(driver,HomePageItems.class);
        hmpg.userCanMouseHoverOnMoviesAndDvds();
        hmpg.userCanMouseHoverOnTv();
        hmpg.userCanMouseHoverOnNews();
        hmpg.userCanClickTicketsAndShowtimes();
        Thread.sleep(3000);
    }

}