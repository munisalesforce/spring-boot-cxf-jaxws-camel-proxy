package com.kp.swasthik;

import org.apache.camel.CamelContext;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.camel.component.cxf.DataFormat;
import org.apache.cxf.Bus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CamelConfig {

	@Bean
	public CxfEndpoint mathServicePoxy(Bus bus, CamelContext context) {
		CxfEndpoint ep = new CxfEndpoint();
		ep.setAddress("/mathproxy");
		ep.setBus(bus);
		ep.setCamelContext(context);
		ep.setLoggingFeatureEnabled(true);
		ep.setDataFormat(DataFormat.PAYLOAD);
		ep.setWsdlURL("http://localhost:8080/services/math?wsdl");
		return ep;
	}
	
	@Bean
	public CxfEndpoint backendMathService(Bus bus, CamelContext context) {
		CxfEndpoint ep = new CxfEndpoint();
		ep.setAddress("http://localhost:8080/services/math");
		ep.setBus(bus);
		ep.setCamelContext(context);
		ep.setLoggingFeatureEnabled(true);
		ep.setDataFormat(DataFormat.PAYLOAD);
		ep.setWsdlURL("http://localhost:8080/services/math?wsdl");
		return ep;
	}
}

