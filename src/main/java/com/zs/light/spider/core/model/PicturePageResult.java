package com.zs.light.spider.core.model;

import java.util.List;


public class PicturePageResult extends AbstractResult{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1243924780832600887L;
	
	/**
	 * 图片保存路径
	 */
	private String filePath;
	
	/**
	 * 页面图片url列表
	 */
	private List<PictureUrl> picUrlList;

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setPicUrlList(List<PictureUrl> picUrlList) {
		this.picUrlList = picUrlList;
	}

	public List<PictureUrl> getPicUrlList() {
		return picUrlList;
	}

}