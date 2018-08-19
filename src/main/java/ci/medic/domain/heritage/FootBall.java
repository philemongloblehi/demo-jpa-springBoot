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
@DiscriminatorValue("football")
public class FootBall extends Sport {
    
    @Column(name = "nbreJoueur")
    private Integer nbJoueur;
    
    @Column(name = "nbreGardien")
    private Integer nbGardien;
    
    @Column(name = "tempsJeu")
    private Float tempsJeu;
    
    public FootBall(String libelle, String categorie) {
        super(libelle, categorie);
    }
    
    public FootBall(String libelle, String categorie, Integer nbJoueur, Integer nbGardien) {
        super(libelle, categorie);
        this.nbJoueur = nbJoueur ;
        this.nbGardien = nbGardien;
    }
    
    public FootBall(String libelle, String categorie, Integer nbJoueur, Integer nbGardien, Float tempsJeu) {
        super(libelle, categorie);
        this.nbJoueur = nbJoueur;
        this.nbGardien = nbGardien;
        this.tempsJeu = tempsJeu;
    }
}
