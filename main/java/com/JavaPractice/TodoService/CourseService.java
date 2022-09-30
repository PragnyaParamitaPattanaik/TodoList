package com.JavaPractice.TodoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JavaPractice.Entity.Course;
import com.JavaPractice.UserRepository.CourseRepository;

@Service
public class CourseService {
	
	
	    @Autowired
	    private CourseRepository courseRepository;

	    //POST
	    public Course saveCourse(Course course) {
	        System.out.println(course.toString());
	        return courseRepository.save(course);
	    }
	    
	    //Optional!
	    public List<Course> saveCourses(List<Course> courses) {
	        return courseRepository.saveAll(courses);
	    }

	    //GET
	    public List<Course> getCourses() {
	        return courseRepository.findAll();
	    }
	    public Course getCourseById(int id) {
	        return courseRepository.findById(id).orElse(null);
	    }
	    

	    //PUT
	    public Course updateCourse(Course course) {
	        System.out.println("updates");
	        Course existing_course = courseRepository.findById(course.getId()).orElse(null);
	        existing_course.setName(course.getName());
	        existing_course.setDescription(course.getDescription());
	        existing_course.setStatus(course.getStatus());
	        return courseRepository.save(existing_course);
	    }

	    //DELETE
	    public String deleteCourse(int id) {
	        courseRepository.deleteById(id);
	        return id + " id -> course removed/completed";
	    }

	}


