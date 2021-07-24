package com.jjz.dao;

import com.jjz.pojo.MyUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 接口，实现功能化对接（数据链路层）
 */
@Repository
@Mapper
public interface MyUserDao {
    public List<MyUser> selectUserByUname(MyUser myUser);
}

