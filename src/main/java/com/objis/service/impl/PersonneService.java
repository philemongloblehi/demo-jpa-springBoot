/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.service.impl;

import com.objis.dao.impl.PersonneDao;
import com.objis.onetomany.uni.Personne;
import com.objis.service.IPersonneService;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author beta_
 */
public class PersonneService implements IPersonneService{
    
    private PersonneDao dao;
    
    //constructeur par defaut
    public PersonneService(){
        dao=new PersonneDao(Personne.class);
    }

    @Override
    public Personne create(Personne t) {
        
        return dao.create(t);
        
    }

    @Override
    public Personne readOne(Long pk) {
        
        return dao.readOne(pk);
        
    }

    @Override
    public List<Personne> readAll() {
        
        return dao.readAll();
        
    }

    @Override
    public Personne update(Personne t) {
        
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
