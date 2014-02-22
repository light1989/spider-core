package com.zs.light.spider.core.model;

public class PicturePageUrl extends Url {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3042353309240104988L;
	
	/**
	 * 存放目录
	 */
	private String filePath;

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFilePath() {
		return filePath;
	}
}