package header;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OscarBallot extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'Your 2020 Oscar Ballot')]") WebElement your2020OscarBallot;
    @FindBy(xpath = "//img[@class='alignnone size-full wp-image-172397']") WebElement bestPicture;
    @FindBy(xpath = "//img[@class='alignnone size-full wp-image-172397']") WebElement directing;

    public void oscarBallot2020(){
        your2020OscarBallot.click();
    }
    public void bestPicturePg(){
        bestPicture.click();
    }
    public void directingBtn(){
        directing.click();
    }
}