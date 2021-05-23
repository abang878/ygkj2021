package com.eagleslab.dao;

import com.eagleslab.entity.UserManager;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserManagerDao {

    public boolean insert(UserManager userManager);

    public List<UserManager> list(UserManager userManager);

    public boolean delete(String uname);

    public boolean update(UserManager userManager);

    public UserManager query(String uname);
}
