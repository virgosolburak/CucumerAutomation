package helper;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Helper {

    public static WebElement waitforClickibility(WebElement element, int timeout){
        WebDriverWait wait=new WebDriverWait(Driver.get(), Duration.ofSeconds(timeout));
            return  wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void clickElement(WebElement element){
        waitforClickibility(element,10);
        element.click();
    }

    public static void sendkey(WebElement element,String text){
        element.sendKeys(text);
    }

    public static void  clickSpesificElement(List<WebElement> elements,int count){
        elements.get(count-1).click();
    }

    public static void checkElementsTextAreSame(WebElement element1,WebElement element2){
         Assert.assertTrue(element1.getText().equals(element2.getText()));
    }

    public static void checkSpecificElementTextAreSame(List<WebElement> elements,int count,String text){
      Assert.assertTrue(elements.get(count).getText().contains(text));
    }


    public static void  clickSpecificText(List<WebElement> elements,String text){

        for (WebElement element:elements) {
            if(element.getText().contains(text)){
                element.click();
                System.out.println("Clicked");
                break;
            }

        }
    }
}
