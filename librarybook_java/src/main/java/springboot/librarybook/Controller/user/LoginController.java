package springboot.librarybook.Controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springboot.librarybook.entity.user.User;
import springboot.librarybook.service.user.LoginService;

@RestController
@RequestMapping(value = "user")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public User index(String userName){

        User leiwuyi = loginService.selectUserByUserName("leiwuyi");

        return leiwuyi;
    }
}
