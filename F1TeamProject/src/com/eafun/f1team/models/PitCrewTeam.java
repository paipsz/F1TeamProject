package com.eafun.f1team.models;

public class PitCrewTeam {
    private String role;
    private int members;

    // Constructor
    public PitCrewTeam(String role, int members) {
        this.role = role;
        this.members = members;
    }

    // Getters
    public String getRole() {
        return this.role;
    }

    public int getMembers() {
        return this.members;
    }

    // Setters
    public void setRole(String role) {
        this.role = role;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    // Método adicional para mostrar la información del equipo de boxes
    public void displayPitCrewInfo() {
        System.out.println("Rol: " + this.role);
        System.out.println("Miembros: " + this.members);
    }
}
