/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.service.impl;

import com.objis.dao.impl.MaisonsDao;
import com.objis.onetomany.bi.Maisons;
import com.objis.service.IMaisonsService;
import java.util.List;

/**
 *
 * @author beta_
 */
public class MaisonsService implements IMaisonsService{
    
    private MaisonsDao dao;
    
    //constructeur par defaut
    public MaisonsService(){
        dao=new MaisonsDao(Maisons.class);
    }

    @Override
    public Maisons create(Maisons t) {
        
        return dao.create(t);
        
    }

    @Override
    public Maisons readOne(Long pk) {
        
        return dao.readOne(pk);
        
    }

    @Override
    public List<Maisons> readAll() {
        
        return dao.readAll();
        
    }

    @Override
    public Maisons update(Maisons t) {
        
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
