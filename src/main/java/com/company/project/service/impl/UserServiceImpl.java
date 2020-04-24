package main.java.com.company.project.service.impl;

import main.java.com.company.project.dao.UserMapper;
import main.java.com.company.project.pojo.User;
import main.java.com.company.project.service.UserService;
import main.java.com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/24.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
