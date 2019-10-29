package cn.bdqn.service;

import cn.bdqn.pojo.SmbmsUser;

public interface UserService {
    public SmbmsUser login(String userCode, String password);
}
