package com.kai.workshop.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.kai.workshop.model.ParamRequest;
import com.kai.workshop.model.ParamResponse;

@WebService(targetNamespace="http://kai.workshop.com/soap/service", name = "workshopService")
public interface WorkshopService {

	@WebResult(name = "paramResponse")
	@WebMethod(operationName = "tesSOAP")
	public ParamResponse tesSOAP(
			@WebParam(name = "paramRequest")
			ParamRequest request
			);
}
