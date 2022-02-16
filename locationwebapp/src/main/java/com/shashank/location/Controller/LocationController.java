package com.shashank.location.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shashank.location.entities.Location;
import com.shashank.location.service.LocationService;

import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class LocationController {

	@Autowired
	LocationService service;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}

	@RequestMapping("/savLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location locationSaved = service.saveLocation(location);
		String msg = "Location saved with id: " + locationSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createLocation";

	}
	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		List<Location> locations = service.getAllLocation();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
		
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id,ModelMap modelMap) {
		Location location = service.getLocationById(id);
		service.deleteLocation(location);
		List<Location> locations = service.getAllLocation();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
		 
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
		Location location = service.getLocationById(id);
		modelMap.addAttribute("location", location);
		return "updateLocation";
	}
	
	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		service.updateLocation(location);
		List<Location> locations = service.getAllLocation();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
		
	}
}
