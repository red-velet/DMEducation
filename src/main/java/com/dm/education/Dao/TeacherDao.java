package com.dm.education.Dao;

import com.dm.education.Model.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherDao {
    List<Teacher> login(@Param("teacher_id") String teacher_id, @Param("password")String password);
}
