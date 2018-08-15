package com.objis.onetomany.bi;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Maisons.class)
public abstract class Maisons_ {

	public static volatile SingularAttribute<Maisons, String> ville;
	public static volatile CollectionAttribute<Maisons, Personnes> personne;
	public static volatile SingularAttribute<Maisons, Long> id;

}

