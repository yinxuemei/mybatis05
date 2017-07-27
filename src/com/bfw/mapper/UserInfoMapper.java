package com.bfw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bfw.domain.UserInfo;

public interface UserInfoMapper {

	/**
	 * 根据姓名查询用户信息
	 * @param username 姓名
	 * @return
	 */
	public List<UserInfo> getAlluser(@Param("username")String username);
	
	/**
	 * 根据姓名查询用户信息
	 * @param user 查询条件
	 * @return
	 */
	public List<UserInfo> getAlluser1(UserInfo user);
	
	
	
	/**
	 * 根据姓名查询用户信息
	 * @param user 查询条件
	 * @return
	 */
	public List<UserInfo> getAlluser2(UserInfo user);
	
	/**
	 * 根据姓名查询用户信息
	 * @param user 查询条件
	 * @return
	 */
	public List<UserInfo> getAlluser3(UserInfo user);
	
	/**
	 * 根据姓名查询用户信息
	 * @param user 查询条件
	 * @return
	 */
	public List<UserInfo> getAlluser4(UserInfo user);
	
	/**
	 * 修改用户信息
	 * @param user 用户信息
	 * @return
	 */
	public int updateUser(UserInfo user);
}
