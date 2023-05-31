package com.dm.education.Controller;

import com.dm.education.Model.Course;
import com.dm.education.Service.CourseService;
import com.dm.education.Utils.JsonResultVo;
import com.dm.education.Utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "findAllCourse",method = RequestMethod.GET)
    public JsonResultVo findAllCourse(@RequestParam(value = "page") int page,
                                      @RequestParam(value = "rows") int rows){
        List<Course> courseList = courseService.findAll();
        PageUtil pageUtil = new PageUtil(page,rows,courseList);
        return JsonResultVo.ok(pageUtil);
    }

    @RequestMapping(value = "findCourseByTeacherId",method = RequestMethod.GET)
    public JsonResultVo findCourseByTeacherId(@RequestParam(value = "teacher_id") String teacher_id,
                                              @RequestParam(value = "page") int page,
                                              @RequestParam(value = "rows") int rows){
        List<Course> courseList = courseService.findCourseByTeacherId(teacher_id);
        PageUtil pageUtil = new PageUtil(page,rows,courseList);
        return JsonResultVo.ok(pageUtil);
    }
}
