package com.dm.education.Service.Impl;

import com.dm.education.Dao.CourseDao;
import com.dm.education.Model.Course;
import com.dm.education.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> findAll() {
        return courseDao.findAll();
    }

    @Override
    public List<Course> findCourseByTeacherId(String teacher_id) {
        return courseDao.findCourseByTeacherId(teacher_id);
    }
}
