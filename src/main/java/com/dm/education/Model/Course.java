package com.dm.education.Model;
import javax.persistence.Transient;

public class Course {
    private String course_id;
    private String course_name;
    private String course_xueFen;
    private String department_id;
    private String teacher_id;
    @Transient
    private Teacher teacher;
    @Transient
    private Department department;

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_xueFen() {
        return course_xueFen;
    }

    public void setCourse_xueFen(String course_xueFen) {
        this.course_xueFen = course_xueFen;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
