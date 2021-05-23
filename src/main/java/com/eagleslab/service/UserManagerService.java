package com.eagleslab.service;

import com.eagleslab.entity.UserManager;

import java.util.List;

public interface UserManagerService {
    public boolean insert(UserManager userManager);

    public List<UserManager> list(UserManager userManager);

    public boolean delete(String uname);

    public boolean update(UserManager userManager);

    public UserManager query(String uname);

}
