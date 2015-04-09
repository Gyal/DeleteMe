package fr.iut.montreuil.lpcsid;/*
 * Created by Mélina on 07/03/2015.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class DeleteMeApplication extends SpringBootServletInitializer {

    public static void main(final String[] args) throws Exception {
        SpringApplication.run(DeleteMeApplication.class, args);
    }

    // Initialisation
    @Override
    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application){
        return application.sources(DeleteMeApplication.class);
    }
}
