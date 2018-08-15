/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.dao.impl;

import com.objis.dao.ISujetDAO;
import com.objis.manytomay.uni.Sujet;

/**
 *
 * @author beta_
 */
public class SujetDao extends Dao<Sujet, Long> implements ISujetDAO{
    
    public SujetDao(Class<Sujet> entityClass) {
        super(entityClass);
    }
    
}
