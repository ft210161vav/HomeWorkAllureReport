import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AllureTest extends BaseTest{

    @Test
    private void SearchAllure(){
        super.openPage();
    WebElement input =driver.findElement(By.name("q"));
    input.sendKeys("Allure report");
    }
}
