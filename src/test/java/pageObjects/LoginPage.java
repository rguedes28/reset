package pageObjects;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Brouser;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage(){
        PageFactory.initElements(Brouser.getCurrentDriver(), this);
    }

    public void fillEmail(){
        email.sendKeys("rafaelpguedes@gmail.com");
    }
    public void fillPasswd(){
        passwd.sendKeys("reset28");
    }
    public void clickBtnSubmitLogin(){
        SubmitLogin.click();
    }
}
