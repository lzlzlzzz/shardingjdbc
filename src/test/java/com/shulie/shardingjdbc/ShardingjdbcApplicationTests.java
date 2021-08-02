package com.shulie.shardingjdbc;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shulie.shardingjdbc.entity.Course;
import com.shulie.shardingjdbc.entity.User;
import com.shulie.shardingjdbc.mapper.CourseMapper;
import com.shulie.shardingjdbc.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class ShardingjdbcApplicationTests {

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void addCourse() {
        for (int i = 1; i <= 10; i++) {
            Course course = new Course();
            course.setUserId(1l);
            course.setCname("java" + i);
            course.setCstatus("ok" + i);
            courseMapper.insert(course);
        }
    }

    @Test
    public void selectCourse() {
        QueryWrapper<Course> wrapper = new QueryWrapper<>();
        wrapper.eq("cid",608019998878728193l);
        Course course = courseMapper.selectOne(wrapper);
        System.out.println(course);
    }

    @Test
    public void addEduDbCourse() {
        for (int i = 1; i <= 10; i++) {
            Course course = new Course();
            course.setUserId(2l);
            course.setCname("java" + i);
            course.setCstatus("ok" + i);
            courseMapper.insert(course);
        }
    }

    @Test
    public void addUser(){
        User user = new User();
        user.setUserName("testUser");
        user.setUserStatus("1");
        userMapper.insert(user);
    }
}
