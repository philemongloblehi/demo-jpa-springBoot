/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.dao.impl;

import com.objis.dao.IMaisonsDAO;
import com.objis.onetomany.bi.Maisons;

/**
 *
 * @author beta_
 */
public class MaisonsDao extends Dao<Maisons, Long> implements IMaisonsDAO{
    
    public MaisonsDao(Class<Maisons> entityClass) {
        super(entityClass);
    }
    
}
