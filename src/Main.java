import Interfaces.Employee;
import Staff.OtherStaff.Cleaner;
import Staff.OtherStaff.Electrician;
import Staff.Teachers.EnglishTeacher;
import Staff.Teachers.MathTeacher;
import Staff.Teachers.Teacher;
import enums.*;

public class Main {
    public static void main(String[] args) {

        Teacher englishTeacher = new EnglishTeacher(   // creating new English teacher
                "Pamela Anderson",
                58, 5000, Gender.FEMALE, "USA");
        Employee mathTeacher = new MathTeacher(       // creating new Maths teacher via interface
                "Martin Vencislavov",
                37, 750, Gender.MALE, "Bulgaria");
        Employee cleaner = new Cleaner(            // creating new Maintenance staff via interface
                "Chetka Zabursalova",
                61, 450, Gender.FEMALE, "Bulgaria");
        Electrician electrician = new Electrician(    // creating new Maintenance staff
                "Ivan Pipnitokov",
                46, 730, Gender.MALE, "Bulgaria");



        //getting days off
        englishTeacher.getDayOffAmount();
        englishTeacher.goDayOff(5);
        englishTeacher.getDayOffAmount();
        englishTeacher.giveLesson(3);
        englishTeacher.getLessonsLeft();

        //promoting the employee
        mathTeacher.getInfo();
        mathTeacher.promote(50);
        mathTeacher.getInfo();

        //testing staff diff than Teachers
        cleaner.getInfo();
        electrician.checkBulbs();


    }
}
