package com.dhiren.patterns.abstract_factory;

public class XmlDeptDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving DEPT to XML FILE");
    }
}
