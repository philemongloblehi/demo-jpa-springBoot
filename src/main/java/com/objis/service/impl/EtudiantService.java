/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.service.impl;

import com.objis.dao.impl.EtudiantDao;
import com.objis.manytomay.uni.Etudiant;
import com.objis.service.IEtudiantService;
import java.util.List;

/**
 *
 * @author beta_
 */
public class EtudiantService implements IEtudiantService{
    
    //les proprietes
    private EtudiantDao dao;
    
    //constructeur par defaut
    public EtudiantService(){
        dao=new EtudiantDao(Etudiant.class);
    }

    @Override
    public Etudiant create(Etudiant t) {
        
        return dao.create(t);
        
    }

    @Override
    public Etudiant readOne(Long pk) {
        
        return dao.readOne(pk);
        
    }

    @Override
    public List<Etudiant> readAll() {
        
        return dao.readAll();
        
    }

    @Override
    public Etudiant update(Etudiant t) {
       
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
