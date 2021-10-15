package pageObjects;

import elementMapper.MyAcoountPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Brouser;


public class MyAcoountPage extends MyAcoountPageElementMapper {
    public MyAcoountPage(){
        PageFactory.initElements(Brouser.getCurrentDriver(),this); }

    public Boolean isMyAccountPage() { return getAuthemtivMyAccountPage().contains("My account");}

    public String getAuthemtivMyAccountPage(){ return myAccountNaviPage.getText();}


}
