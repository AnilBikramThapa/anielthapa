/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sm.dao;

import com.leapfrog.sm.dao.impl.Student;
import java.util.ArrayList;

/**
 *
 * @author Aniel Bkiram Thapa
 */
public interface Management {
 void add(Student s);
 void deleteById(int id);
 Student getById(int id);
 ArrayList<Student> showAll();
 Student getByEmail(String email);
  
    
    
}
