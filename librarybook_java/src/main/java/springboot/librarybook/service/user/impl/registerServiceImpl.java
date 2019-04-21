package springboot.librarybook.service.user.impl;


import org.springframework.stereotype.Service;
import springboot.librarybook.dao.user.UserMapper;
import springboot.librarybook.entity.user.User;
import  springboot.librarybook.entity.user.UserCriteria;
import springboot.librarybook.service.user.RegisterService;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class registerServiceImpl implements RegisterService {
    @Resource
    private UserMapper userMapper;

   @Override
    public Map registerUser(String name, String password){
       // 查询是否已注册
        UserCriteria example = new UserCriteria();
        example.createCriteria().andUsernameEqualTo(name);
        List<User> users = userMapper.selectByExample(example);
        HashMap map = new HashMap();

        if (users.size() > 0) {
            map.put("code", "500");
            map.put("msg", "该账号已注册");
        } else {
            User user = new User();
            user.setUsername(name);
            user.setPassword(password);
            user.setCreateDate(new Date());
            int rows = userMapper.insert(user);
            if (rows > 0){
                map.put("code", "200");
                map.put("msg", "注册成功");
            } else {
                map.put("code", "500");
            }
        }
        return map;
    }
}


