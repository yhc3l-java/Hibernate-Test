package controllers;

import models.Student;
import play.*;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
	
	public static Result createStudent(){
		
		Student student = new Student();
		
		student.id = 1;
		student.name = "Johanna";
		student.surname = "Doe";
		student.icon = "star";
		
		JPA.em().persist(student);
		
		return ok("Saved!");
	}
	
	@Transactional
    public static Result index() {
        return ok(index.render("Name of first student: " + JPA.em().createQuery("SELECT a FROM Student a", Student.class).getResultList().get(0).name));
    }

}
