package ru.sbt.HearthStoneEmulateExtends;

/**
 * Created by sbt-moiseenko-nv on 12.12.2016.
 */
public class ClassCard extends Card {
    private final Classes clazz;

    public ClassCard(String name, int cost, Classes clazz) {
        super(name, cost);
        this.clazz = clazz;
    }

    public Classes getClazz() {
        return clazz;
    }
}
