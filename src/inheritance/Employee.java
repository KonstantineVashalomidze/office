package inheritance;

import java.time.*;


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


}
