package ru.sbt;

import ru.sbt.HearthStoneEmulateExtends.*;
import ru.sbt.StreamUtil.Streams;
import java.util.*;

/**
 * Created by sbt-moiseenko-nv on 12.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        System.out.println(Streams.of(list).filter(o -> o % 2 == 1).transform(o -> o + 1).toMap(o -> o, o -> o * 2));


        List<Card> cards = new ArrayList<>();
        cards.add(new Minion("pirat", 2, Classes.COMMON, 2, 3));
        cards.add(new Spell("fireball", 4, Classes.MAGE));
        cards.add(new Weapon("fiery war axe", 2, Classes.WAR, 3, 2));
        cards.add(new Minion("animal", 4, Classes.COMMON, 4, 4));

        System.out.println(Streams.of(cards).toMap(card -> card.getName(), card -> ((ClassCard) card).getClazz()));
        System.out.println(Streams.of(cards).filter(o -> ((ClassCard) o).getClazz() == Classes.COMMON).collection);

    }
}
