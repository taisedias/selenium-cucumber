package demo.activeadmin.info.resources.support.domain;

import lombok.Getter;

@Getter
public class User {
    private String username;
    private String email;
    private String password;
    private String confirmPassword;
}
