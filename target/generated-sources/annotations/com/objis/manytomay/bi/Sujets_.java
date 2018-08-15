package com.objis.manytomay.bi;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Sujets.class)
public abstract class Sujets_ {

	public static volatile SingularAttribute<Sujets, String> description;
	public static volatile SingularAttribute<Sujets, Long> id;
	public static volatile SingularAttribute<Sujets, Date> dateSujet;
	public static volatile ListAttribute<Sujets, Etudiants> etudiants;

}

