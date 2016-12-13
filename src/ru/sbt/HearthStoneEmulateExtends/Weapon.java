package ru.sbt.HearthStoneEmulateExtends;

/**
 * Created by sbt-moiseenko-nv on 12.12.2016.
 */
public class Weapon extends ClassCard {
    private int attack;
    private int durability;

    public Weapon(String name, int cost, Classes clazz, int durability, int attack) {
        super(name, cost, clazz);
        this.durability = durability;
        this.attack = attack;
    }

    public int getDurability() {
        return durability;
    }

    public int getAttack() {
        return attack;
    }
}
