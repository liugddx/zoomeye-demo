package com.liugdxd.zoomeye.configuration;

import com.liugdxd.zoomeye.es.repository.ZoomeyeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;

/**
 * <p>@ClassName DeleteIndexListener</p>
 * <p>@description 清理</p>
 *
 * @author liugd
 * @version 1.0
 * @date 2019/8/14 9:23
 */
@Slf4j
public class DeleteIndexListener implements ApplicationListener<ContextRefreshedEvent> {

    private Environment env;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext applicationContext = event.getApplicationContext();
        Environment environment = applicationContext.getEnvironment();
        String deleteFlag = environment.getProperty("deleteFlag");

        if("true".equals(deleteFlag)){

            ZoomeyeRepository zoomeyeRepository = applicationContext.getBean("zoomeyeRepository", ZoomeyeRepository.class);
            zoomeyeRepository.deleteAll();
            log.info("索引数据删除成功");
        }

    }

}
