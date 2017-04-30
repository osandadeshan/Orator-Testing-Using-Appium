package scenarios;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;
import java.net.MalformedURLException;

import static scenarios.AndroidSetup.driver;

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
    public void oratorTest()
    {
        String app_package_name = "maxsoft.osanda.com.oratortextreader:id/";
        By txtField = By.id(app_package_name + "txtText");
        By speakButton = By.id(app_package_name + "btnSpeak");

        try {
            driver.findElement(txtField).sendKeys("Orator testing completed successfully");
            driver.findElement(speakButton).click();
            System.out.println("Test passed!");
        } catch (Exception e) {
            System.out.println("Test failed!");
            e.printStackTrace();
        }
    }

}
