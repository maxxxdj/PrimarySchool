package Staff.Teachers;
import enums.Gender;
import messages.Prints;

public class MathTeacher extends Teacher {

    private final String title = "Math teacher"; // title
    private int lessonsForSemester = 27;         // for the whole Semester

    Prints prints = new Prints();

    public MathTeacher(String fullName, int age, double salary, Gender gender, String countryBorn) {
        super(fullName, age, salary, gender, countryBorn);
    }


    //Lessons
    @Override
    public void giveLesson(int count) {
        this.lessonsForSemester-=count;
    }

    @Override
    public void printLessonsLeft() {
        System.out.print(prints.getLessonsInfo(super.getFullName(),this.lessonsForSemester, "Maths") + "\n");
    }

    @Override
    public int getLessonsAmount() {
        return this.lessonsForSemester;
    }
    //salary options


}
