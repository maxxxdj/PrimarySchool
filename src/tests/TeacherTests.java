package tests;

import Controllers.TeacherComparator;
import Controllers.TeacherIterator;
import Staff.OtherStaff.Cleaner;
import Staff.Teachers.EnglishTeacher;
import Staff.Teachers.MathTeacher;
import Staff.Teachers.Teacher;
import enums.Gender;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;


public class TeacherTests {
    EnglishTeacher englishTeacher;
    MathTeacher mathTeacher;
    Cleaner cleaner;
    List<Teacher> teachers = new ArrayList<>();


    @Before
    public void setUp() {
        this.englishTeacher = new EnglishTeacher("Pamela Anderson",
                58, 5000, Gender.FEMALE, "USA");

        this.mathTeacher = new MathTeacher("Kiril Ivanov",
                39, 860, Gender.MALE, "Bulgaria");
        this.cleaner = new Cleaner("Maria Ivanova",
                29, 450, Gender.FEMALE, "Bulgaria");

        teachers.add(this.englishTeacher);
        teachers.add(this.mathTeacher);

    }

    //Comparator by age
    @Test
    public void testTeacherComparator(){
        List<Teacher> sorted = teachers.stream()
                .sorted(new TeacherComparator())
                .collect(Collectors.toList());

        assertEquals(teachers.get(1),sorted.get(0));
    }


    //Enlgish Teacher
    @Test       //testing lessons
    public void testEnglishTeacherLessons() {
        englishTeacher.giveLesson(30); //57-30
        int lessonsLeft = mathTeacher.getLessonsAmount();
        assertEquals(27, lessonsLeft);            // expected 27
    }
    // more tests to come...

    //Math Teacher
    @Test
    public void testMathTeacherLessons() {

        mathTeacher.giveLesson(10);  //27-10
        int lessonsLeft = mathTeacher.getLessonsAmount(); // expected 17
        assertEquals(17, lessonsLeft);
    }
    // more tests to come...


    //Cleaner
    @Test
    public void testCleanerGetSalary(){
        cleaner.setSalary(200); //set to 200
        assertEquals(200,cleaner.getSalary(), 0);
    }
    // more tests to come...
}


