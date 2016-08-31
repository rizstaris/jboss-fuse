package com.kai.workshop.ws.processor;

import com.kai.workshop.dao.service.WorkshopService;

public class WorkshopWSProcessor {

	private WorkshopService workshopService;

	
	
	public WorkshopService getWorkshopService() {
		return workshopService;
	}

	public void setWorkshopService(WorkshopService workshopService) {
		this.workshopService = workshopService;
	}
}
