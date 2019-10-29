package cn.bdqn.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public User login(String userCode, String password) {
        User user=userMapper.findUser(userCode);
        if(user!=null){
            if(user.getUserPassword().equals(password)){
                return  user;
            }
        }
        return null;
    }


}
