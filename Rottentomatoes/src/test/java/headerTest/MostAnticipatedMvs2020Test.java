package headerTest;

import header.MostAnticipatedMvsOf2020;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MostAnticipatedMvs2020Test extends RottentomatoHome {

    @Test
    public void clickOnMostAnticipatedMvsBtn() throws InterruptedException {
        MostAnticipatedMvsOf2020 anticptdMv2020 = PageFactory.initElements(driver, MostAnticipatedMvsOf2020.class);
            anticptdMv2020.listOfMostAnticipatedMvsOf2020();
            Thread.sleep(2000);
        }
}