/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.gestion_de_formations_en_ligne.repository;

import fr.utbm.gestion_de_formations_en_ligne.entity.Location;
import fr.utbm.gestion_de_formations_en_ligne.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Ali
 */
public class HibernateLocationDAO {
    
    public List<Location> getAllLocationsHibernate(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Query query = session.createQuery("from Location");
        List<Location> listLocation = query.list();
        return listLocation;
    }
}
