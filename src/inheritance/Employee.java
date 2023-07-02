package inheritance;

import java.time.*;
import java.util.Objects;


public class Employee extends Person{
    private double salary;
    private LocalDate hireDay;


    public Employee(String name, double salary, int year, int month, int day){
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);

    }

    @Override
    public String getDescription() {
        return null;
    }

    public String getName(){
        return super.getName();
    }

    public double getSalary(){
        return this.salary;
    }


    public LocalDate getHireDay(){
        return this.hireDay;
    }

    public void riseSalary(double byPercent){
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    // Consider Employees equal if they have same name, salary and hire date
    @Override
    public boolean equals(Object otherObject){
        // A quick test to see if the objects are identical
        if (this == otherObject) return true;

        // Must return false if the explicit parameter is null
        if (otherObject == null) return false;

        // If the classes don't match, they can't be equal
        if (this.getClass() != otherObject.getClass()) return false;

        // Now we know otherObject is a non-null Employee
        Employee other = (Employee) otherObject;

        // Test whether the fields have identical values
        return Objects.equals(this.getName(), other.getName()) && this.salary == other.salary && Objects.equals(this.getHireDay(), other.hireDay
        );

    }

    // Using Objects hashCode() is safer while working with null pointers
    @Override
    public int hashCode(){
//        return 7 * Objects.hashCode(this.getName()) + 11 * Double.hashCode(this.salary) + 13 * Objects.hashCode(this.hireDay);
        return Objects.hash(this.getName(), this.getSalary(), this.getHireDay());
    }

    // To string method implementation
    @Override
    public String toString(){
        return this.getClass().getName() + "[name=" + this.getName() + ", salary=" + this.getSalary() + ", hireDAy=" + this.getHireDay() + "]";
    }


}
