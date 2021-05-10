package br.gov.cta.manager.api.model.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

@Data
@AllArgsConstructor
public class User {
    private String username;
    private String password;
    private String email;
    private List<GrantedAuthority> roles;

    public User() {}

    public User(User user) {
        this.username = user.username;
        this.password = user.password;
        this.email = user.email;
        this.roles = user.roles;
    }
}
