package com.zs.light.spider.core.model;

import java.io.Serializable;


public class Url implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8035775054554544512L;
	
	private String type;
	
	private String address;
	
	private String md5;
	
	private String status;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	@Override
	public String toString() {
		return "Url [type=" + type + ", address=" + address + ", md5="
				+ md5 + "]";
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}