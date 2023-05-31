package com.dm.education.Controller;

import com.dm.education.Service.ScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/5/17
 * Time: 23:16
 * Description: No Description
 */
@Controller
@RequestMapping("page")
public class PageController {
    @Autowired
    ScoresService scoresService;

    @RequestMapping(value = "toMyStudentPage", method = RequestMethod.GET)
    public String toMyStudentPage(@RequestParam("teacher_id") String teacherId, @RequestParam("course_id") String courseId, HttpServletRequest request) {
        //List<StudentVO> list = scoresService.getStudentList(teacherId, courseId);
        //request.setAttribute("list", list);
        return "myStudent";
    }
}
