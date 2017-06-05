package stepImpl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.OratorPage;
import java.io.IOException;
import java.net.MalformedURLException;
import static stepImpl.AndroidSetup.driver;

/**
 * Created by Osanda on 4/29/2017.
 */

public class TestScenario {

    @Before
    public void setUp(){
        try {
            AndroidSetup.prepareAndroidForAppium();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void oratorSpeakTest() {
        OratorPage oratorPage = PageFactory.initElements(driver, OratorPage.class);
        String text = "Orator testing completed successfully";
            try {
                oratorPage.speakTest(text);
                System.out.println("Test passed!");
            } catch (Exception e) {
                System.out.println("Test failed!");
                e.printStackTrace();
            }
        }

    @After
    public void after(){
        AndroidSetup.TearDown();
    }

}
