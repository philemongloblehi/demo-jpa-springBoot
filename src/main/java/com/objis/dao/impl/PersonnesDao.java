/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.dao.impl;

import com.objis.dao.IPersonnesDAO;
import com.objis.onetomany.bi.Personnes;

/**
 *
 * @author beta_
 */
public class PersonnesDao extends Dao<Personnes, Long> implements IPersonnesDAO{
    
    public PersonnesDao(Class<Personnes> entityClass) {
        super(entityClass);
    }
    
}
