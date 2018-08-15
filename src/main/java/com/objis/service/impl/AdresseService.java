/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.service.impl;

import com.objis.dao.impl.AdresseDao;
import com.objis.onetone.uni.Adresse;
import com.objis.service.IAdresseService;
import java.util.List;

/**
 *
 * @author beta_
 */
public class AdresseService implements IAdresseService{
    
    private AdresseDao dao;
    
    //constructeur par defaut
    public AdresseService(){
        dao=new AdresseDao(Adresse.class);
    }

    @Override
    public Adresse create(Adresse t) {
        
        return dao.create(t);
        
    }

    @Override
    public Adresse readOne(Long pk) {
           
        return dao.readOne(pk);
    }

    @Override
    public List<Adresse> readAll() {
        
        return dao.readAll();
        
    }

    @Override
    public Adresse update(Adresse t) {
        
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
