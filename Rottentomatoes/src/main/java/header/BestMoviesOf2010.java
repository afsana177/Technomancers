package header;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BestMoviesOf2010 extends CommonAPI {

    @FindBy(xpath = "insert into movie (id,name) values ('01','Frozen');") WebElement bestMoviesOf2010;

    public void BestMovieOf2010(){
        bestMoviesOf2010.click();
    }
}