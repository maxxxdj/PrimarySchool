package Controllers;

import Staff.Teachers.Teacher;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {


    @Override
    public int compare(Teacher first, Teacher second) {

        int compareResult = Integer.compare(first.getAge(), second.getAge());
        if (compareResult == 0) {
            compareResult = first.getFullName().compareTo(second.getFullName());
        }
        return compareResult;
    }
}
