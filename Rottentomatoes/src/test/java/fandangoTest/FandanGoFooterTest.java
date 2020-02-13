package fandangoTest;

import fandango.FandanGoFooter;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FandanGoFooterTest extends RottentomatoHome {

    @Test
    public void linkToUsBtn() {
        FandanGoFooter fndnGoftr = PageFactory.initElements(driver,FandanGoFooter.class);
        fndnGoftr.clickLinkToUs();
    }
    @Test
    public void fandangoRewardsBtn()  {
        FandanGoFooter fndnGoftr = PageFactory.initElements(driver,FandanGoFooter.class);
        fndnGoftr.clickOnFandangoRewards();

    }
    @Test
    public void siteIndexBtn() {
        FandanGoFooter fndnGoftr = PageFactory.initElements(driver,FandanGoFooter.class);
        fndnGoftr.clickSiteIndex();
    }
    @Test
    public void fandangoNowBtn() {
        FandanGoFooter fndnGoftr = PageFactory.initElements(driver,FandanGoFooter.class);
        fndnGoftr.clickFandangoNow();
    }
    @Test
    public void movieClipBtn() {
        FandanGoFooter fndnGoftr = PageFactory.initElements(driver,FandanGoFooter.class);
        fndnGoftr.clickMovieClips();
    }
    @Test
    public void moviesComBtn() {
        FandanGoFooter fndnGoftr = PageFactory.initElements(driver,FandanGoFooter.class);
        fndnGoftr.clickMoviesCom();
    }
    @Test
    public void flixterComBtn() {
        FandanGoFooter fndnGoftr = PageFactory.initElements(driver,FandanGoFooter.class);
        fndnGoftr.clickFlixterCom();
    }
    @Test
    public void testUserCanNavigateToMvTickets(){
        FandanGoFooter fndnGoftr = PageFactory.initElements(driver,FandanGoFooter.class);
        fndnGoftr.clickMovieTicketsCom();
    }
    @Test
    public void userCanNavigateToFandangoLatinAmerica(){
        FandanGoFooter fndnGoftr = PageFactory.initElements(driver,FandanGoFooter.class);
        fndnGoftr.clickFandangoLatinAmerica();
    }
    @Test
    public void userCanNavigateToIngresso(){
        FandanGoFooter fndnGoftr = PageFactory.initElements(driver,FandanGoFooter.class);
        fndnGoftr.clickIngresso();
    }
}