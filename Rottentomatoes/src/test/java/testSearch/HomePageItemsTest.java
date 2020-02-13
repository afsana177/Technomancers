package testSearch;

import home.HomePageItems;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageItemsTest extends RottentomatoHome {

    @Test
    public void userCanMouseHoverOnItems() {
        HomePageItems hmpg = PageFactory.initElements(driver,HomePageItems.class);
        hmpg.userCanMouseHoverOnMoviesAndDvds();
    }
    @Test
    public void userMouseHoverOnTv() {
        HomePageItems hmpg = PageFactory.initElements(driver,HomePageItems.class);
        hmpg.userCanMouseHoverOnTv();
    }
    @Test
    public void userMouseHoverOnNews(){
        HomePageItems hmpg = PageFactory.initElements(driver,HomePageItems.class);
        hmpg.userCanMouseHoverOnNews();
    }
    @Test
    public void userClickOnTicketsAndShowtimes() {
        HomePageItems hmpg = PageFactory.initElements(driver,HomePageItems.class);
        hmpg.userCanClickTicketsAndShowtimes();
    }
}