package com.dm.education.Model;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/5/17
 * Time: 21:51
 * Description: No Description
 */
public class Scores {
    private String score_id;
    private String student_id;
    private String course_id;
    private Double score;
    private Integer score_state;

    public String getScore_id() {
        return score_id;
    }

    public void setScore_id(String score_id) {
        this.score_id = score_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudentId(String student_id) {
        this.student_id = student_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourseId(String course_id) {
        this.course_id = course_id;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getScore_state() {
        return score_state;
    }

    public void setScore_state(Integer score_state) {
        this.score_state = score_state;
    }
}
