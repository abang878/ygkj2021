package com.eagleslab.dao.impl;

import com.eagleslab.dao.UserManagerDao;
import com.eagleslab.entity.UserManager;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository//("userManagerDao")
public class UserManagerDaoImpl implements UserManagerDao {
    @Resource
    SqlSession sqlSession;

    @Override
    public boolean insert(UserManager userManager) {
        sqlSession.insert("insertUserManager", userManager);
        return false;
    }

    @Override
    public List<UserManager> list(UserManager userManager) {
        return sqlSession.selectList("list", userManager);
    }

    @Override
    public boolean delete(String uname) {
        sqlSession.delete("delete", uname);
        return false;
    }

    @Override
    public boolean update(UserManager userManager) {
        sqlSession.update("update", userManager);
        return false;
    }

    @Override
    public UserManager query(String uname) {
        return sqlSession.selectOne("query", uname);
    }

}
