package com.jjz.service;

import com.jjz.pojo.MyUser;

import java.util.List;

public interface MyUserService {
    public List<MyUser> findUserByName(MyUser myUser);
}
