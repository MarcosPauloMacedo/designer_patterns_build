package com.build.model;

public class Casa {

    private int quartos;
    private int banheiros;
    private Boolean churrasqueiras;

    public Casa(int quartos, int banheiros, Boolean churrasqueiras) {
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.churrasqueiras = churrasqueiras;
    }

    public Casa() {}

    //crie somente os getters
    public int getQuartos() {
        return quartos;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public Boolean getChurrasqueiras() {
        return churrasqueiras;
    }
}