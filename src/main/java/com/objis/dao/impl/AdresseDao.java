/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.dao.impl;

import com.objis.dao.IAdresseDAO;
import com.objis.onetone.uni.Adresse;

/**
 *
 * @author beta_
 */
public class AdresseDao extends Dao<Adresse, Long> implements IAdresseDAO{
    
    public AdresseDao(Class<Adresse> entityClass) {
        super(entityClass);
    }
    
}
