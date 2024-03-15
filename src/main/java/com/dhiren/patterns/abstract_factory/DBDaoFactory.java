package com.dhiren.patterns.abstract_factory;

public class DBDaoFactory extends DaoAbstractFactory {
    @Override
    Dao createDao(String type) {
        return switch (type) {
            case "Dept" -> new DBDeptDao();
            default -> new DBEmpDao();
        };
    }
}
