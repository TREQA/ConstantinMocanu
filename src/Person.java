public class Person
{
    public String firstName;
    public String lastName;
    public final String SCHOOL_NAME="ITAcademy";

    public Person (String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void show()
    {
        System.out.println("Person: "+firstName+" "+lastName);
    }
    public static void main(String[] args) {
        Person person = new Person("John", "Davidson");
        Student student = new Student("John", "Smith", "10/2014");
        Professor professor = new Professor("Edward", "Owen", "Java Programming");
        person.show();
        student.show();
        professor.show();
    }

}
