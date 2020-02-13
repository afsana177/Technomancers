package headerTest;

import header.OscarBallot;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class OscarBallotTest extends RottentomatoHome {

    @Test(priority = 1)
    public void userGoToOscarBallot(){
        OscarBallot oscarBlt = PageFactory.initElements(driver,OscarBallot.class);
        oscarBlt.oscarBallot2020();
    }
    @Test(priority = 2)
    public void clickOnBestPicture() throws InterruptedException {
        OscarBallot oscarBlt = PageFactory.initElements(driver,OscarBallot.class);
        oscarBlt.oscarBallot2020();
        oscarBlt.bestPicturePg();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void clickOnDirectingBtn() throws InterruptedException {
        OscarBallot oscarBlt = PageFactory.initElements(driver,OscarBallot.class);
        oscarBlt.oscarBallot2020();
        oscarBlt.bestPicturePg();
        oscarBlt.directingBtn();
        Thread.sleep(2000);
    }
}