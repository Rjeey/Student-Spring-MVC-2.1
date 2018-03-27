package All.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
class SecyrityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureClobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("MyRjeey").password("Dummy").roles("USER", "ADMIN");
        auth.inMemoryAuthentication().withUser("JustUser").password("1234").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/login").permitAll()
                .antMatchers("/").access("hasRole('USER')").and().formLogin();
        http.authorizeRequests().antMatchers("/login").permitAll()
                .antMatchers("/*").access("hasRole('ADMIN')").and().formLogin();
    }
}
