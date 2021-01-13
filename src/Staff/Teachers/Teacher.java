package Staff.Teachers;

import Interfaces.Teachable;
import Staff.EmployeePerson;
import enums.Gender;

public abstract class Teacher extends EmployeePerson implements Teachable {


    public Teacher(String fullName, int age, double salary, Gender gender, String countryBorn) {
        super(fullName, age, salary, gender, countryBorn);
    }

}