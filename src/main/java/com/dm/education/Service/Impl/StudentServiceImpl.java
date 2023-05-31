package com.dm.education.Service.Impl;

import com.dm.education.Dao.StudentDao;
import com.dm.education.Model.Scores;
import com.dm.education.Model.Student;
import com.dm.education.Service.ScoresService;
import com.dm.education.Service.StudentService;
import com.dm.education.dto.EnrollCourseDTO;
import com.dm.education.vo.CourseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> login(String student_id, String password) {
        // TODO Auto-generated method stub
        return studentDao.login(student_id, password);
    }

    @Override
    public List<CourseVO> findAllCourse(String studentId) {
        // TODO 查询所有已报名的课程
        Long test = studentDao.test(studentId);
        return studentDao.findAllCourse(studentId);
    }

    @Override
    public void enrollCourse(EnrollCourseDTO enrollCourseDTO) {
        // TODO 学生报名课程
        Scores scores = new Scores();
        scores.setStudentId(enrollCourseDTO.getStudent_id());
        scores.setCourseId(enrollCourseDTO.getCourse_id());
        //由于主键不能为空，设置一个uuid(指定位数的)
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString().substring(0, 15);
        scores.setScore_id(id);

        //1.检查是否已报名
        if (checkIsEnRollCourse(enrollCourseDTO.getStudent_id(), enrollCourseDTO.getCourse_id()) > 0) {
            throw new RuntimeException("已报名,不可重复报名");
        }

        //2.如果没报名，可以报名
        scoresService.addScores(scores);
    }

    @Override
    public void unrollCourse(EnrollCourseDTO enrollCourseDTO) {
        // TODO 取消报名
        scoresService.removeScores(enrollCourseDTO.getStudent_id(), enrollCourseDTO.getCourse_id());
    }

    @Autowired
    ScoresService scoresService;

    private Long checkIsEnRollCourse(String studentId, String courseId) {
        return scoresService.findByStudentIdAndCourseId(studentId, courseId);
    }
}
