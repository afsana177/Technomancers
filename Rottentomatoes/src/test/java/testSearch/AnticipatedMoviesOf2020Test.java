package testSearch;

import home.AnticipatedMoviesOf2020;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AnticipatedMoviesOf2020Test extends RottentomatoHome {

    @Test
    public void clickOnAnticipatedMoviesOf2020() throws InterruptedException {
        AnticipatedMoviesOf2020 anticipatedMvs= PageFactory.initElements(driver,AnticipatedMoviesOf2020.class);
        anticipatedMvs.anticipatedMoviesOf2020();
        Thread.sleep(2000);
    }
}