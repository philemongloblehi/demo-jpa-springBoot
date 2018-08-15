/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.service.impl;

import com.objis.dao.impl.SujetDao;
import com.objis.manytomay.uni.Sujet;
import com.objis.service.ISujetService;
import java.util.List;

/**
 *
 * @author beta_
 */
public class SujetService implements ISujetService {
    
    //les proprietes
    private SujetDao dao;
    
    //constructeur par defaut
    public SujetService(){
        dao=new SujetDao(Sujet.class);
    }

    @Override
    public Sujet create(Sujet t) {
        
        return dao.create(t);
        
    }

    @Override
    public Sujet readOne(Long pk) {
        
        return dao.readOne(pk);
        
    }

    @Override
    public List<Sujet> readAll() {
        
        return dao.readAll();
        
    }

    @Override
    public Sujet update(Sujet t) {
        
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
