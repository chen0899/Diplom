package com.build.config.oauth2;

import com.build.persistence.model.enums.Role;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

import static com.build.config.oauth2.AuthorizationServerConfiguration.RESOURCE_ID;


@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    /**
     * {@inheritDoc}
     */
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.resourceId(RESOURCE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().headers().cacheControl().disable().and()
                .authorizeRequests()
                .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                .antMatchers("/**").permitAll()
                .antMatchers("/auth/**").authenticated()
                .antMatchers("/css/**").permitAll()
                .antMatchers("/js/**").permitAll()
                .antMatchers("/img/**").permitAll()
                .antMatchers("/oauth/token").permitAll()
                .antMatchers("/user").permitAll()
                .antMatchers("/add").permitAll()
                .antMatchers(HttpMethod.POST).hasRole(Role.ADMIN.toString())
                .antMatchers("/user/save").permitAll()
                .anyRequest().permitAll();
    }
}
