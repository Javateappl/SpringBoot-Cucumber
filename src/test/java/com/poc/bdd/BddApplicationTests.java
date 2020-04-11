package com.poc.bdd;

import com.poc.bdd.service.UserInfo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class BddApplicationTests {

	@Autowired
	UserInfo userInfo;

	@Test
	void contextLoads() {
		System.out.print("======================");
		userInfo.toString();
	}

}
