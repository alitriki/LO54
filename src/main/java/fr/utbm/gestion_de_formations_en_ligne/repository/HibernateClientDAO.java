/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.gestion_de_formations_en_ligne.repository;

import fr.utbm.gestion_de_formations_en_ligne.entity.Client;
import fr.utbm.gestion_de_formations_en_ligne.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Ali
 */
public class HibernateClientDAO {
    
    public void insertClient(Client client){
        Session session = HibernateUtil.getSessionFactory().openSession();
	    session.beginTransaction();
	    session.persist(client);
	    session.getTransaction().commit();
        
    }
    
}
