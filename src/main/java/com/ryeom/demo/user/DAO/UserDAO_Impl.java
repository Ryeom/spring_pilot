package com.ryeom.demo.user.DAO;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ryeom.demo.user.DTO.Users;

@Repository
public class UserDAO_Impl implements UserDAO{
	
	@Inject
	private SqlSession sql;
	private static final String Namespace = "users";
	
	@Override
	public List<Users> Test() {
		return sql.selectList(Namespace+".test");
	}

}
