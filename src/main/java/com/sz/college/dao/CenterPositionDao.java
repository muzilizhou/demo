package com.sz.college.dao;

import java.util.List;

import com.sz.college.model.CenterPosition;

/**
 * 中心位置接口
 * @author zhouxiaohu
 *
 */
public interface CenterPositionDao {
	/**
	 * 中心位置查找
	 * @return
	 */
	public List<CenterPosition> selectObject();
	/**
	 * 条件查找
	 * @param condition
	 * @return
	 */
	public CenterPosition selectCondition(String condition);
}
