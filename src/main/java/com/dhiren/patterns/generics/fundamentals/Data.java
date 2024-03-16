package com.dhiren.patterns.generics.fundamentals;

public class Data<T> extends BaseData<T> implements IData<T> {

    // T is the type parameter here
    // And this is applicable for only instance methods. As static methods can't determine the type.
    private T data;

    public Data(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data { " +
                "data='" + data + '\'' +
                '}';
    }

    @Override
    public void loadData(T data) {
        this.data = data;
    }

    @Override
    public T printData() {
        return this.data;
    }
}
