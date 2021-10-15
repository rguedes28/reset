package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElementMapper {

   @FindBy(className = "login")
    public WebElement signIn;

    public WebElement search_query_top;

    @FindBy(css = "button.btn.btn-default.button-search")
    public WebElement submit_search;

    @FindBy(css = "a.sf-with-ul")
    public WebElement womenBtnCatgory;





}
