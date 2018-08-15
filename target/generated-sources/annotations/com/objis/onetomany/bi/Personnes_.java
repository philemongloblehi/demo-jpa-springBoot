package com.objis.onetomany.bi;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Personnes.class)
public abstract class Personnes_ {

	public static volatile SingularAttribute<Personnes, Long> id;
	public static volatile SingularAttribute<Personnes, Maisons> maisons;
	public static volatile SingularAttribute<Personnes, String> nom;
	public static volatile SingularAttribute<Personnes, String> prenom;

}

