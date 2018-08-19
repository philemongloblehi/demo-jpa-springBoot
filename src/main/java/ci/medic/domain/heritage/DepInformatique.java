/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ci.medic.domain.heritage;


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
@DiscriminatorValue("depInfo")
public class DepInformatique extends Departement {
    
    private String langageDeProg;
    
    private Integer nbDev;
    
    public DepInformatique(String libelle) {
        super(libelle);
    }
    
    public DepInformatique(Long id, String libelle) {
        super(id, libelle);
    }
    
    public DepInformatique(String langage, Integer nbDev, String libelle) {
        super(libelle);
        this.langageDeProg=langage;
        this.nbDev=nbDev;
    }
}