package com.f103.it.page;

import java.io.Serializable;
import java.util.List;

public class PageResult <T> implements Serializable{
	
	/**
	 * 
	 */
	public PageResult(PageParam pageParam){
		this.pageParam = pageParam;
	}
	public PageResult(){}
	private static final long serialVersionUID = 7673041600356804086L;

	private PageParam pageParam;

	public PageParam getPageParam() {
		return this.pageParam;
	}

	public void setPageParam(PageParam pageParam) {
		this.pageParam = pageParam;
	}

	private long total; //总共的数据条数
	
	private List<T> rows; //当前页具体数据



	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "PageBean [total=" + total + ", rows=" + rows + "]";
	}

	
	
	
	
	
}
