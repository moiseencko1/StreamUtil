package ru.sbt.HearthStoneEmulateExtends;

/**
 * Created by sbt-moiseenko-nv on 12.12.2016.
 */
public class Minion extends ClassCard {
    private int attack;
    private int health;

    public Minion(String name, int cost, Classes clazz, int attack, int helth) {
        super(name, cost, clazz);
        this.attack = attack;
        this.health = helth;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }
}
