package normalJava.SEMINARS_2.models;

public class Professor extends Person {
    private static int idCounter = 0;

    private int id;
    // zinam visas visas vērtības kādas degree var būt, tāpēc lietojam enum
    private ProfDegree degree;

    // set/get funkcijas

    public int getId() {
        return id;
    }

    public ProfDegree getDegree() {
        return degree;
    }

    public void setId() {
        this.id = idCounter++;
    }

    public void setDegree(ProfDegree degree) {
        if (degree != null) {
            this.degree = degree;
        } else {
            this.degree = ProfDegree.notknown;
        }
    }

    // konstuktori
    public Professor() {
        // izsauksim Personas bezargum. konstruktoru
        super(); // izsauc Person();
        setId();

        setDegree(ProfDegree.notknown);
    }

    public Professor(String name, String surname, ProfDegree degree) {
        // izsakusim Personas argumentu konstuktoru
        super(name, surname); // izsauc Person(name, surname);
        setId();
        setDegree(degree);
    }

    public String toString() {
        return id + ": " + super.toString() + " " + degree;
    }
}
