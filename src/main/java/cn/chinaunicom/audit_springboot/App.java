package cn.chinaunicom.audit_springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class App {
	
	@RequestMapping("/index")
	public String index(){
		return "Hello SpringBoot";
	}
	
	// run spring-boot:run // 利用Springboot的插件运行maven
	public static void main(String[] args) {
		
		new SpringApplicationBuilder(App.class).bannerMode(Banner.Mode.OFF).run(args);
		
//		SpringApplication.run(App.class, args);
	}
}
