package SEMINARS_2.models;

public class Course {
    private static int idCounter;

    private int id;
    private String title;
    private byte creditPoints;
    private Professor professor;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public byte getCreditPoints() {
        return creditPoints;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setId() {
        this.id = idCounter++;
    }

    public void setTitle(String title) {
        // regex for 1 big letter and one or more spaces or digits or small letters
        if (title != null && title.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[\\s\\da-zēūīļķģšāžčņA-ZĒŪĪĀŠĢĶĻŅČŽ]+")) {
            this.title = title;
        } else {
            this.title = "notknown";
        }
    }

    public void setCreditPoints(byte creditPoints) {
        if (creditPoints > 0 && creditPoints <= 20) {
            this.creditPoints = creditPoints;
        } else {
            this.creditPoints = -1;
        }
    }

    public void setProfessor(Professor professor) {
        if (professor != null) {
            this.professor = professor;
        } else {
            this.professor = new Professor();

        }
    }

    public Course() {
        setId();
        setTitle("notknown");
        setCreditPoints((byte) -1);
        setProfessor(null);
    }

    public Course(String title, byte creditPoints, Professor professor) {
        setId();
        setTitle(title);
        setCreditPoints(creditPoints);
        setProfessor(professor);
    }

    public Course(String title, byte creditPoints) {
        setId();
        setTitle(title);
        setCreditPoints(creditPoints);
        setProfessor(null);
    }

    public String toString() {
        return id + ": " + title + " " + creditPoints + " " + professor;
    }
}
