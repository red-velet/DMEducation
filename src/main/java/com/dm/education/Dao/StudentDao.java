package com.dm.education.Dao;

import com.dm.education.Model.Student;
import com.dm.education.vo.CourseVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    List<Student> login(@Param("student_id") String student_id, @Param("password") String password);

    List<CourseVO> findAllCourse(@Param("studentId") String studentId);

    Long test(@Param("studentId") String studentId);

}
