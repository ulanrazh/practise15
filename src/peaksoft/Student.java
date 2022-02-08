package peaksoft;

public class Student extends Instructor {
    private String name;
    private byte age;

    public Student(String name, String groupName, String name1, byte age) {
        super(name, groupName);
        this.name = name1;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
