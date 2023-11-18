package com.build.patterns;

import com.build.model.Casa;

public interface CasaBuilder {
    public void buildQuartos();
    public void buildBanheiros();
    public void buildChurrasqueiras();
    public Casa getCasa();
}
