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
@DiscriminatorValue("depLogistique")
public class DepLogistique extends Departement{
    
    private Integer nbVehiculeEnVisit;
    
    public DepLogistique(Integer nbVehicule, String libelle) {
        super(libelle);
        this.nbVehiculeEnVisit = nbVehicule;
    }
    
    public DepLogistique(Long id, String libelle) {
        super(id, libelle);
    }
    
}
