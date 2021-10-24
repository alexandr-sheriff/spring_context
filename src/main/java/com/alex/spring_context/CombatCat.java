package com.alex.spring_context;

public class CombatCat {

    private String name;

    @CalculateCatStrength(minStrength = 1, maxStrength = 10)
    private Integer strength;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "CombatCat{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                '}';
    }
}
