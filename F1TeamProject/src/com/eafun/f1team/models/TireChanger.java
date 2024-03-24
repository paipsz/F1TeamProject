package com.eafun.f1team.models;

public class TireChanger extends PitCrewTeam {
    private String tireType;  // Tipo de neumático que el Tire Changer está manejando

    // Constructor
    public TireChanger(String role, int members, String tireType) {
        super(role, members);  // Llamada al constructor de la clase padre (PitCrewTeam)
        this.tireType = tireType;
    }

    // Getter
    public String getTireType() {
        return this.tireType;
    }

    // Setter
    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    // Método para cambiar el neumático
    public void changeTire() {
        System.out.println("Cambiando el neumático " + this.tireType);
    }
}
