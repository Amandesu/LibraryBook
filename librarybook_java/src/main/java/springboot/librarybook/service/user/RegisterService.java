package springboot.librarybook.service.user;

import springboot.librarybook.entity.user.User;

import java.util.Date;
import java.util.Map;

public interface RegisterService {
    Map registerUser(String name, String password);
}
