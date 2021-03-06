package org.luvx.others.transcation;

import lombok.extern.slf4j.Slf4j;
import org.luvx.entity.User;
import org.luvx.mapper.InsertMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: Ren, Xie
 * @desc: 声明式事务: 验证事务失效的场景
 */
@Slf4j
@Service
public class TransactionalCheckImpl implements TransactionalCheck {
    @Autowired
    private InsertMapper userMapper;
    @Autowired
    TransactionalCheck service;

    @Override
    public void method0() {
        // 注解失效
        exec();
        // 注解失效
        method1();
        // 有效
        service.method1();
    }

    public void method2() {
        // 注解失效
        exec();
        // 注解失效
        method1();
        // 有效
        service.method1();
    }

    /**
     * 注解加在接口方法上
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void method1() {
        User user = User.builder()
                .userName("foo")
                .password("bar")
                .age(100)
                .build();
        log.info("插入前: {}", user);
        userMapper.insert(user);
        log.info("插入后: {}", user);
        throw new RuntimeException("测试用异常");
    }

    /**
     * 注解加在普通方法上
     */
    @Transactional(rollbackFor = Exception.class)
    public void exec() {
        User user = User.builder()
                .userName("foo")
                .password("bar")
                .age(100)
                .build();
        log.info("插入前: {}", user);
        userMapper.insert(user);
        log.info("插入后: {}", user);
        throw new RuntimeException("测试用异常");
    }
}
