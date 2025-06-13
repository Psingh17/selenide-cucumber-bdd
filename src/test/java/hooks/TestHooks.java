package hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import static com.codeborne.selenide.Selenide.*;
import static utils.ConfigReader.*;

public class TestHooks {

    @Before
    public void setup() {
        Configuration.browser = System.getProperty("selenide.browser", "chrome");
        Configuration.timeout = 8000;
        Configuration.reportsFolder = "target/allure-results";

        // Configuration.browserSize = "1920*1080";
        Configuration.baseUrl = get("base.url");

        // WebDriverRunner.getWebDriver().manage().window().maximize();

    }

    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Attach screenshot to Allure
            byte[] screenshot = ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
            Allure.getLifecycle().addAttachment(
                    "Failure Screenshot", "image/png", "png", screenshot
            );
        }

        closeWebDriver();
    }

}
