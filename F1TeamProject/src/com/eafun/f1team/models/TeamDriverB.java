package com.eafun.f1team.models;

public class TeamDriverB extends PitCrewTeam {
    private String driverName;

    // Constructor
    public TeamDriverB(String role, int members, String driverName) {
        super(role, members);
        this.driverName = driverName;
    }

    // Getters
    public String getDriverName() {
        return this.driverName;
    }

    // Setters
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    // Método adicional para mostrar la información del equipo del conductor B
    public void displayDriverBTeamInfo() {
        System.out.println("Rol: " + getRole());
        System.out.println("Miembros: " + getMembers());
        System.out.println("Nombre del conductor: " + this.driverName);
    }
}
