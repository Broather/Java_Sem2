package SEMINARS_2.service;

import SEMINARS_2.models.ProfDegree;
import SEMINARS_2.models.Professor;

public class VeAService {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Estere", "Vītola", ProfDegree.bachelor);
        Professor prof2 = new Professor("Vairis", "Caune", ProfDegree.doctor);

        System.out.println(prof1);
        System.out.println(prof2);
    }
}
