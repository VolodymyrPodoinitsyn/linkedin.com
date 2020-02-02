package linkedin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyPage extends BasePage {

    public MyPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".profile-rail-card__actor-link.t-16.t-black.t-bold")
    private WebElement myName;

    public String getMyName(){
        wait.until(ExpectedConditions.visibilityOf(myName));
        String name = myName.getText();
        return name;
    }
}
