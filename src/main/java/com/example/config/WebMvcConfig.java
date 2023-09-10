package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Spring MVCの特定の設定を行う。
 * @EnableWebMvcをつけてSpring MVCの機能を有効にしている。
 * @ComponentScanをつけてコントローラー等をスキャンする。
 * 
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.example.app")
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp();
    }

}
