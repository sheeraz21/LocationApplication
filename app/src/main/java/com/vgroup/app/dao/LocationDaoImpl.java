package com.vgroup.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.vgroup.app.entity.LocationInfo;

@Transactional
@Repository
public class LocationDaoImpl implements LocationDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addLocation(LocationInfo location) {
		// TODO Auto-generated method stub

		entityManager.persist(location);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LocationInfo> getAllDetails() {
		// TODO Auto-generated method stub
		String hql = "FROM LocationInfo as loc ORDER BY loc.locationId";
		return (List<LocationInfo>) entityManager.createQuery(hql).getResultList();
	}

}
