/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.gestion_de_formations_en_ligne.repository;

import fr.utbm.gestion_de_formations_en_ligne.entity.Course;
import fr.utbm.gestion_de_formations_en_ligne.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Eddie
 */
public class HibernateCourseDAO {
    
    public List<Course> getAllCoursesHibernate()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Query query = session.createQuery("from COURSE");
        List<Course> listCourse = query.list();
        return listCourse;
    }
    
    public List<Course> getAllCoursesHibernate(String motCle)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String keyWord = "%";
        keyWord.concat(motCle).concat("%");
        Query query = session.createQuery("from COURSE as course where course.TITLE like :motcle");
        query.setString(0, keyWord);
        List<Course> listCourse = query.list();
        return listCourse;
    }        
    
}
