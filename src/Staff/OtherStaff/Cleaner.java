package Staff.OtherStaff;

import Controllers.CleaningController;
import enums.Gender;

public class Cleaner extends MaintenanceProfile implements CleaningController {

    private int classrooms = 15;
    public Cleaner(String fullName, int age, double salary, Gender gender, String countryBorn) {
        super(fullName, age, salary, gender, countryBorn);
    }


    @Override
    public int cleanClassrooms(int num) {
        return this.classrooms-num;
    }

}
