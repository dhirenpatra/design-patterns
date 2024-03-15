package com.dhiren.patterns.abstract_factory;

public class XMLDaoFactory extends DaoAbstractFactory {
    @Override
    Dao createDao(String type) {
        return switch (type) {
            case "Dept" -> new XmlDeptDao();
            default -> new XmlEmpDao();
        };
    }
}
