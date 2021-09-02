import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseClassSelenide {
    @BeforeTest
    public void beforeTest() {
        Configuration.timeout = 35000;
        Configuration.browser = "Chrome";
        Configuration.startMaximized = true;
        open("https://www.seleniumeasy.com/test/");
        $(By.xpath("//a[@id='at-cv-lightbox-close']"))
                .shouldBe(Condition.visible).click();
        Configuration.holdBrowserOpen = true;
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {

        System.out.println("Test is finished");
    }
}

