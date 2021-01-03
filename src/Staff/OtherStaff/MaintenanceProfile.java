package Staff.OtherStaff;

import Staff.EmployeePerson;
import enums.Gender;

public abstract class MaintenanceProfile extends EmployeePerson {

    protected MaintenanceProfile(String fullName, int age, double salary, Gender gender, String countryBorn) {
        super(fullName, age, salary, gender, countryBorn);
    }
}
