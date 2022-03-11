package normalJava.SEMINARS_2.models;

public class Professor {
    private static int idCounter = 0;
    private int id;
    private String name;
    private String surname;
    // zinam visas visas vērtības kādas degree var būt, tāpēc lietojam enum
    private ProfDegree degree;

    // set/get funkcijas
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public ProfDegree getDegree() {
        return degree;
    }

    public void setId() {
        this.id = idCounter++;
    }

    public void setName(String name) {
        // regex priekš "Jānis Pēteris"
        if (name != null && name.matches("([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+\\s?){1,2}")) {

            this.name = name;
        } else {
            this.name = "notknown";
        }
    }

    public void setSurname(String surname) {
        // regex priekš "Ozoliņš"
        if (surname != null && surname.matches("([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+\\s?){1,2}")) {
            this.surname = surname;

        } else {
            this.surname = "notknown";
        }
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
        setId();
        setName("Jānis");
        setSurname("Ozoliņš");
        setDegree(ProfDegree.bachelor);
    }

    public Professor(String name, String surname, ProfDegree degree) {
        setId();
        setName(name);
        setSurname(surname);
        setDegree(degree);
    }

    public Professor(String name, String surname) {
        setId();
        setName(name);
        setSurname(surname);
        setDegree(ProfDegree.notknown);
    }

    public String toString() {
        return id + ": " + name + " " + surname + " " + degree;
    }
}
