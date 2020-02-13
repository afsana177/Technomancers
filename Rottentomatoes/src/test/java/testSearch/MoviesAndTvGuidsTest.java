package testSearch;

import home.MoviesAndTvGuides;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MoviesAndTvGuidsTest extends RottentomatoHome {

    @Test
    public void clickOnMoviesAndTvGuids(){
        MoviesAndTvGuides mvsAndTv= PageFactory.initElements(driver,MoviesAndTvGuides.class);
        mvsAndTv.actionMovies();
    }
}