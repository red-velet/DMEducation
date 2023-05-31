package com.dm.education.Service;

import com.dm.education.Model.Scores;
import com.dm.education.vo.StudentVO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/5/17
 * Time: 21:56
 * Description: No Description
 */
public interface ScoresService {
    Long findByStudentIdAndCourseId(String studentId, String courseId);

    void addScores(Scores scores);

    void removeScores(String studentId, String courseId);

    List<StudentVO> findMyStudentList(String teacherId, String courseId);
}
