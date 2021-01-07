package tests;

import Interfaces.Employee;
import Staff.Teachers.EnglishTeacher;
import Staff.Teachers.MathTeacher;
import enums.Gender;
import org.junit.Test;
import static org.junit.Assert.*;


public class TeacherTests {


    @Test       //testing lessons
    public void testEnglishTeacherLessons() {

        //Enlgish Teacher
        try {
            EnglishTeacher teacher = new EnglishTeacher("Pamela Anderson",
                    58, 5000, Gender.FEMALE, "USA");
            teacher.giveLesson(20); // actual 57
            int lessonsLeft = teacher.getLessonsAmount();
            assertEquals(37, lessonsLeft); // expected 37
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    //Math Teacher
    @Test
    public void testMathTeacherLessons() {
        try {
            MathTeacher teacher = new MathTeacher("Kiril Ivanov",
                    39, 860, Gender.MALE, "Bulgaria");
            teacher.giveLesson(20); // actual 27
            int lessonsLeft = teacher.getLessonsAmount();
            assertEquals(7, lessonsLeft); // expected 7
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
    // testing ctor

