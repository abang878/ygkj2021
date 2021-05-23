package com.eagleslab.service.impl;

import com.eagleslab.dao.UserManagerDao;
import com.eagleslab.entity.UserManager;
import com.eagleslab.service.UserManagerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserManagerServiceImpl implements UserManagerService {

    @Resource
    private UserManagerDao userManagerDao;

    @Override
    public boolean insert(UserManager userManager) {
        return userManagerDao.insert(userManager);
    }

    @Override
    public List<UserManager> list(UserManager userManager) {
        return userManagerDao.list(userManager);
    }

    @Override
    public boolean delete(String uname) {
        return userManagerDao.delete(uname);
    }

    @Override
    public boolean update(UserManager userManager) {
        return userManagerDao.update(userManager);
    }

    @Override
    public UserManager query(String uname) {
        return userManagerDao.query(uname);
    }
}
