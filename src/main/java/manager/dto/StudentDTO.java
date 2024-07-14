package manager.dto;

import manager.enums.Gender;
import manager.enums.Hobbies;

import java.util.List;

public class StudentDTO {
    private String name;
    private String lastName;
    private String email;
    private Gender gender;
    private String mobile;
    private String dateOfBirth;
    private String subjects;
    private List<Hobbies> hobbies;
    private String picture;
    private String currentAddress;
    private String state;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSubjects() {
        return subjects;
    }

    public List<Hobbies> getHobbies() {
        return hobbies;
    }

    public String getPicture() {
        return picture;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getState() {
        return state;
    }
    public String getCity(){
        return city;
    }

    public StudentDTO(String name, String lastName, String email, Gender gender,
                      String mobile, String dateOfBirth, String subjects, List<Hobbies> hobbies,
                      String picture, String currentAddress, String state, String city) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.mobile = mobile;
        this.dateOfBirth = dateOfBirth;
        this.subjects = subjects;
        this.hobbies = hobbies;
        this.picture = picture;
        this.currentAddress = currentAddress;
        this.state = state;
        this.city = city;
    }
}