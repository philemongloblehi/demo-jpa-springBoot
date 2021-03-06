/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.onetone.uni;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author beta_
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Adresse implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String commun;
    
    private String tel;

    public Adresse(String commun, String tel) {
        this.commun = commun;
        this.tel = tel;
    }
    
    
    
    
}
