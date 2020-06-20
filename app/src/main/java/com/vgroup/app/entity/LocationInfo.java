package com.vgroup.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="location")
public class LocationInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "locationId")
	private Integer locationId;
	
	@Column(name="contrycode")
	@NotEmpty(message = "Contry Code is mandatory")

	private String contryCode;
	
	@Column(name="statecode")
	@NotEmpty(message = "State Code is mandatory")
	
	private String stateCode;
	
	
	@Column(name="citycode")
	
	private String cityCode;


	public Integer getLocationId() {
		return locationId;
	}


	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}


	


	public String getContryCode() {
		return contryCode;
	}


	public void setContryCode(String contryCode) {
		this.contryCode = contryCode;
	}


	public String getStateCode() {
		return stateCode;
	}


	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}


	public String getCityCode() {
		return cityCode;
	}


	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityCode == null) ? 0 : cityCode.hashCode());
		result = prime * result + ((contryCode == null) ? 0 : contryCode.hashCode());
		result = prime * result + ((locationId == null) ? 0 : locationId.hashCode());
		result = prime * result + ((stateCode == null) ? 0 : stateCode.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LocationInfo other = (LocationInfo) obj;
		if (cityCode == null) {
			if (other.cityCode != null)
				return false;
		} else if (!cityCode.equals(other.cityCode))
			return false;
		if (contryCode == null) {
			if (other.contryCode != null)
				return false;
		} else if (!contryCode.equals(other.contryCode))
			return false;
		if (locationId == null) {
			if (other.locationId != null)
				return false;
		} else if (!locationId.equals(other.locationId))
			return false;
		if (stateCode == null) {
			if (other.stateCode != null)
				return false;
		} else if (!stateCode.equals(other.stateCode))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "LocationInfo [locationId=" + locationId + ", contryCode=" + contryCode + ", stateCode=" + stateCode
				+ ", cityCode=" + cityCode + "]";
	}
	
	
	
	

}
