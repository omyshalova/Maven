package manager.experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPathSelectors {
    WebDriver driver;
    @Test
    public void selectorsXPath(){
        driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement fieldFirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        WebElement fieldLastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        // #lastName

        //driver.quit();
    }
}
