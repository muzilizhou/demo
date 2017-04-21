package com.sz.college.service;

import java.util.List;

import com.sz.college.model.CenterPosition;

/**
 * 中心位置服务层
 * @author zhouxiaohu
 *
 */
public interface CenterPositionService {
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
