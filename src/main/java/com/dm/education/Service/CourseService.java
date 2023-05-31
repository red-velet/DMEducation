package com.dm.education.Service;

import com.dm.education.Dao.CourseDao;
import com.dm.education.Model.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAll();

    List<Course> findCourseByTeacherId(String teacher_id);
}
