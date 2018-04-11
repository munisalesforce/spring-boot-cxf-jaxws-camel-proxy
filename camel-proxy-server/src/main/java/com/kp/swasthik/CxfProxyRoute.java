package com.kp.swasthik;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CxfProxyRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("cxf:bean:mathServicePoxy?dataFormat=PAYLOAD").to("log:input").to("log:output");
	}

}
