package com.zjj.test;

import com.zjj.bean.User;
import com.zjj.dao.UserDao;
import com.zjj.dao.impl.UserDaoImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoImplTest {
    UserDao userDao = new UserDaoImpl();
    @Test
    public void queryUserByUsername() {
        System.out.println(userDao.queryUserByUsername("admin"));
    }

    @Test
    public void queryUserByUsernameAndPassword() {
        System.out.println(userDao.queryUserByUsernameAndPassword("admin","qwe"));
    }

    @Test
    public void saveUser() {
        User user = userDao.queryUserByUsername("user01");
        System.out.println(user);
        user.setBalance(1024.0);
        System.out.println(userDao.saveUser(user));
    }
}