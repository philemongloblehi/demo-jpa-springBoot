/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.dao.impl;

import ci.medic.domain.tp.Eleve;
import com.objis.dao.IEleveDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author PHILEMON GLOBLEHI
 */
public class EleveDAO extends Dao<Eleve, Long> implements IEleveDAO{

    @Override
    public List<Eleve> listEleveCommune(String commune) {
        query = em.createQuery("SELECT e FROM Eleve e WHERE e.commune = :c");
        return query.setParameter("c", commune).getResultList();
    }

    @Override
    public Eleve findByMat(String matricule) {
        query = em.createQuery("SELECT e FROM Eleve e WHERE e.matricule = :m");
        return (Eleve) query.setParameter("m", matricule).getResultList();
    }

    @Override
    public List<Object[]> listNomPrenom() {
        query = em.createQuery("SELECT e.nom, e.prenom FROM Eleve e");
        return query.getResultList();
    }

    @Override
    public List<Eleve> findByPrenom(String prenom) {
        query = em.createQuery("SELECT e FROM Eleve e WHERE e.prenom LIKE :p");
        return query.setParameter("p", prenom).getResultList();
    }
    
    // Les propriétes
    private Query query;
    
    public EleveDAO(Class<Eleve> entityClass) {
        super(entityClass);
    }
    
    
}
