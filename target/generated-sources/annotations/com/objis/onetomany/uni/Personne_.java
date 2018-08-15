package com.objis.onetomany.uni;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Personne.class)
public abstract class Personne_ {

	public static volatile SingularAttribute<Personne, Long> id;
	public static volatile SingularAttribute<Personne, String> nom;
	public static volatile SingularAttribute<Personne, String> prenom;

}

