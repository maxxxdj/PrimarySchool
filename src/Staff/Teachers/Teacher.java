package Staff.Teachers;

import Interfaces.Teachable;
import Staff.EmployeePerson;
import enums.Gender;

public abstract class Teacher extends EmployeePerson implements Teachable {


    protected Teacher(String fullName, int age, double salary, Gender gender, String countryBorn) {
        super(fullName, age, salary, gender, countryBorn);
    }

    public void setSalary(double salary) {
        if (super.getAge() > 35) { //increasing the salary by 20% if the teacher is 35 or older.
            super.setSalary(salary * 1.20);
        } else {
            super.setSalary(salary);
        }
    }
}