package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{
    @FindBy(xpath = "//div[@class='inventory_item_price']")
    public WebElement secondPrice;

    @FindBy(xpath = "//button")
    public List<WebElement> allButtons;

}
