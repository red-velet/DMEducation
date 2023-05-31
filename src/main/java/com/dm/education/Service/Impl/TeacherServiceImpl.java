package com.dm.education.Service.Impl;

import com.dm.education.Dao.ScoresDao;
import com.dm.education.Dao.TeacherDao;
import com.dm.education.Model.Scores;
import com.dm.education.Model.Teacher;
import com.dm.education.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherDao teacherDao;

    @Autowired
    ScoresDao scoresDao;

    @Override
    public List<Teacher> login(String teacher_id, String password) {
        return teacherDao.login(teacher_id, password);
    }

    @Override
    public void saveScore(Scores scores) {
        //todo 添加分数
        scoresDao.updateScoreByStudentIdAndCourseId(scores);
    }
}
