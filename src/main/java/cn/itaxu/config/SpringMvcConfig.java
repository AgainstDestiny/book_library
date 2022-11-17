package cn.itaxu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Description: cn.itaxu.config
 * @author: Axu
 * @date:2022/11/11 21:28
 */
// 3.创建springmvc的配置文件,加载controller对应的bean
@Configuration
@ComponentScan({"cn.itaxu.controller","cn.itaxu.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
