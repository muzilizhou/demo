package com.sz.college.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sz.college.dao.TimeTableDao;
import com.sz.college.model.TimeTable;
/**
 * 课程实现类
 * @author zhouxiaohu
 *
 */
@Repository("timeTableDao")
public class TimeTableDaoImpl implements TimeTableDao {
	@Resource
	JdbcTemplate jdbcTemplateHIP;
	@Override
	public List<TimeTable> slectObject() {
		String sql = "select * from t_timetable";
		List<TimeTable> timetable = jdbcTemplateHIP.query(sql, new RowMapper<TimeTable>(){
			@Override
			public TimeTable mapRow(ResultSet rs, int arg1) throws SQLException {
				TimeTable timetable=new TimeTable();
				timetable.setID(rs.getInt("ID"));
				timetable.setNumber(rs.getString("Number"));
				timetable.setName(rs.getString("Name"));
				timetable.setPosition(rs.getString("Position"));
				timetable.setExplan(rs.getString("Explan"));
				timetable.setTime(rs.getString("time"));
				timetable.setTeacher(rs.getString("Teacher"));
				timetable.setOperation(rs.getString("Openration"));
				return timetable;
			}});
		return timetable;
	}
	@Override
	public TimeTable selectCondition(String condition) {
		 String sql="select * from t_timetable where ID=?";
	       return jdbcTemplateHIP.queryForObject(sql, new TimeTableRowMapper(), condition);

}
	@Override
	public TimeTable slectById(int id) {
		 String sql="select * from t_timetable where ID=?";
	       return jdbcTemplateHIP.queryForObject(sql, new TimeTableRowMapper(), id);
	}
	@Override
	public int addTimeTable(final TimeTable timetable) {
		String sql="insert into t_timetable values(null,?,?,?,?,?,?)";
		return jdbcTemplateHIP.update(sql,new PreparedStatementSetter(){
			public void setValues(PreparedStatement ps) throws SQLException { 
				ps.setString(1, timetable.getNumber());
				ps.setString(2, timetable.getName());
				ps.setString(3, timetable.getPosition());
				ps.setString(4, timetable.getExplan());
				ps.setString(5, timetable.getTime());
				ps.setString(6, timetable.getTeacher());
				ps.setString(7, timetable.getOperation());
			}
		});
	}
	@Override
	public void deleteTimeTable(TimeTable timetable) {
		String sql="delete from t_timetable where ID=?";
		jdbcTemplateHIP.update(sql,timetable.getID());
	}
	@Override
	public void UpdateTimeTable(TimeTable timetable) {
 		String sql="update t_timetable set Nmae=? where ID=?";
 		jdbcTemplateHIP.update(sql,timetable.getName(),timetable.getID() );
	}
	class TimeTableRowMapper implements RowMapper<TimeTable> {
		//rs为返回结果集，以每行为单位封装着
         public TimeTable mapRow(ResultSet rs, int rowNum) throws SQLException {
        	 TimeTable timetable = new TimeTable();
        	 timetable.setID(rs.getInt("Id"));
        	 timetable.setNumber(rs.getString("number"));
        	 timetable.setName(rs.getString("Name"));
        	 timetable.setPosition(rs.getString("Position"));
        	 timetable.setExplan(rs.getString("Explan"));
        	 timetable.setTime(rs.getString("Time"));
        	 timetable.setTeacher(rs.getString("Teacher"));
        	 timetable.setOperation(rs.getString("Operation"));
			return timetable;
        } 
	}
}
