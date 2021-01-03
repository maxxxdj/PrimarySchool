package Staff;

import Interfaces.Employee;
import enums.Gender;
import messages.Prints;

public abstract class EmployeePerson implements Employee{

    Prints prints = new Prints();
    private int dayOffAmount = 26;
    private String fullName;
    private int age;
    private double salary;
    private Gender gender;
    private String countryBorn;

    protected EmployeePerson(String fullName, int age, double salary, Gender gender, String countryBorn) {
        this.fullName = fullName;
        this.age = age;
        setSalary(salary);
        this.gender = gender;
        this.countryBorn = countryBorn;
    }

    //personal options
    @Override
    public Gender getGender(){
        return this.gender;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    public String getCountryBorn() {
        return countryBorn;
    }
    public int getAge() {
        return this.age;
    }

    @Override
    public void getInfo() {
        if (getGender()==Gender.FEMALE){
            System.out.printf("%s",prints.getInfoMessage(fullName,age,countryBorn,"She",dayOffAmount,"her",salary));

        } else {
            System.out.printf("%s",prints.getInfoMessage(fullName,age,countryBorn,"He",dayOffAmount,"his",salary));
        }
    }

    //vacancy options
    @Override
    public void getDayOffAmount() {
        System.out.printf("%d days left of vacancy.\n",this.dayOffAmount);
    }

    public int goDayOff(int days) {
        this.dayOffAmount -= days;
        return this.dayOffAmount;
    }

    //salary options
    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public void promote(double percent) {
        setSalary(getSalary()*(1+(percent/100)));
    }

}
