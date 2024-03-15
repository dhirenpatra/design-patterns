package com.dhiren.patterns.abstract_factory;

public class XmlEmpDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving EMP to XML FILE");
    }
}
