package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageItems extends CommonAPI {

    @FindBy(css = "a[id='movieMenu']") WebElement moviesAndDvds;
    @FindBy(xpath = "//a[@id='tvMenu']") WebElement tv;
    @FindBy(xpath = "//a[@id='newsMenu']") WebElement news;
    @FindBy(xpath = "//a[@id='ticketingMenu']") WebElement ticketsAndShowtimes;


    public void userCanMouseHoverOnMoviesAndDvds(){
        mouseHoverByCSS("a[id='movieMenu']");
    }
    public void userCanMouseHoverOnTv(){
        mouseHoverByXpath("//a[@id='tvMenu']");
    }
    public void userCanMouseHoverOnNews(){
        mouseHoverByXpath("//a[@id='newsMenu']");
    }
    public void userCanClickTicketsAndShowtimes(){
        ticketsAndShowtimes.click();
    }
}