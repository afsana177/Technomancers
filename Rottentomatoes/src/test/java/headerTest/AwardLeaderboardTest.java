package headerTest;

import header.AwardLeaderboard;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AwardLeaderboardTest extends RottentomatoHome {

    @Test(priority = 1)
    public void userGoToAwardLeaderboardBtn() throws InterruptedException {
        AwardLeaderboard ardLdrbrd = PageFactory.initElements(driver,AwardLeaderboard.class);
        ardLdrbrd.userClickOnAwardLeaderboard();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void userCanClickLikeBtn() throws InterruptedException {
        AwardLeaderboard ardLdrbrd = PageFactory.initElements(driver,AwardLeaderboard.class);
        ardLdrbrd.userClickOnAwardLeaderboard();
        ardLdrbrd.userClickOnLikeBtn();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void userCanClickOnShareBtn() throws InterruptedException {
        AwardLeaderboard ardLdrbrd = PageFactory.initElements(driver,AwardLeaderboard.class);
        ardLdrbrd.userClickOnAwardLeaderboard();
        ardLdrbrd.userClickOnLikeBtn();
        ardLdrbrd.userCanShareBtn();
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void UserCanClickOnTwitterBtn() throws InterruptedException {
        AwardLeaderboard ardLdrbrd = PageFactory.initElements(driver,AwardLeaderboard.class);
        ardLdrbrd.userClickOnAwardLeaderboard();
        ardLdrbrd.userClickOnLikeBtn();
        ardLdrbrd.userCanShareBtn();
        ardLdrbrd.clickTwitterBtn();
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void UserCanPutComments() throws InterruptedException {
        AwardLeaderboard ardLdrbrd = PageFactory.initElements(driver, AwardLeaderboard.class);
        ardLdrbrd.userClickOnAwardLeaderboard();
        ardLdrbrd.userClickOnLikeBtn();
        ardLdrbrd.userCanShareBtn();
        ardLdrbrd.clickTwitterBtn();
        ardLdrbrd.joinTheDiscussion();
        Thread.sleep(2000);
    }
}