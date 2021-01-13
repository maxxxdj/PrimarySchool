package Interfaces;

import enums.Gender;

public interface Employee {

    //personal options

    Gender getGender();
    String getFullName();

    //vacancy option
    // s
    void getDayOffAmount();
    int goDayOff(int days);

    //salary options
    double getSalary();
    void setSalary(double salary);
    void promote(double percent);

    //Other methods
    void getInfo();


}
