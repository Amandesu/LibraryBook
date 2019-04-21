package springboot.librarybook.service.user;

import springboot.librarybook.entity.user.User;

public interface LoginService {

    User selectUserByUserName(String userName);
}
