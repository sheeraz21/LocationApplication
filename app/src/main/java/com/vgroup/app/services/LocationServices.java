package com.vgroup.app.services;

import java.util.List;

import com.vgroup.app.entity.LocationInfo;

public interface LocationServices {
	
	boolean addLocation(LocationInfo location);
	public List<LocationInfo> getAllDetails();

}
