package org.springframework.self;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

public class ContainerLifecycle extends InstantiationAwareBeanPostProcessorAdapter {


	public ContainerLifecycle(){
		System.out.println("1.[容器级别] ContainerLifecycle构造器执行了");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("3.[容器级别]postProcessBeforeInitialization方法执行");
		return super.postProcessBeforeInitialization(bean, beanName);

	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("4.[容器级别]postProcessAfterInitialization");
		return super.postProcessAfterInitialization(bean, beanName);
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("2.[容器级别]postProcessAfterInstantiation");
		return super.postProcessAfterInstantiation(bean, beanName);
	}
}
