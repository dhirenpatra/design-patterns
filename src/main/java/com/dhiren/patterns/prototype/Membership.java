package com.dhiren.patterns.prototype;

public class Membership {

    private String license;

    public Membership(String license) {
        this.license = license;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Membership{" +
                "license='" + license + '\'' +
                '}';
    }
}
