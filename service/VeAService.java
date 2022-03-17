package normalJava.SEMINARS_2.service;

import java.util.ArrayList;

import normalJava.SEMINARS_2.models.*;

public class VeAService {

    // private static ArrayList<Professor> allProfessors = new ArrayList<>();
    private static ArrayList<Course> allCourses = new ArrayList<>();
    // private static ArrayList<Student> allStudents = new ArrayList<>();
    private static ArrayList<Grade> allGrades = new ArrayList<>();
    private static ArrayList<Person> allPersons = new ArrayList<>();

    public static void main(String[] args) {
        Professor prof1 = new Professor("Estere", "Vītola", ProfDegree.bachelor);
        Professor prof2 = new Professor("Vairis", "Caune", ProfDegree.doctor);
        Professor prof3 = new Professor("Karina", "Šķirmane", ProfDegree.master);
        allPersons.add(prof1);
        allPersons.add(prof2);
        allPersons.add(prof3);

        // for (Professor prof : allPersons) {
        // System.out.println(prof);
        // }

        Course c1 = new Course("Progammēšana tīmeklī JAVA 2022", 4, prof3);
        Course c2 = new Course("Objektorientētā programmēšana 2021/22", 4, prof1);
        Course c3 = new Course("Algoritmu teorija", 4, prof2);
        Course c4 = new Course("Datu Struktūras", 4, prof3);

        allCourses.add(c1);
        allCourses.add(c2);
        allCourses.add(c3);
        allCourses.add(c4);

        for (Course cour : allCourses) {
            System.out.println(cour);
        }

        Student stud1 = new Student("Jānis", "Ozoliņš");
        Student stud2 = new Student("Pēteris", "Bērziņš");

        allPersons.add(stud1);
        allPersons.add(stud2);

        // for (Student stud : allStudents) {
        // System.out.println(stud);
        // }

        Grade gr1 = new Grade(5, c1, stud1);// Jānis, JAVA, 5
        Grade gr2 = new Grade(2, c2, stud1);// Jānis, OOP, 2
        Grade gr3 = new Grade(10, c1, stud2);// Pēteris, JAVA, 10
        Grade gr4 = new Grade(7, c2, stud2);// Pēteris, OOP, 7
        Grade gr5 = new Grade(5, c1, stud2);// Pēteris, JAVA, 5
        Grade gr6 = new Grade(2, c4, stud1);// Jānis, Datu struktūras, 2
        Grade gr7 = new Grade(10, c1, stud2);// Pēteris, JAVA, 10

        allGrades.add(gr1);
        allGrades.add(gr2);
        allGrades.add(gr3);
        allGrades.add(gr4);
        allGrades.add(gr5);
        allGrades.add(gr6);
        allGrades.add(gr7);

        for (Grade grade : allGrades) {
            System.out.println(grade);
        }

        Person p = new Person("Parasts", "Cilvēks");
        allPersons.add(p);

        for (Person pers : allPersons) {
            System.out.println(pers);
        }

        for (Person pers : allPersons) {
            if (pers instanceof Professor) {
                Professor prof = (Professor) pers;
                System.out.println(prof.getDegree());
            }
        }
    }

    // CRUD: create, read, update, delete
    private static boolean addNewCourse(String title, int creditPoints, Professor professor) {
        Course course = new Course(title, creditPoints, professor);
        if (allCourses.contains(course)) {
            return false;
        } else {
            allCourses.add(course);
            return true;

        }
    }

}
