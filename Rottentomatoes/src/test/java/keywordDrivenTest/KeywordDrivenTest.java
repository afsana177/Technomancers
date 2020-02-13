package keywordDrivenTest;
import static base.CommonAPI.driver;
import keyWordDriven.Features;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class KeywordDrivenTest {
    @Test
    public void testKeyWord()throws InterruptedException, IOException {
        Features features = PageFactory.initElements(driver, Features.class);
        features.selectFeatures(driver);
    }
}
