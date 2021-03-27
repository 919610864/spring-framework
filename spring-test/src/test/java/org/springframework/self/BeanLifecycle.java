package org.springframework.self;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanLifecycle implements BeanNameAware, InitializingBean, DisposableBean, ApplicationContextAware {

	public BeanLifecycle(){
		System.out.println("1.[bean级别]构造函数执行");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("2.[bean级别],设置bean名称");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("执行destroy方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("执行afterPropertiesSet方法");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("3.[bean级别]设置applicationContext");
	}


	public void sayHello() {
		System.out.println("sayHello");
	}
}
