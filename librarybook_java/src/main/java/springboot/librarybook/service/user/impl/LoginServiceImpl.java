package springboot.librarybook.service.user.impl;

import org.springframework.stereotype.Service;
import springboot.librarybook.dao.user.UserMapper;
import springboot.librarybook.entity.user.User;
import springboot.librarybook.entity.user.UserCriteria;
import springboot.librarybook.service.user.LoginService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User selectUserByUserName(String userName) {

        UserCriteria example = new UserCriteria();
        example.createCriteria().andUsernameEqualTo(userName);



        List<User> users = userMapper.selectByExample(example);

        //example.createCriteria().andUsernameEqualTo(userName);
        //List<User> users = userMapper.selectByExample(example);

        return users.get(0);
    }
}
