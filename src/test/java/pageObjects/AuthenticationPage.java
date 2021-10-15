package pageObjects;

import elementMapper.AuthenticationPageElemmentMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Brouser;

public class AuthenticationPage extends AuthenticationPageElemmentMapper {

    public AuthenticationPage(){
        PageFactory.initElements(Brouser.getCurrentDriver(), this);  }

    public void fillCreaEmail() {
      createEmailBox.sendKeys("miguelsslislac@hotmail.com");}



    public void clickBtCreateEmail(){
        btnCreateEmail.click();
    }

    public boolean isAuthenticPage( ) { return getAuthetforAtheuteticationPage().contains("Authentication");}

    public String getAuthetforAtheuteticationPage(){ return authePage.getText();}



}
