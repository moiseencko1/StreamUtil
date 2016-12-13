package ru.sbt.HearthStoneEmulateExtends;

/**
 * Created by sbt-moiseenko-nv on 12.12.2016.
 */
public class Card {
    private final String name;
    private int cost;

    public Card(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
