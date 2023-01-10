package Pages;


import helper.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements( Driver.get(),this);
    }


}
