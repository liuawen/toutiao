package cn.liuawen.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2018-06-11
 */
@Aspect
@Component
public class LogAspect {
    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);
    //执行之前 之后 调用这些方法
    //定义一些切面 专门来搞  * 什么的  面向所有服务 或者单个服务
    @Before("execution(* cn.liuawen.controller.*Controller.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        //JoinPoint 切点
        StringBuilder sb = new StringBuilder();
        for (Object arg : joinPoint.getArgs()) {
            sb.append("arg:" + arg.toString() + "|");
        }
        //可以搞时间什么的  优化呀 记录时间
        //每一次调用用了多少时间    调用参数是什么
//        logger.info("before time: " + new Date());
        logger.info("before method: " + sb.toString());
    }

    @After("execution(* cn.liuawen.controller.IndexController.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        logger.info("after method: ");
    }
}
