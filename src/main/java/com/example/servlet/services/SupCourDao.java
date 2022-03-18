package com.example.servlet.services;

import com.example.servlet.model.Cour;
import com.supinfo.sun.supcommerce.bo.SupProduct;
import com.supinfo.sun.supcommerce.exception.UnknownProductException;

import java.util.ArrayList;
import java.util.List;

public class SupCourDao implements GenericDao<Cour>{
    private static List<Cour> cours = new ArrayList<Cour>();
    private static int idSequence = 0;

    private SupCourDao() { }

    @Override
    public Cour findById(int id) {
        for (int i = 0; i < cours.size(); i++) {
            Cour product = cours.get(i);
            if(product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        cours.remove(id);
        return true;
    }

    @Override
    public boolean deleteItem(Cour item) {
        cours.remove(item);
        return true;
    }

    @Override
    public boolean addItem(Cour item) {
        item.setId(idSequence++);
        cours.add(item);
        return true;
    }

    @Override
    public boolean updateItem(Cour cour) {
        int index = getItemIndexById(cour.getId());
        if(index > -1) {
            cours.set(index, cour);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Cour> getAllItems() {
        return cours;
    }

    @Override
    public int getItemIndexById(int id) {
        for (int i = 0; i < cours.size(); i++) {
            Cour product = cours.get(i);
            if(product.getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
