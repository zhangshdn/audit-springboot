package cn.chinaunicom.audit_springboot.config;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class HttpMessageConvertConfig extends WebMvcConfigurationSupport {
	
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
	
		StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter(StandardCharsets.UTF_8);
		converters.add(stringHttpMessageConverter);
		
	}

}
