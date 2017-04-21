package com.sz.college.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sz.college.dao.PositionDao;
import com.sz.college.model.Position;
/**
 * 位置实现类
 * @author zhouxiaohu
 *
 */
@Repository("positionDao")
public class PositionDaoImpl implements PositionDao {

	@Override
	public List<Position> selectObject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position selectCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
