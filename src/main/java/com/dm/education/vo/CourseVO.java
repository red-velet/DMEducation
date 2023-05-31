package com.dm.education.vo;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/5/17
 * Time: 20:33
 * Description: No Description
 */
public class CourseVO {
    private String course_id;
    private String student_id;
    private String teacher_id;
    private String score_id;
    private String course_name;
    private String teacher_name;
    private Double score;

    public String getCourse_name() {
        return course_name;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourseId(String course_id) {
        this.course_id = course_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudentId(String student_id) {
        this.student_id = student_id;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacherId(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getScore_id() {
        return score_id;
    }

    public void setScoreId(String score_id) {
        this.score_id = score_id;
    }

    public void setCourseName(String course_name) {
        this.course_name = course_name;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacherName(String teacher_name) {
        this.teacher_name = teacher_name;
    }


    public String getTeacherName() {
        return teacher_name;
    }


    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
