package br.gov.cta.manager.api.service.auth;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService {

    public UserDetails loadUserByUsername(String username){
        return User.withDefaultPasswordEncoder()
                .username("manager")
                .password("")
                .roles("USER")
                .build();
    }
}
