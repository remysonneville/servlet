package com.example.servlet.services;

import com.example.servlet.model.Cour;
import com.example.servlet.model.Planning;

import java.util.ArrayList;
import java.util.List;

public class SupPlanningDao implements GenericDao<Planning> {
    private static List<Planning> plannings = new ArrayList<Planning>();
    private static int idSequence = 0;

    private SupPlanningDao() { }

    @Override
    public Planning findById(int id) {
        for (int i = 0; i < plannings.size(); i++) {
            Planning product = plannings.get(i);
            if(product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        plannings.remove(id);
        return true;
    }

    @Override
    public boolean deleteItem(Planning item) {
        plannings.remove(item);
        return true;
    }

    @Override
    public boolean addItem(Planning item) {
        item.setId(idSequence++);
        plannings.add(item);
        return true;
    }

    @Override
    public boolean updateItem(Planning item) {
        int index = getItemIndexById(item.getId());
        if(index > -1) {
            plannings.set(index, item);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Planning> getAllItems() {
        return plannings;
    }

    @Override
    public int getItemIndexById(int id) {
        for (int i = 0; i < plannings.size(); i++) {
            Planning product = plannings.get(i);
            if(product.getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
