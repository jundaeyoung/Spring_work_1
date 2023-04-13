package com.example.demo8.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // 1개 이상 빈으로 등록 해야 할 때 
public class WebMVCConfigurers implements WebMvcConfigurer {

	// DI 를 사용하는 코드로 변경해 보자.
	@Autowired // DI 적용
	private LoggingInterceptor loggingInterceptor;

//		public WebMvcConfigurer(LoggingInterceptor loggingInterceptor) {
//			this.loggingInterceptor = loggingInterceptor;
//		}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		WebMvcConfigurer.super.addInterceptors(registry);

		// 우리가 직접 만든 인터셉트 구현 클래스를 등록 처리한다.
		registry.addInterceptor(loggingInterceptor);
	}

}
