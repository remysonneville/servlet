package com.example.servlet.services;

import java.util.List;

public interface GenericDao<T> {
    public T findById(int id);
    public boolean deleteById(int id);
    public boolean deleteItem(T item);
    public boolean addProduct(T item);
    public boolean updateProduct(T item);
    public List<T> getAllProducts();
    public int getProductIndexById(int id);
}
