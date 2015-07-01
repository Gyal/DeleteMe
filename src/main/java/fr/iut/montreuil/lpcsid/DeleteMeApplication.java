package fr.iut.montreuil.lpcsid;/*
 * Created by Mélina on 07/03/2015.
 */

import fr.iut.montreuil.lpcsid.controller.HttpUrlConnexionController;
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
        HttpUrlConnexionController http = new HttpUrlConnexionController();

        System.out.println("Testing 1 - Send Http GET request");
        http.sendGet();


        // System.out.println("\nTesting 2 - Send Http POST request");
        //http.sendPost();

    }


    // Initialisation
    @Override
    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application){
        return application.sources(DeleteMeApplication.class);
    }
}
