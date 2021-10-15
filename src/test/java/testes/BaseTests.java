package testes;

import org.junit.After;
import org.junit.Before;
import utils.Brouser;
import utils.Utils;

public class BaseTests {
    @Before
    public void setup(){
        Brouser.loadPage(Utils.getBaseUrl());
    }
    @After
    public void tearDown(){
       Brouser.close();

    }

}
