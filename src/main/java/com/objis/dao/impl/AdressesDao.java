/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.dao.impl;

import com.objis.dao.IAdressesDAO;
import com.objis.onetone.bi.Adresses;

/**
 *
 * @author beta_
 */
public class AdressesDao extends Dao<Adresses, Long> implements IAdressesDAO{
    
    public AdressesDao(Class<Adresses> entityClass) {
        super(entityClass);
    }
    
}
