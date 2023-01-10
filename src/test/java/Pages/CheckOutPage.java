package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{
    @FindBy(id = "first-name")
    public WebElement firstNameTxt;

    @FindBy(id = "last-name")
    public WebElement lastNameTxt;

    @FindBy(id = "postal-code")
    public WebElement zipTxt;

    @FindBy(id = "continue")
    public WebElement continueBtn;

    @FindBy(css = ".inventory_item_price")
    public WebElement thridPriceCheck;

    @FindBy(css = ".complete-header")
    public WebElement messageTxt;

    @FindBy(id = "checkout")
    public WebElement checkOutBtn;




}
