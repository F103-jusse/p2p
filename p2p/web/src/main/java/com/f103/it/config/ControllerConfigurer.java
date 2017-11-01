package com.f103.it.config;

import com.f103.it.interceptor.SessionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Project : p2p
 * @Package Name : com.f103.it.config
 * @Description : TODO
 * @Author : 哀建宇
 * @Create Date : 2017年10月27日 10:11
 * @ModificationHistory Who When   What
 */
@Configuration
public class ControllerConfigurer extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
