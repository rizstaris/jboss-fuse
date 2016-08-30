package com.kai.workshop.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
	    "strParam",
	    "intParam"
	})
@XmlRootElement(name="paramRequest")
public class ParamRequest {

	private String strParam;
	private Integer intParam;
	
	public String getStrParam() {
		return strParam;
	}
	public void setStrParam(String strParam) {
		this.strParam = strParam;
	}
	public Integer getIntParam() {
		return intParam;
	}
	public void setIntParam(Integer intParam) {
		this.intParam = intParam;
	}
	
	
}
