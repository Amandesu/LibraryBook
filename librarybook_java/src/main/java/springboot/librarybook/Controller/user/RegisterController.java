package springboot.librarybook.Controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.librarybook.Controller.user.req.RegisterUserReq;
import springboot.librarybook.entity.user.User;
import springboot.librarybook.service.user.RegisterService;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping(value = "user")
public class RegisterController  {

    @Autowired
    private RegisterService registerService;

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public Map registerUser(HttpServletRequest request){


        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        Map map = registerService.registerUser(userName, password);

        return map;
    }
}