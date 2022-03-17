package normalJava.SEMINARS_2.models;

public class Person {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
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

    public Person() {
        setName("Test");
        setSurname("Person");
    }

    public Person(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public String toString() {
        return name + " " + surname;
    }
}
