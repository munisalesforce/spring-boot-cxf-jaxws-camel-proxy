package com.kp.swasthik;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kp.swasthik.jaxws.KPMath;

@Configuration
public class CxfConfig {

	@Bean
	public Server jaxwsServer(KPMath math, Bus bus) {
		JaxWsServerFactoryBean bean = new JaxWsServerFactoryBean();
		bean.setAddress("/math");
		bean.setBus(bus);
		bean.setServiceBean(math);
		return bean.create();
	}
}
