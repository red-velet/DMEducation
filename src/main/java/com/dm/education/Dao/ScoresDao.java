package com.dm.education.Dao;

import com.dm.education.Model.Scores;
import com.dm.education.vo.StudentVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/5/17
 * Time: 21:59
 * Description: No Description
 */
public interface ScoresDao {

    public Long findByStudentIdAndCourseId(@Param("studentId") String studentId, @Param("courseId") String courseId);

    void insertScores(Scores scores);

    void removeScores(@Param("studentId") String studentId, @Param("courseId") String courseId);

    List<StudentVO> findMyStudentList(@Param("courseId") String courseId);

    void updateScoreByStudentIdAndCourseId(Scores scores);
}
