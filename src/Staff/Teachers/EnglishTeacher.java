package Staff.Teachers;

import Staff.EmployeePerson;
import enums.Gender;
import messages.Prints;

public class EnglishTeacher extends Teacher {

    private final String title = "English teacher"; // title
    private int lessonsForSemester = 57;         // for the whole Semester

    Prints prints = new Prints();

    public EnglishTeacher(String fullName, int age, double salary, Gender gender, String countryBorn) {
        super(fullName, age, salary, gender, countryBorn);
    }

    //Lessons activity
    @Override
    public void giveLesson(int count) {
        this.lessonsForSemester -= count;
    }

    @Override
    public void printLessonsLeft() {
        System.out.print(prints.getLessonsInfo(super.getFullName(), this.lessonsForSemester, "English language") + "\n");
    }

    @Override
    public int getLessonsAmount() {
        return this.lessonsForSemester;
    }


}
