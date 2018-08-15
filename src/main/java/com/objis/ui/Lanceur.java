/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.ui;

import ci.medic.domain.tp.Eleve;
import com.objis.dao.impl.EleveDAO;
import com.objis.onetone.uni.Adresse;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author beta_
 */
public class Lanceur {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ci.objis_DemoJPA_jar_1.0PU");
        EntityManager em = emf.createEntityManager();

        Adresse adresse = new Adresse("Cocody", "03336555");

        em.getTransaction().begin();
        em.persist(adresse);

//        //lecture d'un element
//        Adresse monAdresse = em.find(Adresse.class, 1L);
//        System.out.println("*************avant modification***********************");
//        System.out.println(monAdresse);
//        System.out.println("*****************************************");
//
//        //modification d'un enregistrement
//        monAdresse.setCommun("Yopougon");
//        monAdresse.setTel("0000000000");
//        Adresse nvlAdresse = em.merge(monAdresse);
//        em.flush();
//        em.getTransaction().commit();
//        
//        System.out.println("******************apres modification***********************");
//        System.out.println(nvlAdresse);
//        System.out.println("*****************************************");
//        
        em.close();
        emf.close();

        //Adresse adresse=new Adresse(2L,"Marcory", "78125555");

        //AdresseDao adresseDao=new AdresseDao(Adresse.class);
       // ClientDao clientDao=new ClientDao(Client.class);
      // Client client=new Client(1L,"seka", "cannel", new Adresse(1L,"abobo", "sogefiha"));
        //System.out.println("************************************");
        //System.out.println(adresseDao.count());
        //System.out.println("****************************************");
        
        EleveDAO eleveDAO = new EleveDAO(Eleve.class);
        
//        Eleve eleve = new Eleve("001", "GLOBLEHI", "PHLEMON", "YOPOUGON");
//        Eleve eleve1 = new Eleve("002", "YEO", "SOUNGALO", "YOPOUGON");
//        Eleve eleve2 = new Eleve("003", "LANDRY", "NDEPO", "ANONO");
//        Eleve eleve3 = new Eleve("004", "YAYA", "DAGNOGO", "MARCORY");
//        Eleve eleve4 = new Eleve("005", "AISSATA", "DIENG", "MARCORY");
//        
//        System.out.println(eleveDAO.create(eleve));
//        System.out.println(eleveDAO.create(eleve1));
//        System.out.println(eleveDAO.create(eleve2));
//        System.out.println(eleveDAO.create(eleve3));
//        System.out.println(eleveDAO.create(eleve4));

          List<Eleve> listEleveCommune = eleveDAO.listEleveCommune("MARCORY");
          System.out.println(listEleveCommune);

    }

}
