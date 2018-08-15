/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.service.impl;

import com.objis.dao.impl.ClientDao;
import com.objis.onetone.uni.Client;
import com.objis.service.IClientService;
import java.util.List;

/**
 *
 * @author beta_
 */
public class ClientService implements IClientService{
    
    private ClientDao dao;
    
    //constructeur par defaut
    public ClientService(){
        dao=new ClientDao(Client.class);
    }

    @Override
    public Client create(Client t) {
        
        return dao.create(t);
        
    }

    @Override
    public Client readOne(Long pk) {
        
        return dao.readOne(pk);
        
    }

    @Override
    public List<Client> readAll() {
        
        return dao.readAll();
        
    }

    @Override
    public Client update(Client t) {
        
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
