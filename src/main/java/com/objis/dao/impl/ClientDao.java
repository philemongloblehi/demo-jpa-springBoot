/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.dao.impl;

import com.objis.dao.IClientDAO;
import com.objis.onetone.uni.Client;

/**
 *
 * @author beta_
 */
public class ClientDao extends Dao<Client, Long> implements IClientDAO{
    
    public ClientDao(Class<Client> entityClass) {
        super(entityClass);
    }
    
}
