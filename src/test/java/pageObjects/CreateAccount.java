package pageObjects;

import elementMapper.CreateAccountElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Brouser;


public class CreateAccount extends CreateAccountElementMapper {
    public CreateAccount(){
        PageFactory.initElements(Brouser.getCurrentDriver(), this); }

public void clickBtnMr(){
        btnOptionMr.click();
}

    public void firstNameTop(){ firstName1.sendKeys("Joao");}

    public void lastNameTop(){ lastName1.sendKeys("Silva");}

    public void passWord(){ passwd.sendKeys("reset12345");}

    public void dayBirthAccout() {
       btnBirthDaysDai.sendKeys("5");
        // Select day = new Select(Browser.getCurrentDriver().findElement(By.id("days")));
        //day.selectByValue("5");
    }
    public void mouthBirthAccout(){
       btnBirthDaysMonths.sendKeys("May");
        // Select mouth = new Select(Browser.getCurrentDriver().findElement(By.cssSelector("#months")));
        //mouth.selectByValue("2");
    }
    public void yaarsBirthAccout(){
        btnBirthDaysYears.sendKeys("1987");
        //Select years = new Select(Browser.getCurrentDriver().findElement(By.id("years")));
        //years.selectByValue("1984");
    }

    public Boolean isCreateAcoountPage(){ return getCreateAccount().contains("Authentication");}

    public String getCreateAccount() { return creatAccontPage.getText();}

    public void fistName2Down(){ firstName2.sendKeys("Joao"); }

    public void lastName2Down(){ lastName2.sendKeys("Silva"); }

    public void addressAccountUp(){ address1box.sendKeys("Kendall Drive");}

    public void addressAccountDown(){ address2box.sendKeys("7720");}

    public void cityAddress(){ cityAddress.sendKeys("Miami");}



    public void stateAddress(){
        btnStateAddress.sendKeys("Florida");
        //Select state = new Select(Browser.getCurrentDriver().findElement(By.id("id_state")));
        //state.selectByValue("9");
    }


    public void postalCode(){ postalCodeAddress.sendKeys("00000");}

    public void countryAddress(){
        coutryAdressBox.sendKeys("United States");
    }
    public void mobileNumberAccount(){ mobileNumber.sendKeys("555555555");}

    public void clickSubmitAccount(){ submitAccount.click();}

    public void fillaccouth(){
        clickBtnMr();firstNameTop();lastNameTop();passWord();dayBirthAccout();
        mouthBirthAccout();yaarsBirthAccout();fistName2Down();lastName2Down();
        addressAccountUp();addressAccountDown();cityAddress();stateAddress();
        postalCode();countryAddress();mobileNumberAccount();


    }


}
