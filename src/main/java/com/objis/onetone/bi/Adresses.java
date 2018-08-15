/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.onetone.bi;

import java.io.Serializable;
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
@Entity(name="Adresses")
@Table(name="adresses")
@AllArgsConstructor
@NoArgsConstructor
public class Adresses implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String commun;
    
    private String tel;
    
    @OneToOne(mappedBy = "adresses", fetch = FetchType.LAZY)
    @JoinColumn(name = "client_pk")
    private Clients client;
    
}
