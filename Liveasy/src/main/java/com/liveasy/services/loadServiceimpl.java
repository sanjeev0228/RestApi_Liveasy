package com.liveasy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liveasy.Dao.loadDao;
import com.liveasy.entities.Payload;

@Service
public class loadServiceimpl implements loadServices {
	
	@Autowired
	private loadDao LoadDao;
	public  loadServiceimpl() {
		
	}
	
	@Override
	public Payload addLoad(Payload payload) {
		LoadDao.save(payload);
		return payload;
	}
	

    @Override
	public Payload updateLoad(Payload payload) {
		
		LoadDao.save(payload);
		return payload;
	}
    
    
    @Override
	public void deleteLoad(long parseLong) {
      Payload entity =LoadDao.getReferenceById(parseLong);
	  LoadDao.delete(entity);
		
	}
    
  

    @Override
	public Payload getLoads(long shipperId) {
		return LoadDao.getReferenceById(shipperId);
	}


    @Override
	public Payload getLoadId(long loadId) {
		return  LoadDao.getReferenceById(loadId);
	}









	














}