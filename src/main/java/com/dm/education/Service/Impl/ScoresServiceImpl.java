package com.dm.education.Service.Impl;

import com.dm.education.Dao.ScoresDao;
import com.dm.education.Model.Scores;
import com.dm.education.Service.ScoresService;
import com.dm.education.vo.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/5/17
 * Time: 21:57
 * Description: No Description
 */
@Service
public class ScoresServiceImpl implements ScoresService {
    @Autowired
    ScoresDao scoresDao;

    @Override
    public Long findByStudentIdAndCourseId(String studentId, String courseId) {
        return scoresDao.findByStudentIdAndCourseId(studentId, courseId);
    }

    @Override
    public void addScores(Scores scores) {
        scoresDao.insertScores(scores);
    }

    @Override
    public void removeScores(String studentId, String courseId) {
        scoresDao.removeScores(studentId, courseId);
    }

    @Override
    public List<StudentVO> findMyStudentList(String teacherId, String courseId) {
        return scoresDao.findMyStudentList(courseId);
    }
}
