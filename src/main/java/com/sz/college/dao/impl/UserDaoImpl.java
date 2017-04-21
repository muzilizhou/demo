package com.sz.college.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sz.college.dao.UserDao;
import com.sz.college.model.User;
/**
 * 用户实现类
 * @author zhouxiaohu
 *
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	@Resource
	JdbcTemplate jdbcTemplateHIP;
	@Override
	public int userRegister(final User user) {
		String sql="insert into t_user values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		return jdbcTemplateHIP.update(sql,  
                new PreparedStatementSetter() {  
                    public void setValues(PreparedStatement ps) throws SQLException {  
                    	ps.setString(1, user.getNumber());
                    	ps.setString(2, user.getName());
                    	ps.setString(3, user.getUserName());
                    	ps.setString(4, user.getPassword());
                    	ps.setInt(5, user.getSex());
                    	ps.setString(6, user.getCard());
                    	ps.setString(7, user.getEmail());
                    	ps.setString(8,user.getPhone());
                    	ps.setString(9, user.getExplan());
                    	ps.setInt(10, user.getUserType());
                    	ps.setInt(11, user.getStatus());
                    	ps.setString(12, user.getUnitNumber());
                    	ps.setString(13, user.getUnitName());
                    	ps.setString(14, user.getUnitAddress());
                    	ps.setString(15, user.getUnitPhone());
                    }
                });  
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public User userLogin(User user) {
		String sql = "select * from t_user where UserName=? and Password=?";
		@SuppressWarnings("rawtypes")
		User users =jdbcTemplateHIP.queryForObject(sql, new Object[] { user.getUserName(),user.getPassword()}, new BeanPropertyRowMapper(User.class));
			return users;
	}
	@Override
	public List<User> userSelect() {
		String sql = "select * from t_user";
		List<User> users = jdbcTemplateHIP.query(sql, new RowMapper<User>(){
			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User user = new User();
				user.setID(rs.getInt("ID"));
				user.setNumber(rs.getString("Number"));
				user.setName(rs.getString("Name"));
				user.setUserName(rs.getString("UserName"));
				user.setPassword(rs.getString("Password"));
				user.setSex(rs.getInt("Sex"));
				user.setCard(rs.getString("Card"));
				user.setEmail(rs.getString("Email"));
				user.setPhone(rs.getString("Phone"));
				user.setExplan(rs.getString("Explan"));
				user.setUserType(rs.getInt("UserType"));
				user.setStatus(rs.getInt("Status"));
				user.setUnitNumber(rs.getString("UnitNumber"));
				user.setUnitName(rs.getString("UnitName"));
				user.setUnitAddress(rs.getString("Address"));
				user.setUnitPhone(rs.getString("UnitPhone"));
				return user;
			}});
		return users;
	}
	@Override
	public int addUser(final User user) {
		String sql="insert into t_user values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		return jdbcTemplateHIP.update(sql,  
                new PreparedStatementSetter() {  
                    public void setValues(PreparedStatement ps) throws SQLException {  
                    	ps.setString(1, user.getNumber());
                    	ps.setString(2, user.getName());
                    	ps.setString(3, user.getUserName());
                    	ps.setString(4, user.getPassword());
                    	ps.setInt(5, user.getSex());
                    	ps.setString(6, user.getCard());
                    	ps.setString(7, user.getEmail());
                    	ps.setString(8,user.getPhone());
                    	ps.setString(9, user.getExplan());
                    	ps.setInt(10, user.getUserType());
                    	ps.setInt(11, user.getStatus());
                    	ps.setString(12, user.getUnitNumber());
                    	ps.setString(13, user.getUnitName());
                    	ps.setString(14, user.getUnitAddress());
                    	ps.setString(15, user.getUnitPhone());
                    }
                });  
	}

	@Override
	public void deleteUser(User user) {
		  String sql = "delete from t_user where ID=?";
		  jdbcTemplateHIP.update(sql, user.getID());
	}

	@Override
	public void updateUser(User user) {
		 String sql = "update t_user set UserName=?,Password=? where ID=?";
		 jdbcTemplateHIP.update(sql, user.getUserName(),user.getPassword(), user.getID());
	}

	@Override
	public User selectById(int id) {
		 String sql="select * from t_user where ID=?";
		       return jdbcTemplateHIP.queryForObject(sql, new UserRowMapper(), id);
	}
	class UserRowMapper implements RowMapper<User> {
				//rs为返回结果集，以每行为单位封装着
		         public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		            User user = new User();
		            user.setID(rs.getInt("ID"));
					user.setNumber(rs.getString("Number"));
					user.setName(rs.getString("Name"));
					user.setUserName(rs.getString("UserName"));
					user.setPassword(rs.getString("Password"));
					user.setSex(rs.getInt("Sex"));
					user.setCard(rs.getString("Card"));
					user.setEmail(rs.getString("Email"));
					user.setPhone(rs.getString("Phone"));
					user.setExplan(rs.getString("Explan"));
					user.setUserType(rs.getInt("UserType"));
					user.setStatus(rs.getInt("Status"));
					user.setUnitNumber(rs.getString("UnitNumber"));
					user.setUnitName(rs.getString("UnitName"));
					user.setUnitAddress(rs.getString("Address"));
					user.setUnitPhone(rs.getString("UnitPhone"));
					return user;
		        } 

		}
}
