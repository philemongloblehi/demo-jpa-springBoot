/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.onetone.bi;

import com.objis.onetone.uni.Adresse;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author beta_
 */
@Entity(name = "Clients")
@Table(name = "clients")
@AllArgsConstructor
@NoArgsConstructor
public class Clients implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "NOM")
    private String nom;
    
    @Column(name="PRENOM")
    private String prenom;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "adresse_pk")
    private Adresses adresses;
    
}
