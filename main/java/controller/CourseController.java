package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JavaPractice.Entity.Course;
import com.JavaPractice.TodoService.CourseService;

@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
   
    //POST
    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course) {
        
        return courseService.saveCourse(course);
    }

    @PostMapping("/addCourses")
    public List<Course> addCourses(@RequestBody List<Course> courses) {
        return courseService.saveCourses(courses);
    }

    //GET
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getCourses();
    }
    @GetMapping("/courseById/{id}")
    public Course findCourseById(@PathVariable int id) {
        return courseService.getCourseById(id);
    }
    

    //PUT
    @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course)
    {
        System.out.println("UPDATED");
        return courseService.updateCourse(course);
    }


    //DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteCourse(@PathVariable int id) {
        return courseService.deleteCourse(id);
    }


}
