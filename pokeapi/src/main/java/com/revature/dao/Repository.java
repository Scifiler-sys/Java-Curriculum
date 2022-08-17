package com.revature.dao;

import java.util.List;

//CRUD
public interface Repository<T> {
    public T addInstance(T instance);

    public List<T> getAllInstances();

    public T updateInstance(T instance);

    public void deleteInstance(T instance);
}
