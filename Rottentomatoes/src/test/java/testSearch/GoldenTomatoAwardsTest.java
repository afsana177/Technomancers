package testSearch;

import home.GoldenTomatoAwards;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GoldenTomatoAwardsTest extends RottentomatoHome {

    @Test
    public void clickOnGoldenTomatoAwards(){
        GoldenTomatoAwards gldnTmtArd= PageFactory.initElements(driver,GoldenTomatoAwards.class);
        gldnTmtArd.clickGoldenTomatoAwards();
    }
}