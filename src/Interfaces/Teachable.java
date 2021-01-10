package Interfaces;

public interface Teachable extends Employee{

    //teaching options
    void giveLesson(int count);
    void printLessonsLeft();
    public int getLessonsAmount();


}
