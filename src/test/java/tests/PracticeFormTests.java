package tests;

import manager.ApplicationManager;
import manager.dto.StudentDTO;
import manager.enums.Gender;
import manager.enums.Hobbies;
import manager.enums.StateCity;
import org.apache.hc.core5.http.io.SessionOutputBuffer;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormTests extends ApplicationManager {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void practiceFormPositiveTest(){
        List<Hobbies> listHobbies = new ArrayList<>();
        listHobbies.add(Hobbies.SPORTS);
        listHobbies.add(Hobbies.MUSIC);

        StudentDTO student = new StudentDTO(
                "Frodo",
                "Baggins",
                "frodobaggins@mail.com",
                Gender.FEMALE,
                "1234567890",
                "12 Sep 1900",
                "Math, Physics, Economics",
                listHobbies,
                "",
                "Haifa st 1 app 2",
                StateCity.UTTAR_PRADESH.getState(),
                StateCity.UTTAR_PRADESH.getCity()[2]);

        Assert.assertTrue(new HomePage(getDriver())
                .clickBtnForms()
                .clickBtnPracticeForm()
                .typeStudentForm(student)
                .clickBtnSubmit()
                .isElementPresent_btnCloseModel())
        ;
    }

    @Test
    public void practiceFormPositiveTest1(){
        List<Hobbies> listHobbies = new ArrayList<>();
        listHobbies.add(Hobbies.SPORTS);
        listHobbies.add(Hobbies.MUSIC);

        StudentDTO student = new StudentDTO(
                "Frodo",
                "Baggins",
                "frodobaggins@mail.com",
                Gender.FEMALE,
                "1234567890",
                "12 Sep 1900",
                "Math, Physics, Economics",
                listHobbies,
                "",
                "Haifa st 1 app 2",
                StateCity.UTTAR_PRADESH.getState(),
                StateCity.UTTAR_PRADESH.getCity()[2]);

        new HomePage(getDriver())
                .clickBtnForms()
                .clickBtnPracticeForm()
                .typeStudentForm(student)
                .clickBtnSubmit()
        ;

    }
}
