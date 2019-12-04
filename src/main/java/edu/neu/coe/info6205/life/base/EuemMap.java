package edu.neu.coe.info6205.life.base;

import java.util.EnumMap;

public interface EuemMap {
    enum GameProperty {
        Behavior,Chromosome
    }
    public EnumMap<GameProperty,Object> get(Chromosome chromosome);
}

