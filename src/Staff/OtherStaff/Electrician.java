package Staff.OtherStaff;

import enums.Gender;

public class Electrician extends MaintenanceProfile implements ElectricianController  {


    public Electrician(String fullName, int age, double salary, Gender gender, String countryBorn) {
        super(fullName, age, salary, gender, countryBorn);
    }

    @Override
    public void checkBulbs() {

    }
}
