package tests;

import manager.ApplicationManager;
import manager.dto.StudentDTO;
import manager.enums.Gender;
import manager.enums.Hobbies;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormTests extends ApplicationManager {

    @Test
    public void practiceFormPositiveTest(){
        List<Hobbies> listHobbies = new ArrayList<>();
        listHobbies.add(Hobbies.SPORTS);
        listHobbies.add(Hobbies.MUSIC);
        StudentDTO student = new StudentDTO("Frodo", "Baggins", "frodobaggins@mail.com",
                Gender.FEMALE, "1234567890", "12 Sep 1900", "Math, Physics, Economics",
                listHobbies, "","Haifa st 1 app 2", "NCR", "Delhi");
        //student.setName("Frodo");
        //student.setLastName("Baggins");
        //student.setEmail("frodobaggins@mail.com");
        //student.setGender(Gender.FEMALE);


        new HomePage(getDriver())
                .clickBtnForms()
                .clickBtnPracticeForm()
                .typeStudentForm(student)
        ;
    }
}
