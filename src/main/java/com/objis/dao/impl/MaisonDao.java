/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.dao.impl;

import com.objis.dao.IMaisonDAO;
import com.objis.onetomany.uni.Maison;

/**
 *
 * @author beta_
 */
public class MaisonDao extends Dao<Maison, Long> implements IMaisonDAO{
    
    public MaisonDao(Class<Maison> entityClass) {
        super(entityClass);
    }
    
}
