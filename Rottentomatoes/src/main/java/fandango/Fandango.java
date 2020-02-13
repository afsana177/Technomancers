package fandango;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fandango extends CommonAPI {

    @FindBy(xpath = "//a[@class='icon left fandango-logo']") WebElement goToFandangoPage;
    @FindBy(xpath = "//a[@class='page-navigation-link is-selected']") WebElement nowPlaying;
    @FindBy(xpath = "//a[contains(@class,'page-navigation-link')][contains(text(),'Coming Soon')]") WebElement comingSoon;
    @FindBy(xpath = "//a[contains(text(),'Movie Genres')]") WebElement movieGenres;
    @FindBy(xpath = "//a[contains(@class,'page-navigation-link')][contains(text(),'Top Box Office')]") WebElement topBoxOffice;
    @FindBy(xpath = "//a[contains(text(),'At Home')]") WebElement atHome;
    @FindBy(xpath = "//a[@class='genre-menu__link'][contains(text(),'Action')]") WebElement action;
    @FindBy(xpath = "//a[@class='genre-menu__link'][contains(text(),'Drama')]") WebElement drama;
    @FindBy(xpath = "//a[@class='genre-menu__link'][contains(text(),'Comedy')]") WebElement comedy;
    @FindBy(xpath = "//a[@class='genre-menu__link'][contains(text(),'Kids')]") WebElement kids;
    @FindBy(xpath = "//a[@class='genre-menu__link'][contains(text(),'Horror')]") WebElement horror;
    @FindBy(xpath = "//a[@class='genre-menu__link'][contains(text(),'Romance')]") WebElement romance;
    @FindBy(xpath = "//a[@class='genre-menu__link'][contains(text(),'Sci-Fi')]") WebElement sciFi;
    @FindBy(xpath = "//a[@class='genre-menu__link'][contains(text(),'Animated')]") WebElement animated;
    @FindBy(xpath = "//a[@id='genreDropdownBtn']") WebElement more;
    @FindBy(xpath = "//a[@class='genre-menu__link--dropdown'][contains(text(),'IMAX')]") WebElement imax;


    public void fandangoPage(){ goToFandangoPage.click(); }
    public void clickNowPlaying(){ nowPlaying.click(); }
    public void clickComingSoon(){ comingSoon.click(); }
    public void ClickMovieGenres(){ movieGenres.click(); }
    public void clickTopBoxOffice(){ topBoxOffice.click(); }
    public void clickAtHome(){ atHome.click(); }
    public void clickAction(){ action.click(); }
    public void clickDrama(){ drama.click(); }
    public void clickComedy(){ comedy.click(); }
    public void clickKids(){ kids.click(); }
    public void clickHorror(){ horror.click(); }
    public void clickRomance(){ romance.click(); }
    public void clickSciFi(){ sciFi.click(); }
    public void clickAnimated(){ animated.click(); }
    public void clickMore(){ more.click();}
    public void clickImax(){ imax.click();
    }
}