/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.dao.impl;

import com.objis.dao.IPersonneDAO;
import com.objis.onetomany.uni.Personne;

/**
 *
 * @author beta_
 */
public class PersonneDao extends Dao<Personne, Long> implements IPersonneDAO{
    
    public PersonneDao(Class<Personne> entityClass) {
        super(entityClass);
    }
    
}
