package inheritance;


import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

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

        // Usage of the Object super class
        Object obj = new Employee("Harry hacer", 35_000, 1_889, 9, 15);
        Employee e = (Employee) obj;


        System.out.println(e.equals(people[0]));

        var s = "Ok";
        var sb = new StringBuilder(s);
        System.out.println(s.hashCode() + " " + sb.hashCode());
        var t = new String("Ok");
        var tb = new StringBuilder(t);
        System.out.println(t.hashCode() + " " + tb.hashCode());

//        System.out.println(customHashCode(s.toString()) + " " + customHashCode(sb.toString()));
//        System.out.println(customHashCode(t.toString()) + " " + customHashCode(tb.toString()));




        Point point = new Point(3, 5);
        System.out.println(point.toString());

        System.out.println("The current position is " + point); // Automatically invokes p.toString();

        Logger.getGlobal().info("Current position = " + point);

        // Declare and construct ArrayList that holds Employee objects
        ArrayList<Employee> staff3 = new ArrayList<Employee>();

        // Better to use var keyword for avoiding class name duplication
        var staff4 = new ArrayList<Employee>();

        // no type parameter is necessary on the right hand side if we ain't use var keyword
        ArrayList<Integer> staff5 = new ArrayList<>();

        // If we already know, or have a good guess, how many elements you want to store, call ensureCapacity method before filling the array list
        // This call allocates an internal array of 100 objects. Then, the first 100 calls
        // to add will not involve an costly reallocation
        staff5.ensureCapacity(100);

        // We can also pass an initial capacity to the ArrayList constructor:
        ArrayList<Employee> employees = new ArrayList<>(100);

        // When we are done on array we should call trimToSize method
        staff5.trimToSize();

        // To set ith element, use. WARNING: better to use this for only replacing element in ArrayList.
//        staff5.set(10, 30);

        // Copy the elements of the ArrayList into the array
        var a = new Integer[staff5.size()];
        staff5.toArray(a);

        // Add element using index
        staff5.add(0, 15);
        // Elements at locations n and above are shifted up to make room for the new entry.

        // Remove by index, elements above it are copied down, and size of the array is reduced by one.
        staff5.remove(0);

        // Inserting and Removing is not efficient.
        // Better to avoid using it if much insertion and deletion is happening for the big list


        // Inverse of toString()
        Size size = Enum.valueOf(Size.class, "SMALL");

        System.out.println(size == Size.SMALL);

        // Array of values of all enumeration
        Size[] values = Size.values();

        System.out.println(Arrays.toString(values));

        // ordinal method yields the position of an enumerated constant in the enum declaration.(counting from zero)
        System.out.println(Size.MEDIUM.ordinal());









    }

    public static int customHashCode(String stringToHash){
        int hash = 256;
        for (int i = 0; i < stringToHash.length(); i++){
            hash = 31 * hash + stringToHash.charAt(i);
        }
        return hash;
    }
}







