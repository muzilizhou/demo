package com.sz.college.dao;

import java.util.List;

import com.sz.college.model.Position;

/**
 * 位置接口
 * @author zhouxiaohu
 *
 */
public interface PositionDao {
	/**
	 * 位置查找
	 * @return
	 */
	public List<Position> selectObject();
	/**
	 * 条件查找
	 * @param condition
	 * @return
	 */
	public Position selectCondition(String condition);
}
