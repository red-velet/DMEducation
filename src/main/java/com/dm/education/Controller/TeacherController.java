package com.dm.education.Controller;

import com.dm.education.Model.Scores;
import com.dm.education.Service.ScoresService;
import com.dm.education.Service.TeacherService;
import com.dm.education.Utils.JsonResultVo;
import com.dm.education.Utils.PageUtil;
import com.dm.education.vo.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/5/17
 * Time: 23:14
 * Description: No Description
 */
@CrossOrigin(origins = "http://localhost:8085")
@RestController
@RequestMapping("teacher")
public class TeacherController {
    @Autowired
    ScoresService scoresService;

    @Autowired
    TeacherService teacherService;

    @RequestMapping(value = "findMyStudentList", method = RequestMethod.GET)
    public JsonResultVo findMyStudentList(@RequestParam(value = "page") int page,
                                          @RequestParam(value = "rows") int rows,
                                          @RequestParam("teacher_id") String teacherId,
                                          @RequestParam("course_id") String courseId) {
        //TODO 查询老师教授该课程的所有学员信息
        List<StudentVO> list = scoresService.findMyStudentList(teacherId, courseId);
        PageUtil pageUtil = new PageUtil(page, rows, list);
        return JsonResultVo.ok(pageUtil);
    }

    @RequestMapping(value = "saveScore", method = RequestMethod.POST)
    public JsonResultVo saveScore(@RequestBody Scores scores) {
        //TODO 老师给学员评分
        try {
            teacherService.saveScore(scores);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonResultVo.error(e.getMessage());
        }
        return JsonResultVo.ok();
    }
}
