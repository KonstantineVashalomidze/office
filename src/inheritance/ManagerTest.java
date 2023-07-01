package inheritance;



public class ManagerTest {

    public ManagerTest(){

        // Construct a Manager object
        var boss = new Manager("Carl Cracker", 80_000, 1_987, 12, 15);
        boss.setBonus(5_000);

        var staff = new Employee[3];

        // Fill the staff array with Manager and Employee objects
        staff[0] = boss;
        staff[1] = new Employee("Garry Hacker", 50_000, 1_989, 10, 1);
        staff[2] = new Employee("Tommy Taster", 40_000, 1990, 3, 15);

        // Give bonus to manager
        boss.setBonus(5_000);



        // Print out information about all Employee objects
        for(Employee e: staff){
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }

        var people = new Person[2];

        // Fill the people array with Student and Employee objects
        people[0] = new Employee("Harry Hacker", 50_000, 1_989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");

        // Print out names and descriptions of all Person objects
        for (Person p : people){
            System.out.println(p.getName() + ", " + p.getDescription());
        }


    }




}
