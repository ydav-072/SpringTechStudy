package com.springApp.studyProj.AOP.afterReturningAdvice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.springApp.studyProj.AOP.afterReturningAdvice")
@EnableAspectJAutoProxy
public class MyConfig {
}
