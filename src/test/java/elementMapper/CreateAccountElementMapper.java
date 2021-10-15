package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountElementMapper {

    @FindBy(className = "navigation_page")
    public WebElement createAccoutAutheticPage;

    @FindBy(id = "uniform-id_gender1")
    public WebElement btnOptionMr;

    @FindBy(xpath = "//*[@id=\"customer_firstname\"]")
    public WebElement firstName1;

    @FindBy(xpath = "//*[@id=\"customer_lastname\"]")
    public WebElement lastName1;

    public WebElement passwd;

    @FindBy(id = "days")
    public WebElement btnBirthDaysDai;

    @FindBy(css = "#months")
    public WebElement btnBirthDaysMonths;

    @FindBy(id = "years")
    public WebElement btnBirthDaysYears;

    @FindBy(id = "firstname")
    public WebElement firstName2;

    @FindBy(id = "lastname")
    public WebElement lastName2;

    @FindBy(id = "address1")
    public WebElement address1box;

    @FindBy(id = "address2")
    public WebElement address2box;

    @FindBy(id = "city")
    public WebElement cityAddress;

    @FindBy(id = "id_state")
    public WebElement btnStateAddress;

    @FindBy(id = "id_country")
    public WebElement coutryAdressBox;

    @FindBy(id = "postcode")
    public WebElement postalCodeAddress;

    @FindBy(id = "phone_mobile")
    public WebElement mobileNumber;

    @FindBy(className = "navigation_page")
    public WebElement creatAccontPage;

    public WebElement submitAccount;

}


