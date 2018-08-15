/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.dao.impl;

import com.objis.dao.IEtudiantsDAO;
import com.objis.manytomay.bi.Etudiants;

/**
 *
 * @author beta_
 */
public class EtudiantsDao extends Dao<Etudiants, Long> implements IEtudiantsDAO{
    
    public EtudiantsDao(Class<Etudiants> entityClass) {
        super(entityClass);
    }
    
}
