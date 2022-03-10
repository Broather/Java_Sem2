package SEMINARS_2.models;

public class Professor {
    private String name;
    private String surname;
    // zinam visas visas vērtības kādas degree var būt, tāpēc lietojam enum
    private ProfDegree degree;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ProfDegree getDegree() {
        return degree;
    }

    public void setName(String name) {
        // regex priekš Vārds Uzvārds
        if (name != null && name.matches("([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+\\s?){1,2}")) {

            this.name = name;
        } else {
            this.name = "notknown";
        }
    }

    public void setSurname(String surname) {
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

}
