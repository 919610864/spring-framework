package org.springframework.self;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 容器级别生命周期测试
 */
public class ContainerLifecycleTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext(
						"classpath:spring-chapter2-beanlifecycle.xml",
				"classpath:spring-chapter2-containerlifecycle.xml");
		BeanLifecycle beanLifecycle = context.getBean("beanLifecycle",BeanLifecycle.class);
		beanLifecycle.sayHello();

	}
}
