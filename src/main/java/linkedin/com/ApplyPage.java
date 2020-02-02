package linkedin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ApplyPage extends BasePage {

    public ApplyPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input")
    private List<WebElement> inputFields;

    @FindBy(css = ".btn__primary--large.from__button--floating")
    private WebElement singIn;

    public void inputEmailOrPhone(String emailOrPhone) {
        wait.until(ExpectedConditions.visibilityOf(inputFields.get(1)));
        inputFields.get(1).sendKeys(emailOrPhone);
    }

    public void inputPassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(inputFields.get(13)));
        inputFields.get(13).sendKeys(password);
    }

    public MyPage clickSingIn() {
        wait.until(ExpectedConditions.elementToBeClickable(singIn));
        singIn.click();
        return new MyPage(driver);
    }

}
