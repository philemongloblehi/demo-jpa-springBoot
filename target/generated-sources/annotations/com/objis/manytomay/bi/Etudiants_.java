package com.objis.manytomay.bi;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Etudiants.class)
public abstract class Etudiants_ {

	public static volatile CollectionAttribute<Etudiants, Sujets> sujets;
	public static volatile SingularAttribute<Etudiants, Long> id;
	public static volatile SingularAttribute<Etudiants, String> nom;
	public static volatile SingularAttribute<Etudiants, String> prenom;

}

