package SEMINARS_2.service;

import SEMINARS_2.models.Course;
import SEMINARS_2.models.Grade;
import SEMINARS_2.models.ProfDegree;
import SEMINARS_2.models.Professor;
import SEMINARS_2.models.Student;

public class VeAService {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Estere", "Vītola", ProfDegree.bachelor);
        Professor prof2 = new Professor("Vairis", "Caune", ProfDegree.doctor);
        Professor prof3 = new Professor("Karina", "Šķirmane", ProfDegree.master);

        Course c1 = new Course("Progammēšana tīmeklī JAVA 2022", 4, prof3);
        Course c2 = new Course("Objektorientētā programmēšana 2021/22", 4, prof1);
        Course c3 = new Course("Algoritmu teorija", 4, prof2);
        Course c4 = new Course("Datu Struktūras", 4, prof3);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        Student stud1 = new Student("Jānis", "Ozoliņš");
        Student stud2 = new Student("Pēteris", "Bērziņš");
        System.out.println(stud1);
        System.out.println(stud2);

        Grade gr1 = new Grade(5, c1, stud1);// Jānis, JAVA, 5
        Grade gr2 = new Grade(2, c2, stud1);// Jānis, OOP, 2
        Grade gr3 = new Grade(10, c1, stud2);// Pēteris, JAVA, 10
        System.out.println(gr1);
        System.out.println(gr2);
        System.out.println(gr3);
    }

}
