package com.sat.war.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.example.demo.Spring5ActuatorC16Application;

//很奇怪这个类竟然不需要任何注解，打包后放到tomcat中也能正常运行
//创建项目的时候选择打包方式为jar,但是最后打包时需要打包为war需要添加的内容
public class TestServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		//设置主配置类，这个类同时作为（可执行JAR的）引导类和Spring配置类。
		return builder.sources(Spring5ActuatorC16Application.class);
	}
	
}
