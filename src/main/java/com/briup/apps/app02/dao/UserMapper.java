package com.briup.apps.app02.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.briup.apps.app02.bean.User;


public interface UserMapper {
	/**
	 * 查询所有
	 * */
	@Select("select * from user_table")
	List<User> findAll() throws Exception;

	/**
	 * 通过id查询
	 * */
	@Select("select * from user_table where id = #{id}")
	User findById(long id) throws Exception;

	/**
	 * 保存
	 * */
	@Insert("insert into user_table values(null,#{name},#{gender},#{birth})")
	void save(User user);
}
