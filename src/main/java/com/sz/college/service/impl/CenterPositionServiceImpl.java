package com.sz.college.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.sz.college.dao.CenterPositionDao;
import com.sz.college.model.CenterPosition;
import com.sz.college.service.CenterPositionService;

public class CenterPositionServiceImpl implements CenterPositionService {
	@Resource
	 CenterPositionDao centerPositionDao;
	@Override
	public List<CenterPosition> selectObject() {
		return centerPositionDao.selectObject();
	}

	@Override
	public CenterPosition selectCondition(String condition) {
		return centerPositionDao.selectCondition(condition);
	}

}
