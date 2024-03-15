package com.dhiren.patterns.abstract_factory;

public class Client {

    public static void main(String[] args) {
        DaoAbstractFactory factory = DaoFactoryProducer.produce("DB");
        assert factory != null;
        Dao emp = factory.createDao("Emp");
        emp.save();
    }
}
