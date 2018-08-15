package com.objis.onetomany.uni;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Maison.class)
public abstract class Maison_ {

	public static volatile SingularAttribute<Maison, String> ville;
	public static volatile CollectionAttribute<Maison, Personne> personne;
	public static volatile SingularAttribute<Maison, Long> id;

}

