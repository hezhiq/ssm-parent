package com.hzq.demo.service.impl;

import com.hzq.demo.dao.StudentDao;
import com.hzq.demo.model.Student;
import com.hzq.demo.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhengxgs on 2018/1/10.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    public Boolean addStudent(Student student) {
        return studentDao.addStudent(student) == 1;
    }

    public Boolean deleteStudentById(Integer id) {
        return studentDao.delete(id) == 1;
    }

    public Boolean updateStudentById(Student student) {
        return studentDao.updateStudentById(student) == 1;
    }

    public Student findAllStudent(Student student) {
        return studentDao.selectStudentById(student);
    }
}