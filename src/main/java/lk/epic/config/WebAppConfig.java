package lk.epic.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.epic")
@EnableWebMvc
@EnableTransactionManagement // for data jpa @Transactional eka service walata udin dapan
public class WebAppConfig {
    /*@Bean
    public ModelMappler sfdjdsf(){
        return new ModelMappler()
    }*/

}
