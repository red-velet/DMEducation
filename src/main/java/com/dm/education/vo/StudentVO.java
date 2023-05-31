package com.dm.education.vo;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/5/17
 * Time: 23:17
 * Description: No Description
 */
public class StudentVO {
    private String studentId;
    private String studentName;
    private String departmentName;
    private String gender;
    private Double score;

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStudentId(String student_id) {
        this.studentId = student_id;
    }


    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
