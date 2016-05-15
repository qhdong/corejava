package v1ch05.inheritance.abstractClasses;

public class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return String.format("A student majoring in %s", major);
    }
}
