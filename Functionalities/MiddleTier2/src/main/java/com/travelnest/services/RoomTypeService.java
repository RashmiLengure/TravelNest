package com.travelnest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelnest.entities.RoomType;
import com.travelnest.repositories.RoomTypeRepository;

@Service
public class RoomTypeService {
	@Autowired
	RoomTypeRepository roomrep;
	
	public RoomType getById(int typeid) {
		return roomrep.findById(typeid).get();
	}
	
	public List<RoomType> getRoomTypes() {
        return roomrep.findAll();
    }
	
	
}







