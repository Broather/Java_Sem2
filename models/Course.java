package normalJava.SEMINARS_2.models;

public class Course {
    private static int idCounter = 10000;

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
        if (title != null && title.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[\\s\\d/a-zēūīļķģšāžčņA-ZĒŪĪĀŠĢĶĻŅČŽ]+")) {
            this.title = title;
        } else {
            this.title = "notknown";
        }
    }

    public void setCreditPoints(int creditPoints) {
        if (creditPoints > 0 && creditPoints <= 20) {
            this.creditPoints = (byte) creditPoints;
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

    public Course(String title, int creditPoints, Professor professor) {
        setId();
        setTitle(title);
        setCreditPoints(creditPoints);
        setProfessor(professor);
    }

    public String toString() {
        return id + ": " + title + ", " + creditPoints + "KP, " + professor.getName() + " " + professor.getSurname();
    }

    @Override
    public boolean equals(Object obj) {
        Course c = (Course) obj;
        // compare just course title
        return this.title.equals(c.title);

    }

}
