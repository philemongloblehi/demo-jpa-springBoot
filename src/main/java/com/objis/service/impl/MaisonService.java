/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.service.impl;

import com.objis.dao.impl.MaisonDao;
import com.objis.onetomany.uni.Maison;
import com.objis.service.IMaisonService;
import java.util.List;

/**
 *
 * @author beta_
 */
public class MaisonService implements IMaisonService{
    
    private MaisonDao dao;
    
    public MaisonService(){
        dao=new MaisonDao(Maison.class);
    }

    @Override
    public Maison create(Maison t) {
        
        return dao.create(t);
        
    }

    @Override
    public Maison readOne(Long pk) {
        
        return dao.readOne(pk);
        
    }

    @Override
    public List<Maison> readAll() {
        
        return dao.readAll();
        
    }

    @Override
    public Maison update(Maison t) {
        
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
