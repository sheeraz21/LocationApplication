package com.vgroup.app.dao;

import java.util.List;

import com.vgroup.app.entity.LocationInfo;

public interface LocationDao {
	
	void addLocation(LocationInfo location);
	
	public List<LocationInfo> getAllDetails();

}
