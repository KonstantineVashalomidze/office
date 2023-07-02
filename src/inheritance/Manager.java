package inheritance;


public class Manager extends Employee{

    private double bonus;

    /**
     * @param name the employee's name
     * @param salary the salary
     * @param year the hire year
     * @param month the hire month
     * @param day the hire day
     */

    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        this.bonus = 0;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + this.bonus;
    }

    public void setBonus(double b){
        this.bonus = b;
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        // Super.equals checked that this and otherObject belong to the same class
        Manager other = (Manager) otherObject;
        return this.bonus == other.bonus;
    }

    @Override
    public String toString(){
        return super.toString() + "[bonus=" + this.bonus + "]";
    }

}
