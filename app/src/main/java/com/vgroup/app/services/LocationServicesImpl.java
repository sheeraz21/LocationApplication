package com.vgroup.app.services;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vgroup.app.dao.LocationDao;
import com.vgroup.app.entity.LocationInfo;
import com.vgroup.app.exception.LocationException;
import com.vgroup.app.utill.AppUtill;

@Service
public class LocationServicesImpl implements LocationServices {

	@Autowired
	LocationDao locDao;

	@Override
	public boolean addLocation(LocationInfo location) {
		// TODO Auto-generated method stub

		  try {
		
		Set<String> city = AppUtill.permutationFinder(location.getCityCode());
		Set<String> contry = AppUtill.permutationFinder(location.getContryCode());
		Set<String> statecode = AppUtill.permutationFinder(location.getStateCode());

		String arrayCity[] = city.toArray(new String[0]);
		String arrayContry[] = contry.toArray(new String[0]);
		String arrayState[] = statecode.toArray(new String[0]);

		location.setCityCode(Arrays.toString(arrayCity));
		location.setContryCode(Arrays.toString(arrayContry));
		location.setStateCode(Arrays.toString(arrayState));

		locDao.addLocation(location);
		return true;
		
		  }catch(Exception ex) {
	            throw new LocationException("Location is not genrated " + ex.getMessage());
		
	}

}

	@Override
	public List<LocationInfo> getAllDetails() {
		// TODO Auto-generated method stub
		return locDao.getAllDetails();
	}
	
}
