package com.liveasy.services;

import java.util.List;

import com.liveasy.entities.Payload;

public interface loadServices {
	
  
	
	public Payload addLoad (Payload payload);
	
	public Payload updateLoad(Payload payload);
	
	public void deleteLoad(long parseLong);

	public Payload getLoads(long shipperId);
	
	public Payload getLoadId(long loadId);
		
	}
	


