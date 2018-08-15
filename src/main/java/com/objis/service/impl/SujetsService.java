/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.service.impl;

import com.objis.dao.impl.SujetsDao;
import com.objis.manytomay.bi.Sujets;
import com.objis.service.ISujetsService;
import java.util.List;

/**
 *
 * @author beta_
 */
public class SujetsService implements ISujetsService{
    
    //les proprietes
    private SujetsDao dao;
    
    //constructeur par defaut
    public SujetsService(){
        dao=new SujetsDao(Sujets.class);
    }

    @Override
    public Sujets create(Sujets t) {
        
        return dao.create(t);
        
    }

    @Override
    public Sujets readOne(Long pk) {
        
        return dao.readOne(pk);
        
    }

    @Override
    public List<Sujets> readAll() {
        
        return dao.readAll();
        
    }

    @Override
    public Sujets update(Sujets t) {
        
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
