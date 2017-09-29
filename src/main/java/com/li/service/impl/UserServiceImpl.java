package com.li.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.li.dao.IUserDao;
import com.li.model.UserEntity;
import com.li.service.UserService;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService{
	  @Resource
	    private IUserDao userDao;
	@Override
	public boolean isExist(UserEntity user) {
		// TODO Auto-generated method stub
		  return userDao.isExist(user);
	}

}
