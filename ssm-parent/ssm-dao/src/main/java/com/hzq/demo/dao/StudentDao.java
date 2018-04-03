package com.hzq.demo.dao;

import com.hzq.demo.model.Student;
import org.springframework.stereotype.Repository;

/**
 * Created by zhengxgs on 2018/1/10.
 */
@Repository
public interface StudentDao {

    Integer addStudent(Student student);

    Integer delete(Integer id);

    Integer updateStudentById(Student student);

    Student selectStudentById(Student student);

}