package com.f103.it.page;

import java.io.Serializable;

public class PageParam implements Serializable{
	private static final long serialVersionUID = 5609419383593305510L;
	
	private int page; //页号
	
	private int rows; //每页的列数
	
	private String sort;//根据什么排序
	private String order;//升序还是降序

	private long beginPageIndex;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public long getBeginPageIndex() {
		if(page == 1){
			beginPageIndex=0;
		}else{
			beginPageIndex=(page-1)*rows;
		}
		
		return beginPageIndex;
	}
	@Override
	public String toString() {
		return "PageParam [page=" + page + ", rows=" + rows + ", sort=" + sort + ", order=" + order
				+ ", beginPageIndex=" + beginPageIndex + "]";
	}
	
	
	
}
