package ru.sbt.StreamUtil;

import java.util.*;
import java.util.function.Predicate;

/**
 * Created by sbt-moiseenko-nv on 12.12.2016.
 */
public class Streams<T> {
    public List<T> collection;

    private Streams(Collection<T> collection) {
        this.collection = new ArrayList<>(collection);
    }

    public static <T> Streams<T> of(Collection<T> collection) {
        return new Streams(collection);
    }

    public Streams<T> filter(Predicate<? super T> predicate) {
        ArrayList<T> result = new ArrayList<>();
        for (T t : collection) {
            if (predicate.test(t)) result.add(t);
        }
        collection = result;
        return this;
    }

    public Streams<T> transform(MyTransformer<? super T> myTransformer) {
        ArrayList<T> result = new ArrayList<>();
        for (T t : collection) {
            result.add((T) myTransformer.makeTransform(t));
        }
        collection = result;
        return this;
    }

    public Map toMap(MyAction<? super T> key, MyAction<? super T> value) {
        HashMap result = new HashMap();
        for (T t : collection) {
            result.put(key.doAction(t), value.doAction(t));
        }
        return result;
    }
}

