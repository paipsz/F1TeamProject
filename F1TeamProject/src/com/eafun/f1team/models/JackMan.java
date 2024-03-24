package com.eafun.f1team.models;

public class JackMan extends PitCrewTeam {
    private String jackType;  // Tipo de gato que utiliza el Jack Man

    // Constructor
    public JackMan(String role, int members, String jackType) {
        super(role, members);
        this.jackType = jackType;
    }

    // Getter
    public String getJackType() {
        return this.jackType;
    }

    // Setter
    public void setJackType(String jackType) {
        this.jackType = jackType;
    }

    // Método para levantar el coche
    public void liftCar() {
        System.out.println("Levantando el coche con el gato " + this.jackType);
    }
}
