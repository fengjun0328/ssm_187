package cn.bdqn.service;

import cn.bdqn.dao.SmbmsUserMapper;
import cn.bdqn.pojo.SmbmsUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.registry.infomodel.User;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private SmbmsUserMapper userMapper;
    @Override
    public SmbmsUser login(String userCode, String password) {
       return  null;
    }


}
