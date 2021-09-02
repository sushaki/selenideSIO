import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest1 extends BaseClassSelenide {
    @Test
    public void firstTestSelenide(){

       $(By.xpath("//div[@class='collapse navbar-collapse']//" +
                "a[contains(text(),'Input Forms')]")).shouldBe(Condition.visible).click();
       $(By.xpath("//div[@class='collapse navbar-collapse']//" +
               "a[contains(text(),'Simple Form Demo')]")).shouldBe(Condition.visible).click();
       $(By.xpath("//div[@class='form-group']//input[@id='user-message']"))
               .shouldBe(Condition.visible).sendKeys("Hello, my name is Ivan");
        $(By.xpath("//button[@class='btn btn-default'][contains(text(),'Show Message')]"))
                .shouldBe(Condition.visible).click();
        $(By.xpath("//div[@id='user-message']//span[@id='display']"))
                .shouldBe(Condition.enabled).getText();

    }
}
