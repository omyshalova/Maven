package tests;

import manager.ApplicationManager;
import manager.dto.StudentDTO;
import manager.enums.Gender;
import org.testng.annotations.Test;
import pages.HomePage;

public class PracticeFormTests extends ApplicationManager {

    @Test
    public void practiceFormPositiveTest(){
        StudentDTO student = new StudentDTO();
        student.setName("Frodo");
        student.setLastName("Baggins");
        student.setEmail("frodobaggins@mail.com");
        student.setGender(Gender.FEMALE);

        new HomePage(getDriver())
                .clickBtnForms()
                .clickBtnPracticeForm()
                .typeStudentForm(student)
        ;
    }
}
