package testSearch;

import home.FreshPicks;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FreshPicksTest extends RottentomatoHome {

    @Test
    public void goToCertifiedFreshPicks()  {
        FreshPicks frshPicks = PageFactory.initElements(driver,FreshPicks.class);
        frshPicks.infoAbtNewMvs();
    }
    @Test
    public void goToBadBoysForLife() {
        FreshPicks frshPicks = PageFactory.initElements(driver, FreshPicks.class);
        frshPicks.infoAboutBadBoysForLife();
    }
    @Test
    public void goToParasite() {
        FreshPicks frshPicks = PageFactory.initElements(driver, FreshPicks.class);
        frshPicks.infoAboutParasite();
    }
    @Test
    public void goToStarTrek() {
        FreshPicks frshPicks = PageFactory.initElements(driver, FreshPicks.class);
        frshPicks.infoAboutStarTrek();
    }
    @Test
    public void goToCheer() {
        FreshPicks frshPicks = PageFactory.initElements(driver, FreshPicks.class);
        frshPicks.infoAboutCheer();
    }
    @Test
    public void clickOnViewAll()  {
        FreshPicks frshPicks = PageFactory.initElements(driver, FreshPicks.class);
        frshPicks.hitViewAllBtn();
    }
}