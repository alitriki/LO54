
import fr.utbm.gestion_de_formations_en_ligne.entity.Course;
import fr.utbm.gestion_de_formations_en_ligne.service.CourseService;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eddie
 */
public class AppTest {
    
    public static void main(String[] args) {
        
        /*CourseService cs = new CourseService();
        List<Course> listCourse =  cs.getAllCoursesService("Base");
        System.out.println("Liste des courses"+listCourse.toString());*/
        
        CourseService cs = new CourseService();
        Date date = new Date(2016, 05, 12);
        List<Course> listCourse =  cs.getAllCoursesAtDateService(date);
        System.out.println("Liste des courses"+listCourse.toString());
        
        /*Date date = new Date(2016, 03, 15);
        List<Course> listCourse =  cs.getAllCoursesAtDateService(date);
        System.out.println("Liste des sessions"+listCourse.toString());*/
    }
}
