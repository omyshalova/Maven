package tests;

import manager.ApplicationManager;
import manager.dto.StudentDTO;
import manager.enums.Gender;
import manager.enums.Hobbies;
import manager.enums.StateCity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormTests extends ApplicationManager {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void practiceFormPositiveTest() {
        List<Hobbies> listHobbies = new ArrayList<>();
        listHobbies.add(Hobbies.SPORTS);
        listHobbies.add(Hobbies.MUSIC);
        StudentDTO student = new StudentDTO("Frodo", "Baggins", "frodobaggins@mail.com",
                Gender.FEMALE, "1234567890", "12 Sep 1900", "Math, Physics, Economics",
                listHobbies, "", "Haifa st 1 app 2",
                StateCity.UTTAR_PRADESH.getState(), StateCity.UTTAR_PRADESH.getCity()[2]);
        //student.setName("Frodo");
        //student.setLastName("Baggins");
        //student.setEmail("frodobaggins@mail.com");
        //student.setGender(Gender.FEMALE);
        Assert.assertTrue(new HomePage(getDriver())
                .clickBtnForms()
                .clickBtnPracticeForm()
                .typeStudentForm(student)
                .clickBtnSubmit()
                .isTextToBePresent_textThanksFor())
        ;
    }

    @Test
    public void practiceFormPositiveTest1() {
        List<Hobbies> listHobbies = new ArrayList<>();
        listHobbies.add(Hobbies.SPORTS);
        listHobbies.add(Hobbies.MUSIC);
        StudentDTO student = new StudentDTO("Frodo", "Baggins", "frodobaggins@mail.com",
                Gender.FEMALE, "1234567890", "12 Sep 1900", "Math, Physics, Economics",
                listHobbies, "", "Haifa st 1 app 2",
                StateCity.UTTAR_PRADESH.getState(), StateCity.UTTAR_PRADESH.getCity()[2]);
        //student.setName("Frodo");
        //student.setLastName("Baggins");
        //student.setEmail("frodobaggins@mail.com");
        //student.setGender(Gender.FEMALE);
        new HomePage(getDriver())
                .clickBtnForms()
                .clickBtnPracticeForm()
                .typeStudentForm(student)
                .clickBtnSubmit()

        ;
        WebElement elementNameFamily = getDriver().findElement(By.xpath("//tbody/tr[1]/td[last()]"));
        softAssert.assertEquals("Frodo Baggins", elementNameFamily.getText());

        WebElement elementEmail = getDriver().findElement(By.xpath("//tbody/tr[2]/td[last()]"));
        softAssert.assertEquals("frodobaggins@mail.com", elementEmail.getText());

        softAssert.assertAll();

    }
}