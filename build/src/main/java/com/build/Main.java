package com.build;

import com.build.patterns.Casa2Quartos;
import com.build.patterns.CasaCompleta;

public class Main {
    public static void main(String[] args) {
        Casa2Quartos casa2Quartos = new Casa2Quartos();
        casa2Quartos.buildQuartos();
        casa2Quartos.buildBanheiros();
        casa2Quartos.buildChurrasqueiras();

        System.out.println();

        CasaCompleta casaCompleta = new CasaCompleta();
        casaCompleta.buildQuartos();
        casaCompleta.buildBanheiros();
        casaCompleta.buildChurrasqueiras();
    }
}