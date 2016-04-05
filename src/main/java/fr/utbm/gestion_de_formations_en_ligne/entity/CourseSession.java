package fr.utbm.gestion_de_formations_en_ligne.entity;
// Generated 4 avr. 2016 22:24:00 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CourseSession generated by hbm2java
 */
public class CourseSession  implements java.io.Serializable {


     private short id;
     private Course course;
     private Location location;
     private Date startDate;
     private Date endDate;
     private Set clients = new HashSet(0);

    public CourseSession() {
    }

	
    public CourseSession(short id, Course course, Location location, Date startDate, Date endDate) {
        this.id = id;
        this.course = course;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public CourseSession(short id, Course course, Location location, Date startDate, Date endDate, Set clients) {
       this.id = id;
       this.course = course;
       this.location = location;
       this.startDate = startDate;
       this.endDate = endDate;
       this.clients = clients;
    }
   
    public short getId() {
        return this.id;
    }
    
    public void setId(short id) {
        this.id = id;
    }
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    public Location getLocation() {
        return this.location;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public Set getClients() {
        return this.clients;
    }
    
    public void setClients(Set clients) {
        this.clients = clients;
    }




}

