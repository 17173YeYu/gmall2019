package com.atguigu.mybatisplus;

import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.mapper.UserMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CRUDTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert(){

        try {
            User user = new User();
            user.setName("jack888");
            user.setAge(99);
            user.setEmail("3213211221@qq.com");
            int res = userMapper.insert(user);
            System.out.println("返回插入结果====res:"+res);
        } catch (Exception e) {
            System.out.println("数据库插入数据异常："+e.getMessage());
            //e.printStackTrace();
        }
    }


    @Test
    public void updateById(){



        //User user = new User();
        User user = userMapper.selectById("1199342564772208642");
        //user.setId("1199342564772208642");
        user.setAge(999);
        int i = userMapper.updateById(user);
        System.out.println(i);


    }


    @Test
    public void selectBatchByIds(){
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));
        users.forEach(System.out::println);

    }


    @Test
    public void selectByMap(){
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("name","jack");

        List<User> userList = userMapper.selectByMap(map);
        for (User user : userList) {
            System.out.println(user);
        }
    }


    @Test
    public void selectByPage(){
        Page<User> page = new Page<User>(3,5);

        IPage<User> userIPage = userMapper.selectPage(page,null);
        long current = userIPage.getCurrent();
        long pages = userIPage.getPages();
        List<User> records = userIPage.getRecords();
        long size = userIPage.getSize();
        long total = userIPage.getTotal();

        System.out.println("current===========:"+current);
        System.out.println("pages===========:"+pages);
        System.out.println("size===========:"+size);
        System.out.println("total===========:"+total);

        for (User record : records) {
            System.out.println(record);
        }
    }


}
