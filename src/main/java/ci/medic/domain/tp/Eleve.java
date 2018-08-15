/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ci.medic.domain.tp;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author PHILEMON GLOBLEHI
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
public class Eleve implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "MATRICULE")
    private String matricule;
    
    @Column(name = "NOM")
    private String nom;
    
    @Column(name = "PRENOMS")
    private String prenom;
    
    @Column(name = "COMMUNE")
    private String commune;

    public Eleve(String matricule, String nom, String prenom, String commune) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.commune = commune;
    }
    
    
    
}
