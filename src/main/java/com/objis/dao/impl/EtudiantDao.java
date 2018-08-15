/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.dao.impl;

import com.objis.dao.IEtudiantDAO;
import com.objis.manytomay.uni.Etudiant;

/**
 *
 * @author beta_
 */
public class EtudiantDao extends Dao<Etudiant, Long> implements IEtudiantDAO{
    
    public EtudiantDao(Class<Etudiant> entityClass) {
        super(entityClass);
    }
    
}
