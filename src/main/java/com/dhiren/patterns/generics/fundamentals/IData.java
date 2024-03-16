package com.dhiren.patterns.generics.fundamentals;

public interface IData<T> extends IBase<T> {
    void loadData(T data);

}
