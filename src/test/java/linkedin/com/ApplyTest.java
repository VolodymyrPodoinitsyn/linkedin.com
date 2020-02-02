package linkedin.com;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class ApplyTest extends BaseTest {

    private static Logger log = Logger.getLogger(ApplyTest.class.getName());

    @Test
    public void testApply() {
        log.info("Starting test Apply");
        homePage = new HomePage(driver);
        log.info("Home page is opened");
        applyPage = homePage.clickSingInButton();
        log.info("User clicked on the singInButton");
        applyPage.inputEmailOrPhone("podoinitsynvladimir@gmail.com");
        log.info("User input email \"podoinitsynvladimir@gmail.com\"");
        applyPage.inputPassword("0677522555VP");
        log.info("User input password \"0677522555VP\"");
        myPage = applyPage.clickSingIn();
        log.info("User clicked singInButton and opened page myPage");
        String name = myPage.getMyName();
        Assert.assertEquals("Volodymyr Podoinitsyn", name);
        log.info("Took a name on myPage and compared with the expected name");
    }
}
