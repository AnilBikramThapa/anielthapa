/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sm.dao.impl;

import com.leapfrog.sm.dao.Management;
import java.util.ArrayList;

/**
 *
 * @author Aniel Bkiram Thapa
 */
public class Student implements Management {

    @Override
    public void add(Student s) {
        System.out.println("management adds student");
    }

    @Override
    public void deleteById(int id) {
        System.out.println("management deletes");
    }

    @Override
    public Student getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Student> showAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getByEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
