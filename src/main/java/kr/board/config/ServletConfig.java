package kr.board.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// servelt-context.xml 대체
// resources 맵핑, 어노테이션 driven, prefix, suffix, component-scan 처리

@Configuration //환경설정 파일이라는 의미 생략가능
@EnableWebMvc  //어노테이션 사용가능하게
@ComponentScan(basePackages= {"kr.board.controller"}) // 컴포넌트 스캔
public class ServletConfig implements WebMvcConfigurer{

	@Override  //뷰리졸버 처리
	public void configureViewResolvers(ViewResolverRegistry registry) { 
		InternalResourceViewResolver bean=new InternalResourceViewResolver();
		bean.setPrefix("/WEB-INF/views/");
		bean.setSuffix(".jsp");
		registry.viewResolver(bean);
	}
	
	@Override //리소스 매핑
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
}
