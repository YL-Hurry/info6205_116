package edu.neu.coe.info6205.life.base;

import java.util.EnumMap;

public class Fitness implements EuemMap {
    @Override
    public EnumMap<GameProperty, Object> get(Chromosome chromosome) {
        EnumMap<GameProperty,Object> retMap = new EnumMap<GameProperty, Object>(GameProperty.class);
        retMap.put(GameProperty.Behavior,"0003");
        retMap.put(GameProperty.Chromosome,"00004");
        return retMap;
    }
}
