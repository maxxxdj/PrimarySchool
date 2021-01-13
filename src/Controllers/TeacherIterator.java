package Controllers;

import Staff.Teachers.Teacher;

import java.util.*;

public class TeacherIterator implements Iterable<Teacher> {
    int count = 0;
    List<Teacher> list;

    public TeacherIterator(Teacher... teachers){
        this.list = Arrays.asList(teachers);
    }
    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherIter();
    }

    final class TeacherIter implements Iterator<Teacher>{

        @Override
        public boolean hasNext() {
            return count<list.size();
        }

        @Override
        public Teacher next() {
            return list.get(count++);
        }
    }
}
