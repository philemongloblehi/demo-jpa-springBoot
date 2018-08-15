/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.service.impl;

import com.objis.dao.impl.AdressesDao;
import com.objis.onetone.bi.Adresses;
import com.objis.service.IAdressesService;
import java.util.List;

/**
 *
 * @author beta_
 */
public class AdressesService implements IAdressesService {
    
    private AdressesDao dao;
    
    //constructeur par defaut
    public AdressesService(){
        dao=new AdressesDao(Adresses.class);
    }

    @Override
    public Adresses create(Adresses t) {
        
        return dao.create(t);
        
    }

    @Override
    public Adresses readOne(Long pk) {
        
        return dao.readOne(pk);
        
    }

    @Override
    public List<Adresses> readAll() {
        
        return dao.readAll();
        
    }

    @Override
    public Adresses update(Adresses t) {
        
        return update(t);
                
    }

    @Override
    public Boolean delete(Long pk) {
        
        return delete(pk);
        
    }

    @Override
    public Long count() {
        
        return count();
        
    }
    
}
