package org.springframework.beans.factory.support.security.support;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycle implements BeanNameAware, InitializingBean, DisposableBean {
	@Override
	public void setBeanName(String name) {

	}

	@Override
	public void destroy() throws Exception {

	}

	@Override
	public void afterPropertiesSet() throws Exception {

	}
}
