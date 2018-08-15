/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.service.impl;

import com.objis.dao.impl.EtudiantsDao;
import com.objis.manytomay.bi.Etudiants;
import com.objis.service.IEtudiantsService;
import java.util.List;

/**
 *
 * @author beta_
 */
public class EtudiantsService implements IEtudiantsService{
    
    //les proprietes
    private EtudiantsDao dao;
    
    //constructeur par defaut
    public EtudiantsService(){
        dao=new EtudiantsDao(Etudiants.class);
    }

    @Override
    public Etudiants create(Etudiants t) {
        
        return dao.create(t);
        
    }

    @Override
    public Etudiants readOne(Long pk) {
        
        return dao.readOne(pk);
        
    }

    @Override
    public List<Etudiants> readAll() {
        
        return dao.readAll();
        
    }

    @Override
    public Etudiants update(Etudiants t) {
        
        return dao.update(t);
        
    }

    @Override
    public Boolean delete(Long pk) {
        
        return dao.delete(pk);
        
    }

    @Override
    public Long count() {
        
        return dao.count();
        
    }
    
}
