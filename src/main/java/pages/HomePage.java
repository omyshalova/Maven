
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        setDriver(driver);
        driver.get("https://demoqa.com/");
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,10), this);
    }

    @FindBy(xpath = "//div[@class='category-cards']/div[2]")
    WebElement btnForms;
    //WebElement btnForms = driver.findElement(By.xpath("//div[@class='category-cards']/div[2]"));

    public FormsPage clickBtnForms(){
        hideFooter();
        btnForms.click();
        return new FormsPage(driver);
    }
}
