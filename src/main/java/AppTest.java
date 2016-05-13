
import fr.utbm.gestion_de_formations_en_ligne.entity.Course;
import fr.utbm.gestion_de_formations_en_ligne.service.CourseService;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        cal.set(2016, 04, 12);
        String formatted = format1.format(cal.getTime());
        //System.out.println(cal.getTime()+"cal.gettime");
        Date d=new Date();
        d=cal.getTime();
        System.out.println(d+"TTTT");
        List<Course> listCourse =  cs.getAllCoursesAtDateService(cal.getTime());
        System.out.println("Liste des courses"+listCourse.toString());
        
        /*Date date = new Date(2016, 03, 15);
        List<Course> listCourse =  cs.getAllCoursesAtDateService(date);
        System.out.println("Liste des sessions"+listCourse.toString());*/
    }
}
