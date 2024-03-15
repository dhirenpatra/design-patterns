package com.dhiren.patterns.abstract_factory;

public abstract class DaoAbstractFactory {
    abstract Dao createDao(String type);

}
