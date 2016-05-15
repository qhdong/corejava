package v1ch05.inheritance.abstractClasses;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Employee("Ariek", 29382, 2018, 3, 20);
        people[1] = new Student("Gaze", "Computer Science");

        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
