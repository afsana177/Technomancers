package headerTest;

import header.BestMoviesOf2010;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BestMoviesOf2010Test extends RottentomatoHome {

    @Test
    public void userCanfindBestMoviesOf2010() throws InterruptedException {
        BestMoviesOf2010 bstMvs = PageFactory.initElements(driver,BestMoviesOf2010.class);
        bstMvs.BestMovieOf2010();
        Thread.sleep(2000);
    }
}