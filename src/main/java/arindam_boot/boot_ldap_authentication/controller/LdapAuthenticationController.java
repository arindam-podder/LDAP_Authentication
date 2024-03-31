package arindam_boot.boot_ldap_authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LdapAuthenticationController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome to Home Page.";
    }

}


