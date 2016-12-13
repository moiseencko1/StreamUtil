package ru.sbt.StreamUtil;

/**
 * Created by sbt-moiseenko-nv on 12.12.2016.
 */
public interface MyAction<T> {
    Object doAction(T t);
}
