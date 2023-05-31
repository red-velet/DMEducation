package com.dm.education.Controller;

import com.dm.education.Service.StudentService;
import com.dm.education.Utils.JsonResultVo;
import com.dm.education.Utils.PageUtil;
import com.dm.education.dto.EnrollCourseDTO;
import com.dm.education.vo.CourseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8085")
@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "findAllCourse", method = RequestMethod.GET)
    public JsonResultVo findAllCourse(@RequestParam(value = "page") int page,
                                      @RequestParam(value = "rows") int rows,
                                      @RequestParam(value = "id") String student_id) {

        List<CourseVO> courseList = studentService.findAllCourse(student_id);

        PageUtil pageUtil = new PageUtil(page, rows, courseList);
        return JsonResultVo.ok(pageUtil);
    }

    @RequestMapping(value = "enrollCourse", method = RequestMethod.POST)
    public JsonResultVo enrollCourse(@RequestBody EnrollCourseDTO enrollCourseDTO) {
        System.out.println(enrollCourseDTO);
        try {
            studentService.enrollCourse(enrollCourseDTO);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonResultVo.error(e.getMessage());
        }
        return JsonResultVo.ok();
    }

    @RequestMapping(value = "unrollCourse", method = RequestMethod.POST)
    public JsonResultVo unrollCourse(@RequestBody EnrollCourseDTO enrollCourseDTO) {
        try {
            studentService.unrollCourse(enrollCourseDTO);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonResultVo.error(e.getMessage());
        }
        return JsonResultVo.ok();
    }
}
