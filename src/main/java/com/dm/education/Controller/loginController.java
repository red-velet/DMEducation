package com.dm.education.Controller;

import com.dm.education.Model.Student;
import com.dm.education.Model.Teacher;
import com.dm.education.Service.StudentService;
import com.dm.education.Service.TeacherService;
import com.dm.education.Utils.JsonResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("Login")
public class loginController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "student", method = RequestMethod.GET)
    public JsonResultVo studentLogin(@RequestParam(value = "id") String id,
                                     @RequestParam(value = "pwd") String pwd,
                                     @RequestParam(value = "type") int type,
                                     HttpServletRequest request) {
        String msg = "";
        JsonResultVo jsonResultVo = verify(id, pwd, type, msg);
        if (jsonResultVo != null) {
            return jsonResultVo;
        }
        if (type != 1) {
            msg = "请求类型错误！";
            return JsonResultVo.error(msg);
        }
        List<Student> studentList = studentService.login(id, pwd);
        if (studentList.size() == 0) {
            msg = "学生账号或密码错误，请重新尝试！";
            return JsonResultVo.error(msg);
        }
        if (studentList.size() != 1) {
            msg = "学生账号异常，请联系管理员！";
            return JsonResultVo.error(msg);
        }
        Student studnets = studentList.get(0);
        return JsonResultVo.ok(studnets);
    }

    @RequestMapping(value = "teacher", method = RequestMethod.GET)
    public JsonResultVo teachertLogin(@RequestParam(value = "id") String id,
                                      @RequestParam(value = "pwd") String pwd,
                                      @RequestParam(value = "type") int type,
                                      HttpServletRequest request) {
        String msg = "";
        JsonResultVo jsonResultVo = verify(id, pwd, type, msg);
        if (jsonResultVo != null) {
            return jsonResultVo;
        }
        if (type != 2) {
            msg = "请求类型错误！";
            return JsonResultVo.error(msg);
        }
        List<Teacher> teacherList = teacherService.login(id, pwd);
        if (teacherList.size() == 0) {
            msg = "教师账号或密码错误，请重新尝试！";
            return JsonResultVo.error(msg);
        }
        if (teacherList.size() != 1) {
            msg = "教师账号异常，请联系管理员！";
            return JsonResultVo.error(msg);
        }
        Teacher teacher = teacherList.get(0);
        return JsonResultVo.ok(teacher);
    }

    public JsonResultVo verify(String id, String pwd, int type, String msg) {
        if (id == null || id.equals("")) {
            msg = "请输入账号！";
            return JsonResultVo.error(msg);
        }
        if (pwd == null || pwd.equals("")) {
            msg = "请输入密码！";
            return JsonResultVo.error(msg);
        }
        return null;
    }
}
