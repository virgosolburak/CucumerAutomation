package step_def;



import helper.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void setUp(){
        Driver.get().get("https://www.saucedemo.com/");
        Driver.get().manage().window().maximize();

    }

    @After
    public void tearDown(Scenario scenario) throws InterruptedException {

        Thread.sleep(2000);
        Driver.closeDriver();

    }


}
