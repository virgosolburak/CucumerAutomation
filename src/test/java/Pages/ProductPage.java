package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory']")
    public List<WebElement> allProducts;
//div[@class='inventory_item_price']
    @FindBy(xpath = "//div[@class='inventory_item_price']")
    public List<WebElement> allProductsCosts;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement marketIcon;
}
