package com.ryeom.demo.user.Service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ryeom.demo.user.DAO.UserDAO;
import com.ryeom.demo.user.DTO.Users;

@Service
public class UserService_Impl implements UserService {

	@Inject
	private UserDAO userDao;
	
	@Override
	public List<Users> Test() {
		
		return userDao.Test();
	}

}
