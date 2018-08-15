/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.manytomay.bi;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author beta_
 */
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Sujets")
@Table(name = "sujets")
public class Sujets {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String description;
    
    @Temporal(TemporalType.DATE)
    private Date dateSujet;
    
    @ManyToMany(mappedBy = "sujets", fetch = FetchType.LAZY)
    private List<Etudiants> etudiants;
    
}
