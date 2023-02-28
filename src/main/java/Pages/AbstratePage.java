package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstratePage {
    protected WebDriver driver;
    protected Wait wait;
    private final int TIMEOUT=60;
    public AbstratePage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
    }
}
