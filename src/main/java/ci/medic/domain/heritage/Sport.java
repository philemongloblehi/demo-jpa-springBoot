/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ci.medic.domain.heritage;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author PHILEMON GLOBLEHI
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Dans cette stratégie, le modèle relationnel est fait d'une seule table pour toute la hiérarchie de classes
//@Inheritance(strategy = InheritanceType.JOINED)  // Ce modèle relationnel est le plus proche du modèle objet : à chaque classe, qu'elle soit concrète ou abstraite, correspond une table. 
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // Avec cette stratégie de mapping, il y a une table pour chaque classe concrète
@DiscriminatorColumn(name = "TypeSport")
public class Sport implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "LIBELLE")
    private String libelle;
    
    @Column(name = "CATEGORIE")
    private String categorie;
    
    public Sport(String libelle, String categorie) {
        this.libelle = libelle;
        this.categorie = categorie;
    }
    
}