/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.dao.impl;

import com.objis.dao.IDao;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author beta_
 */
public abstract class Dao<T,PK extends Serializable> implements IDao<T,PK>{
    
    protected EntityManager em;
    private Class<T> entityClass;

    public Dao(Class<T> entityClass) {
        
        this.entityClass=entityClass;
        em=Singleton.getInstance().createEntityManager();
        
    }

    @Override
    public T create(T t) {
        
        em.getTransaction().begin();
        em.persist(t);
        em.flush();
        em.getTransaction().commit();
        
         return t;
        
    }

    @Override
    public T readOne(PK pk) {
        
        T t = em.find(entityClass, pk);
        
         return t;
        
        
    }

    @Override
    public List<T> readAll() {
        
        return em.createQuery("select t from "+entityClass.getSimpleName()+" t").getResultList();
        
    }

    @Override
    public T update(T t) {
        
        em.getTransaction().begin();
        t=em.merge(t);
        em.flush();
        em.getTransaction().commit();
        
        return t;
    }

    @Override
    public Boolean delete(PK pk) {
        
        T t = em.find(entityClass, pk);
        
        if(t!=null){
            
            em.getTransaction().begin();
            em.remove(t);
            em.flush();
            em.getTransaction().commit();
            
            return true;
            
        }
        
        return false;    
        
    }

    @Override
    public Long count() {
        
        return (long) em.createQuery("select count(t) from "+entityClass.getSimpleName()+" t").getSingleResult();
    
    }
    
    
    
       
}
