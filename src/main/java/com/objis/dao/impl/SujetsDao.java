/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.dao.impl;

import com.objis.dao.ISujetsDAO;
import com.objis.manytomay.bi.Sujets;

/**
 *
 * @author beta_
 */
public class SujetsDao extends Dao<Sujets, Long> implements ISujetsDAO{
    
    public SujetsDao(Class<Sujets> entityClass) {
        super(entityClass);
    }
    
}
