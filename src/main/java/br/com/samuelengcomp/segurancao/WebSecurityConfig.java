package br.com.samuelengcomp.segurancao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig{
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		//httpSecurity.authorizeHttpRequests((requests)-> requests
				//.requestMatchers("/exodia").permitAll()
				//.requestMatchers("/exodia/reforma/categoria").permitAll()//.hasRole("ADMIN")
			//	)
	//	.httpBasic(Customizer.withDefaults());
		return httpSecurity.build();//"/css/**", "/js/**"
	}

	
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().requestMatchers("/static/**").requestMatchers("/img/**").requestMatchers("/css/**").requestMatchers("/js/**")
				.requestMatchers("/scss/**").requestMatchers("/vendor/**");
	}
	
}
