package com.objis.manytomay.uni;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Etudiant.class)
public abstract class Etudiant_ {

	public static volatile CollectionAttribute<Etudiant, Sujet> sujets;
	public static volatile SingularAttribute<Etudiant, Long> id;
	public static volatile SingularAttribute<Etudiant, String> nom;
	public static volatile SingularAttribute<Etudiant, String> prenom;

}

