package peaksoft;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Instructor instructor = new Instructor("Beksultan","Java5");
        Mentors mentors = new Mentors(instructor.getName(), instructor.getGroupName(), "Facebook",5);
        Student student = new Student(instructor.getName(), instructor.getGroupName(),"Ulan",(byte) 32);

        System.out.println(instructor);
        System.out.println(mentors);
        System.out.println(student);

    }
}
