package com.shashank.location.service;

import java.util.List;

import com.shashank.location.entities.Location;

public interface LocationService {
	
	Location saveLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation(Location locatioin);
	Location getLocationById(int id);
	List<Location> getAllLocation();
}
