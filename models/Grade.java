package normalJava.SEMINARS_2.models;

public class Grade {
    private static int idCounter = 200000;

    private int id;
    private int gradeValue;
    private Student student;
    private Course course;

    public int getId() {
        return id;
    }

    public int getGradeValue() {
        return gradeValue;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public void setId() {
        this.id = idCounter++;
    }

    public void setGradeValue(int gradeValue) {
        if (gradeValue >= 1 && gradeValue <= 10) {
            this.gradeValue = gradeValue;
        } else {
            this.gradeValue = -1;
        }
    }

    public void setStudent(Student student) {
        if (student != null) {
            this.student = student;
        } else {
            this.student = new Student();
        }
    }

    public void setCourse(Course course) {
        if (course != null) {
            this.course = course;
        } else {
            this.course = new Course();
        }
    }

    public Grade() {
        setId();
        setGradeValue(-1);
        setCourse(new Course());
        setStudent(new Student());
    }

    public Grade(int gradeValue, Course course, Student student) {
        setId();
        setGradeValue(gradeValue);
        setCourse(course);
        setStudent(student);
    }

    public String toString() {
        return id + " " + gradeValue + " " + course.getTitle() + " " + student.getName() + " " + student.getSurname();
    }

}