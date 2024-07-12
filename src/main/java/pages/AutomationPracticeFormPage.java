package pages;

import manager.dto.StudentDTO;
import manager.enums.Gender;
import manager.enums.Hobbies;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class AutomationPracticeFormPage extends BasePage{
    public AutomationPracticeFormPage(WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(
                new AjaxElementLocatorFactory(driver,10), this);
    }

    @FindBy(id = "firstName")
    WebElement fieldFirstName;
    @FindBy(id = "lastName")
    WebElement fieldLastName;
    @FindBy(xpath = "//input[@placeholder='name@example.com']")
    WebElement fieldEmail;
    @FindBy(id = "userNumber")
    WebElement fieldMobileNumber;
    @FindBy(id = "dateOfBirthInput")
    WebElement fieldDateOfBirth;     //01 Jun 2020
    @FindBy(id = "subjectsInput")
    WebElement fieldSubjects;
    @FindBy(id = "currentAddress")
    WebElement fieldCurrentAddress;
    @FindBy(id = "react-select-3-input")
    WebElement fieldState;
    @FindBy(id = "react-select-4-input")
    WebElement fieldCity;
    @FindBy(xpath = "//button[@id='submit']")
    WebElement btnSubmit;

    @FindBy(id = "closeLargeModel")
    WebElement btnCloseModel;
    @FindBy(id = "example-modal-sizes-title-lg")
    WebElement textThanks;

    public AutomationPracticeFormPage typeStudentForm(StudentDTO student){
        hideFooter();
        fieldFirstName.sendKeys(student.getName());
        fieldLastName.sendKeys(student.getLastName());
        fieldEmail.sendKeys(student.getEmail());
        clickGender(student.getGender());
        fieldMobileNumber.sendKeys(student.getMobile());
        typeFieldDateOfBirth(student.getDateOfBirth());
        typeFieldSubjects(student.getSubjects());
        typeHobbies(student.getHobbies());
        fieldCurrentAddress.sendKeys(student.getCurrentAddress());
        fieldState.sendKeys(student.getState());
        fieldState.sendKeys(Keys.ENTER);
        fieldCity.sendKeys(student.getCity());
        fieldCity.sendKeys(Keys.ENTER);
        return this;
    }

    public AutomationPracticeFormPage clickBtnSubmit(){
        btnSubmit.click();
      return this;
    }

    private void typeHobbies(List<Hobbies> hobbies) {
        for (Hobbies h: hobbies) {
            switch (h){
                case MUSIC:
                    driver.findElement(By.cssSelector(h.getLocator())).click();
                    break;
                case SPORTS:
                    driver.findElement(By.cssSelector(h.getLocator())).click();
                    break;
                case READING:
                    driver.findElement(By.cssSelector(h.getLocator())).click();
                    break;
            }
        }
    }

    private void typeFieldSubjects(String subjects) {
        //Math, Physics, Economics
        String[] splitArray = subjects.split(", ");
        fieldSubjects.click();
        for (String str: splitArray) {
            fieldSubjects.sendKeys(str);
            fieldSubjects.sendKeys(Keys.ENTER);
        }
    }

    private void typeFieldDateOfBirth(String dateOfBirth) {
        fieldDateOfBirth.click();
        String operationSystem = System.getProperty("os.name");
        if(operationSystem.startsWith("Win"))
            fieldDateOfBirth.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        else if(operationSystem.startsWith("Mac"))
            fieldDateOfBirth.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        fieldDateOfBirth.sendKeys(dateOfBirth);
    }

    private void clickGender(Gender gender) {
        WebElement elementGender = driver.findElement(By.xpath(gender.getLocator()));
        elementGender.click();
    }

    public boolean isElementPresent_btnCloseModel(){
        return isElementPresentWithWait(textThanks, 5);
    }

}
