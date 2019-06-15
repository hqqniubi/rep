package com.itheima.ssm.service;

import com.itheima.ssm.domain.Role;
import com.itheima.ssm.domain.UserInfo;

import java.util.List;

public interface IUserService {
    /**
     * 查询所有用户
     *
     * @return
     * @throws Exception
     */
    List<UserInfo> findAll() throws Exception;

    /**
     * 添加用户
     *
     * @param userInfo
     * @throws Exception
     */
    void save(UserInfo userInfo) throws Exception;

    /**
     * 根据用户id查询
     *
     * @param id
     * @return
     * @throws Exception
     */
    UserInfo findById(String id) throws Exception;

    /**
     * 根据用户id查找可以添加的角色
     *
     * @param userId
     * @return
     * @throws Exception
     */
    List<Role> findOtherRoles(String userId) throws Exception;

    /**
     * 给用户添加角色
     *
     * @param userId
     * @param roleIds
     */
    void addRoleToUser(String userId, String[] roleIds);
}
