package com.sz.college.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.sz.college.dao.PositionDao;
import com.sz.college.model.Position;
import com.sz.college.service.PositionService;

public class PositionServiceImpl implements PositionService {
	@Resource
	PositionDao positionDao;
	@Override
	public List<Position> selectObject() {
		return positionDao.selectObject();
	}

	@Override
	public Position selectCondition(String condition) {
		return positionDao.selectCondition(condition);
	}
}
