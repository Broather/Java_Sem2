package SEMINARS_2.models;

public class Professor {
    private String name;
    private String surname;
    // zinam visas visas vērtības kādas degree var būt
    private ProfDegree degree;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("")) {

            this.name = name;
        } else {

        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ProfDegree getDegree() {
        return degree;
    }

    public void setDegree(ProfDegree degree) {
        this.degree = degree;
    }

}
