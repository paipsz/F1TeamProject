package com.eafun.f1team.models;

import java.util.ArrayList;
import java.util.List;

public class F1Team {
    private String name;
    private int foundationYear;
    private List<PitCrewTeam> teamMembers;  // Lista para almacenar los miembros del equipo

    // Constructor
    public F1Team(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.teamMembers = new ArrayList<>();  // Inicializar la lista de miembros del equipo
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getFoundationYear() {
        return this.foundationYear;
    }

    public List<PitCrewTeam> getTeamMembers() {
        return this.teamMembers;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    // Método para agregar un miembro al equipo
    public void addTeamMember(PitCrewTeam member) {
        this.teamMembers.add(member);
    }

    // Método para mostrar la información del equipo
    public void displayTeamInfo() {
        System.out.println("Nombre del equipo: " + this.name);
        System.out.println("Año de fundación: " + this.foundationYear);
        System.out.println("Número de miembros del equipo: " + this.teamMembers.size());
    }
}
