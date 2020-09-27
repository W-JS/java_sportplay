package com.springboot.sportplay.dao;

import com.springboot.sportplay.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public User getUserByMessage(@Param("username") String username, @Param("password") String password);
    public List<User> getAllUser(@Param("username") String username, @Param("pageStart") int pageStart, @Param("pageSize") int pageSize);
    public int getUserCounts(@Param("username") String username);
    public int updateState(Integer id, Boolean state);
    public int addUser(User user);
    public int deleteUser(int id);
    public User getUpdateUser(int id);
    public int editUser(User user);

    //My-Start
    public User getUserByUsername(@Param("username") String username);
    //My-End
}
