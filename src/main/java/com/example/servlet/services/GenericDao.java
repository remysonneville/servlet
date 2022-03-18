package com.example.servlet.services;

import java.util.List;

public interface GenericDao<T> {
    public T findById(int id);
    public boolean deleteById(int id);
    public boolean deleteItem(T item);
    public boolean addItem(T item);
    public boolean updateItem(T item);
    public List<T> getAllItems();
    public int getItemIndexById(int id);
}
