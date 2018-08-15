/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.dao.impl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author beta_
 */
public class Singleton {
    
    //les proprietes
    private static EntityManagerFactory emf;
    private String unitePersistence="ci.objis_DemoJPA_jar_1.0PU";
    
    //constructeur
    private Singleton(){
        emf=Persistence.createEntityManagerFactory(unitePersistence);
    }
    
    //methode permettant de retourner l'unité de persistence
    public static EntityManagerFactory getInstance(){
        if(emf==null){
            new Singleton();
        }
        return emf;
    }
    
}
