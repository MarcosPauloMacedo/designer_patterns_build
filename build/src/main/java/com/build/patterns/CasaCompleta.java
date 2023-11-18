package com.build.patterns;

import com.build.model.Casa;

public class CasaCompleta implements CasaBuilder {
    Casa casa = new Casa();

    public CasaCompleta() {
        casa = new Casa(4, 3, true);
    }

    @Override
    public void buildQuartos() {
        System.out.println("Casa com 4 quartos");
    }

    @Override
    public void buildBanheiros() {
        System.out.println("Casa com 3 banheiros");
    }

    @Override
    public void buildChurrasqueiras() {
        System.out.println("Casa com churrasqueira");
    }

    @Override
    public Casa getCasa() {
        return casa;
    }
}
