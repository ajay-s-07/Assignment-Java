package com.example.demo.service;

import com.example.demo.models.Course.CourseModel;

import java.util.List;

public interface CourseService {

    void createCourse(CourseModel courseModel);

    List<CourseModel> getAllCourses();
}
