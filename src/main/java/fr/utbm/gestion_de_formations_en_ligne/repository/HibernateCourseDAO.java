/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.gestion_de_formations_en_ligne.repository;

import fr.utbm.gestion_de_formations_en_ligne.entity.Course;
import fr.utbm.gestion_de_formations_en_ligne.entity.CourseSession;
import fr.utbm.gestion_de_formations_en_ligne.entity.Location;
import fr.utbm.gestion_de_formations_en_ligne.util.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Eddie
 */
public class HibernateCourseDAO {

    public List<Course> getAllCoursesHibernate() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Query query = session.createQuery("from Course");
        List<Course> listCourse = query.list();
        return listCourse;
    }

    public List<Course> getAllCoursesHibernate(String motCle) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Course as course where course.title like  ?");
        query.setString(0, "%" + motCle + "%");
        List<Course> listCourse = query.list();
        return listCourse;
    }

    public List<Course> getAllCoursesAtDateHibernate(Date date) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Query query = session.createQuery("from Course");
        List<Course> listCourse = query.list();

        List<Course> listCourseOK = new ArrayList<>();

        for (Course c : listCourse) {
            for (Iterator it = c.getCourseSessions().iterator(); it.hasNext();) {
                CourseSession cs = (CourseSession) it.next();
                System.out.println(cs.getStartDate() + "Date de cs");
                System.out.println(date + "date param");

                if (cs.getStartDate().after(date)) {
                    listCourseOK.add(c);
                }
            }
        }
        return listCourseOK;
    }

    public List<Course> getAllCoursesAtLocationHibernate(Location location) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Query query = session.createQuery("from Course");
        List<Course> listCourse = query.list();

        List<Course> listCourseOK = new ArrayList<>();

        for (Course c : listCourse) {
            for (Iterator it = c.getCourseSessions().iterator(); it.hasNext();) {
                CourseSession cs = (CourseSession) it.next();
//                System.out.println(c.getTitle() + "  " + cs.getLocation().getCity() + " city");

                if (cs.getLocation().getCity().equalsIgnoreCase(location.getCity())) {
//                    System.out.println(c.getTitle() + " added");
                    listCourseOK.add(c);

                }
//                else{
//                    System.out.println(c.getTitle()+" not added");
//                }
            }
        }
        return listCourseOK;
    }

    public List<CourseSession> getAllCourseSessions(String code) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Course as course where course.code=?");
        query.setString(0,code);
        Course c=(Course) query.uniqueResult();
        List<CourseSession> list=new ArrayList<>();;
        for (Iterator it = c.getCourseSessions().iterator(); it.hasNext();) {
                CourseSession cs = (CourseSession) it.next();
                list.add(cs);
        }
        return list;
        
    }

    public Course getCourseByCode(String code) {
       Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Course as course where course.code=?");
        query.setString(0,code);
        Course c=(Course) query.uniqueResult();
        return c;
    }

}
