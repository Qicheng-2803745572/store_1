package com.cy.store.service.impl;
import com.cy.store.entity.User;
import com.cy.store.mapper.UserMapper;
import com.cy.store.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/** 处理用户数据的业务层实现类 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void reg(User user) {
// 根据参数user对象获取注册的用户名

// 调用持久层的User findByUsername(String username)方法，根据用户名查询用户数据

// 判断查询结果是否不为null
// 是：表示用户名已被占用，则抛出UsernameDuplicateException异常
// 创建当前时间对象
// 补全数据：加密后的密码
// 补全数据：盐值
// 补全数据：isDelete(0)
// 补全数据：4项日志属性
// 表示用户名没有被占用，则允许注册
// 调用持久层Integer insert(User user)方法，执行注册并获取返回值(受影响的行数)
// 判断受影响的行数是否不为1
// 是：插入数据时出现某种错误，则抛出InsertException异常
    }

}