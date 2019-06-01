package com.nagp.assignment.user.db;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements ResultSetMapper<User> {
    @Override
    public User map(final int index, final ResultSet r, final StatementContext ctx) throws SQLException {
        return new User(r.getInt("id"),
                r.getString("firstname"),
                r.getString("lastname"),
                r.getInt("age"),
                r.getString("gender"),
                r.getString("email"),
                r.getString("phonenumber"),
                r.getString("address"));
    }
}
