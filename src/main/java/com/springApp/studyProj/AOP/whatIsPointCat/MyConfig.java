package com.springApp.studyProj.AOP.whatIsPointCat;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.springApp.studyProj.AOP.whatIsPointCat")
@EnableAspectJAutoProxy
public class MyConfig {
}
