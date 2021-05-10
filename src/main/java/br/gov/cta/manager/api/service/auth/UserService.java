package br.gov.cta.manager.api.service.auth;

import br.gov.cta.manager.api.model.auth.User;
import br.gov.cta.manager.api.model.auth.UserDetailsCustom;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = new User("manager", "$2y$12$08gy9.kGkBhZ.ckWIi7vY.r7d7Gwl.caDJssOCEPIxkRsVmzDfaES", "manager@cta.gov.br", null);

        //TODO BUSCAR USUARIO NA BASE

        return Optional.ofNullable(user).map(UserDetailsCustom::new).get();
    }
}
