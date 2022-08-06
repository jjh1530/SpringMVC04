package kr.board.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig  extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override  //root-context 를 연결 RootConfig
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class, SecurityConfig.class};
	}
	@Override //DispacherServlet 연결용 ServletConfig
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ServletConfig.class};
	}
	@Override  // Mapping용    /
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		encodingFilter.setForceEncoding(true);
		return new Filter[]{encodingFilter};
	}
	
	

}
