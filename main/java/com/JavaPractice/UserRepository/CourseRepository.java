package com.JavaPractice.UserRepository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JavaPractice.Entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{
	
}