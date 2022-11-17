package cn.itaxu.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @Description: cn.itaxu.config
 * @author: Axu
 * @date:2022/11/12 22:29
 */
@Configuration
@ComponentScan(value = "cn.itaxu",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = Controller.class
        )
)
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MyBatisConfig.class})
public class SpringConfig {
}
