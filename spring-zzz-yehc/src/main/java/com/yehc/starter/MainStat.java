package com.yehc.starter;

import com.yehc.beans.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : yehc
 * @date 2022/3/9
 */
@Configuration
@ComponentScan("com.yehc.beans")
public class MainStat {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MainStat.class);
		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
		bean.sayHi();

	}
}
