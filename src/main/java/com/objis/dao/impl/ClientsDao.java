/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.dao.impl;

import com.objis.dao.IClientsDAO;
import com.objis.onetone.bi.Clients;
/**
 *
 * @author beta_
 */
public class ClientsDao extends Dao<Clients, Long> implements IClientsDAO{
    
    public ClientsDao(Class<Clients> entityClass) {
        super(entityClass);
    }
    
}
