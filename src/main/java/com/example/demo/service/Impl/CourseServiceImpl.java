package com.example.demo.service.Impl;

import com.example.demo.entity.Course;
import com.example.demo.entity.User;
import com.example.demo.models.Course.CourseModel;
import com.example.demo.repo.CourseRepository;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public void createCourse(CourseModel courseModel) {
        String topicsString = String.join(",", courseModel.getTopics());
        Course course = Course.builder()
                .title(courseModel.getTitle())
                .description(courseModel.getDescription())
                .price(courseModel.getPrice())
                .instructor(courseModel.getInstructor())
                .startDate(courseModel.getStartDate())
                .topics(topicsString)
                .build();
        courseRepository.save(course);
    }

    @Override
    public List<CourseModel> getAllCourses() {
        List<Course> allCourses = courseRepository.findAll();
        return allCourses.stream().map(course -> {
            return CourseModel.builder()
                    .title(course.getTitle())
                    .description(course.getDescription())
                    .instructor(course.getInstructor())
                    .topics(course.getTopics().split(","))
                    .startDate(course.getStartDate())
                    .price(course.getPrice())
                    .build();
        }).collect(Collectors.toList());
    }
}
