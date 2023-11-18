package com.build.patterns;

import com.build.model.Casa;

public class Casa2Quartos implements CasaBuilder {
    Casa casa = new Casa();

    public Casa2Quartos() {
        casa = new Casa(2, 1, false);
    }

    @Override
    public void buildQuartos() {
        System.out.println("Casa com 2 quartos");
    }

    @Override
    public void buildBanheiros() {
        System.out.println("Casa com 1 banheiro");
    }

    @Override
    public void buildChurrasqueiras() {
        System.out.println("Casa sem churrasqueira");
    }

    @Override
    public Casa getCasa() {
        return casa;
    }
}
