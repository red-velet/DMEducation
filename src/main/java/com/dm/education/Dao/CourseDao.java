package com.dm.education.Dao;

import com.dm.education.Model.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseDao {
    List<Course> findAll();

    List<Course> findCourseByTeacherId(@Param("teacher_id")String teacher_id);
}
