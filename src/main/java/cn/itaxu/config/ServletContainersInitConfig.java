package cn.itaxu.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @Description: cn.itaxu.config
 * @author: Axu
 * @date:2022/11/11 21:31
 */
// 4.定义一个servlet容器启动的配置,在里面加载spring的配置
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    // 加载spring配置
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }
    // 加载springMVC配置
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }
    // 设置哪些请求归属springMVC处理
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    // Post请求乱码处理
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter("UTF-8");
        return new Filter[]{filter};
    }
}
