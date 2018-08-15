/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.dao;

import ci.medic.domain.tp.Eleve;
import java.util.List;

/**
 *
 * @author PHILEMON GLOBLEHI
 */
public interface IEleveDAO {
    
    public List<Eleve> listEleveCommune(String commune);
    public Eleve findByMat(String matricule);
    public List<Object[]> listNomPrenom();
    public List<Eleve> findByPrenom(String prenom);
    
}
