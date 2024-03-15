package com.dhiren.patterns.abstract_factory;

public class DaoFactoryProducer {

    public static DaoAbstractFactory produce(String type) {

        if("XML".equals(type))
            return new XMLDaoFactory();
        else if ("DB".equals(type))
            return new DBDaoFactory();
        return null;
    }

}
