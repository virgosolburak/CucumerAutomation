package step_def;

import Pages.CartPage;
import Pages.CheckOutPage;
import Pages.LoginPage;
import static helper.Helper.*;

import Pages.ProductPage;
import helper.Helper;
import io.cucumber.java.en.*;

import org.junit.Assert;

public class test_Stepdef {
LoginPage loginPage=new LoginPage();
ProductPage productPage=new ProductPage();
String firstPrice;
CartPage cartPage=new CartPage();
CheckOutPage checkOutPage=new CheckOutPage();
    @Given("User opens click something")
    public void user_opens_click_something() throws InterruptedException {
     Thread.sleep(5000);
    }
    @Given("Kullanıcı standat user ile siteye login olur {string} password {string}")
    public void kullanıcı_standat_user_ile_siteye_login_olur_password(String userName, String password) {
        sendkey(loginPage.userNameInput,userName);

        sendkey(loginPage.passwordInput,password);

        clickElement(loginPage.loginBtn);
    }


    @Given("Kullanıcı {int} ürünü sepete ekler")
    public void kullanıcı_ürünü_sepete_ekler(int count) {
        clickSpesificElement(productPage.allProducts,count);
        firstPrice=productPage.allProductsCosts.get(count-1).getText();

    }
    @Given("Kullanıcı sepet iconunu tıklar")
    public void kullanıcı_sepet_iconunu_tıklar() {
        clickElement(productPage.marketIcon);

    }
    @Given("Kullanıcı ana sayfada gelen ürünün fiyatının buradakiyle aynı olduğunu görür")
    public void kullanıcı_ana_sayfada_gelen_ürünün_fiyatının_buradakiyle_aynı_olduğunu_görür() {
        System.out.println("firstPrice = " + firstPrice);
        System.out.println("cartPage.secondPrice.getText() = " + cartPage.secondPrice.getText());

        Assert.assertTrue(firstPrice.contains(cartPage.secondPrice.getText()));

     //   clickElement(checkOutPage.checkOutBtn);

    }
    @Given("Kullanıcı checkOut butonunu tıklar")
    public void kullanıcı_checkOut_butonunu_tıklar() {
       clickSpecificText(cartPage.allButtons,"CHECKOUT");
    }
    @Given("Information page üzerinde isim alanına {string} soyisim alanına {string} posta kodu alnına {string} girer ve Continue butonunu tıklar")
    public void information_page_üzerinde_isim_alanına_soyisim_alanına_posta_kodu_alnına_girer_ve_Continue_butonunu_tıklar(String name, String surname, String zip) {
       sendkey(checkOutPage.firstNameTxt,name);
        sendkey(checkOutPage.lastNameTxt,surname);
        sendkey(checkOutPage.zipTxt,zip);
        clickElement(checkOutPage.continueBtn);
    }
    @Given("Item total tutarının ana sayfada görülen turarla aynı olduğu görülür")
    public void item_total_tutarının_ana_sayfada_görülen_turarla_aynı_olduğu_görülür() {

    Assert.assertTrue(firstPrice.contains(checkOutPage.thridPriceCheck.getText()));
    }
    @When("Kullanıcı Finish butonunu tıklar")
    public void kullanıcı_Finish_butonunu_tıklar() {
        clickSpecificText(cartPage.allButtons,"FINISH");
    }
    @Then("Kullanıcı {string} ikazını görür")
    public void kullanıcı_ikazını_görür(String expectedMessage) {
      Assert.assertTrue(checkOutPage.messageTxt.getText().equals(expectedMessage));

    }


}
