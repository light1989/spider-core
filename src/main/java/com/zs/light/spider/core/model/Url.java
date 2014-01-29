package com.zs.light.spider.core.model;

import java.io.Serializable;


public class Url implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8035775054554544512L;
	
	private String type;
	
	private String url;
	
	private String md5;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	@Override
	public String toString() {
		return "Url [type=" + type + ", url=" + url + ", md5=" + md5 + "]";
	}
	
}