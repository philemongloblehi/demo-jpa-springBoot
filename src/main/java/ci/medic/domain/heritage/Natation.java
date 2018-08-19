/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ci.medic.domain.heritage;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
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
@DiscriminatorValue("natation")
public class Natation extends Sport {
    
    @Column(name = "NbreTour")
    private Integer nbTour;
    
    @Column(name = "TypeDeNatation")
    private String typeDeNatation;
    
    public Natation(String libelle, String categorie) {
        super(libelle, categorie);
    }
    
    public Natation(String libelle, String categorie, String typeDeNatation) {
        super(libelle, categorie);
        this.typeDeNatation = typeDeNatation;
    }
    
    public Natation(String libelle, String categorie, Integer nbTour, String typeDenatation) {
        super(libelle, categorie);
        this.nbTour = nbTour;
        this.typeDeNatation = typeDenatation;
    }
    
}
