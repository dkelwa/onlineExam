package com.exam.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.exam.dao.UserDAO;
import com.exam.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
	this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public User login(User user) {
	String query = "select * from users where email = ? and passwd = ?";
	return jdbcTemplate.queryForObject(query,
		new Object[] { user.getEmail(), user.getPassword() },
		new RowMapper<User>() {
		    @Override
		    public User mapRow(ResultSet resultSet, int rowNum)
			    throws SQLException {
			User temp = new User();
			temp.setEmail(resultSet.getString("email"));
			temp.setPassword(resultSet.getString("passwd"));
			temp.setUserId(resultSet.getInt("userid"));
			return temp;
		    }
		});
    }
}
