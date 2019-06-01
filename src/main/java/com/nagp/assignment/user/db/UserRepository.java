package com.nagp.assignment.user.db;

import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(UserMapper.class)
public interface UserRepository {

    @SqlUpdate("Insert into user values(:id, :firstName, :lastName, :age, :gender, :email, :phoneNumber, :address)")
    void createUser(@BindBean User user);

    @SqlQuery("Select * from user")
    List<User> getAllUsers();
}
