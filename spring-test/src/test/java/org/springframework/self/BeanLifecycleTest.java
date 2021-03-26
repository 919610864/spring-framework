package org.springframework.self;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * test bean lifecycle
 * result success
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring-chapter2-beanlifecycle.xml")
public class BeanLifecycleTest {

	@Autowired
	private BeanLifecycle beanLifecycle;

	@Test
	public void test(){
		beanLifecycle.sayHello();
	}
}
