/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author beta_
 */
public interface IDao<T,PK extends Serializable> {
    
    public T create(final T t);
    
    public T readOne(final PK pk);
    
    public List<T> readAll();
    
    public T update(final T t);
    
    public Boolean delete(final PK pk);
    
    public Long count();
    
}
