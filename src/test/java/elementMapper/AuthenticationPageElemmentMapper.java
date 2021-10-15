package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPageElemmentMapper {

    @FindBy(xpath = "//*[@id=\"email_create\"]")
    public WebElement createEmailBox;

    @FindBy(id = "SubmitCreate")
    public WebElement btnCreateEmail;

    @FindBy (className = "navigation_page")
    public WebElement authePage;



}
