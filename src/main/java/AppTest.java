
import fr.utbm.gestion_de_formations_en_ligne.entity.Course;
import fr.utbm.gestion_de_formations_en_ligne.service.CourseService;
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
        System.out.println("Liste des sessions");
        CourseService cs = new CourseService();
        List<Course> listCourse =  cs.getAllCoursesService();
        for (Course c : listCourse) {
            c.toString();
        }
    }
}
