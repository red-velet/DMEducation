package com.dm.education.Service;

import com.dm.education.Model.Student;
import com.dm.education.dto.EnrollCourseDTO;
import com.dm.education.vo.CourseVO;

import java.util.List;

public interface StudentService {
    List<Student> login(String student_id, String password);

    List<CourseVO> findAllCourse(String studentId);

    void enrollCourse(EnrollCourseDTO enrollCourseDTO);

    void unrollCourse(EnrollCourseDTO enrollCourseDTO);
}
