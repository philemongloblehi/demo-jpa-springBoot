/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.service.impl;

import com.objis.dao.impl.PersonnesDao;
import com.objis.onetomany.bi.Personnes;
import com.objis.service.IPersonnesService;
import java.util.List;

/**
 *
 * @author beta_
 */
public class PersonnesService implements IPersonnesService{
    
    private PersonnesDao dao;
    
    //constructeur par defaut
    public PersonnesService(){
        dao=new PersonnesDao(Personnes.class);
    }

    @Override
    public Personnes create(Personnes t) {
        
        return dao.create(t);
        
    }

    @Override
    public Personnes readOne(Long pk) {
        
        return dao.readOne(pk);
        
    }

    @Override
    public List<Personnes> readAll() {
        
        return dao.readAll();
        
    }

    @Override
    public Personnes update(Personnes t) {
        
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
