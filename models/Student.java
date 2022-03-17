package normalJava.SEMINARS_2.models;

public class Student extends Person {
    private static int idCounter = 100000;

    private int id;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = idCounter++;
    }

    public Student() {
        // izsauksim Personas bezargum. konstruktoru
        super(); // izsauc Person();
        setId();
    }

    public Student(String name, String surname) {
        // izsaukt Personas klases argumentu konstruktoru
        super(name, surname);// izsauc Person(name, surname);
        setId();
    }

    public String toString() {
        return id + ": " + super.toString();
    }
}
