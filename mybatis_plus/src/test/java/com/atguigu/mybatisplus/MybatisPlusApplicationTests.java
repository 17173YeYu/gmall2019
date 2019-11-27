package com.atguigu.mybatisplus;

import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void selectUserList() {
		System.out.println("-----------打印用户列表--------------");
		List<User> userList = userMapper.selectList(null);


		for (User user : userList) {
			System.out.println(user);

		}
	}

}
