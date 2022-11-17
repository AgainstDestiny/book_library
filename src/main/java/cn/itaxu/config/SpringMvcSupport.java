package cn.itaxu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Description: cn.itaxu.config
 * @author: Axu
 * @date:2022/11/13 9:28
 */
@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 当访问/pages/???的时候,走/pages目录下的内容
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
        // 当访问/js/???的时候,走/js目录下的内容
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
        // 当访问/css/???的时候,走/css目录下的内容
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        // 当访问/plugins/???的时候,走/plugins目录下的内容
        registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
    }
}
