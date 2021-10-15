package com.zjj.dao.impl;

import com.zjj.bean.User;
import com.zjj.dao.BaseDao;
import com.zjj.dao.UserDao;

public class UserDaoImpl extends BaseDao implements UserDao {
    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 如果返回null, 说明没有这个用户。反之亦然
     */
    @Override
    public User queryUserByUsername(String username) {
        String sql = "select * from t_user where username = ?";
        return queryForOne(User.class, sql, username);
    }

    /**
     * 根据 用户名和密码查询用户信息
     *
     * @param username
     * @param password
     * @return 如果返回null, 说明用户名或密码错误, 反之亦然
     */
    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql = "select * from t_user where username = ? and `password` = ?";
        return queryForOne(User.class, sql, username, password);
    }

    /**
     * 保存用户信息
     *
     * @param user
     * @return 返回-1表示操作失败，其他是sql语句影响的行数
     */
    @Override
    public int saveUser(User user) {
        String sql = "update t_user set `password` = ?, balance = ?  where id = ?";
        return update(sql, user.getPassword(), user.getBalance(), user.getId());
    }
}
