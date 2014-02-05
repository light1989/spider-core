package com.zs.light.spider.core.model;

public class PictureUrl extends AbstractUrl{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3042353309240104988L;
	
	// 文件保存目录及文件名
	private String filePath;

	// 文件名
	private String fileName;

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}