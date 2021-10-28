package page;

import model.ProcessData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage
{
    protected WebDriver driver;
    //protected ProcessData data;


    protected abstract AbstractPage openPage();
    protected final int WAIT_TIMEOUT_SECONDS = 10;

    protected AbstractPage(WebDriver driver/*, ProcessData data*/)
    {
        this.driver = driver;
       // this.data = data;
        PageFactory.initElements(driver, this);
    }
}

