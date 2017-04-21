package com.sz.college.service;

import java.util.List;

import com.sz.college.model.Position;

/**
 * 位置服务层
 * @author zhouxiaohu
 *
 */
public interface PositionService {
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
