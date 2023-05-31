package com.dm.education.Service;

import com.dm.education.Model.Scores;
import com.dm.education.Model.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> login(String teacher_id, String password);

    void saveScore(Scores scores);
}
