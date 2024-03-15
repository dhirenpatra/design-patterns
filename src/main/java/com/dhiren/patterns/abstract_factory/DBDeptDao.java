package com.dhiren.patterns.abstract_factory;

public class DBDeptDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving DEPT to DB");
    }
}
