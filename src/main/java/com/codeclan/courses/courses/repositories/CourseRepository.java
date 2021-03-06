package com.codeclan.courses.courses.repositories;

import com.codeclan.courses.courses.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findCoursesByRating(int rating);

    List<Course> findCoursesByBookingCustomerId(Long id);
}
