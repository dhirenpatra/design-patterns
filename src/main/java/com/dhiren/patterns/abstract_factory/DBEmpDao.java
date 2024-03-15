package com.dhiren.patterns.abstract_factory;

public class DBEmpDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving EMP to DB");
    }
}
