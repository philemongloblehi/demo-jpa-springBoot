/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.onetomany.bi;

import com.objis.onetomany.uni.Personne;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.NoArgsConstructor;

/**
 *
 * @author beta_
 */
@Entity
@Table(name = "maisons")
@NoArgsConstructor
public class Maisons {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String ville;
    
    @OneToMany(mappedBy = "maisons" ,fetch = FetchType.LAZY)
    private Collection<Personnes> personne;
    
}
