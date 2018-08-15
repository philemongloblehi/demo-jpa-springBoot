/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.service.impl;

import com.objis.dao.impl.ClientsDao;
import com.objis.onetone.bi.Clients;
import com.objis.service.IClientsService;
import java.util.List;

/**
 *
 * @author beta_
 */
public class ClientsService implements IClientsService{
    
    private ClientsDao dao;
    
    //constructeur par defaut
    public ClientsService(){
        dao=new ClientsDao(Clients.class);
    }

    @Override
    public Clients create(Clients t) {
        
        return dao.create(t);
        
    }

    @Override
    public Clients readOne(Long pk) {
        
        return dao.readOne(pk);
        
    }

    @Override
    public List<Clients> readAll() {
        
        return dao.readAll();
        
    }

    @Override
    public Clients update(Clients t) {
        
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
