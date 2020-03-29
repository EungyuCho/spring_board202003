package com.board.common;

import lombok.Data;

public class Pagination {

	private int listSize = 10;
	private int rangeSize = 10;
	private int page;
	private int range;
	private int listCnt;
	private int pageCnt;
	private int startPage;
	private int startList;
	private int endPage;
	private boolean prev;
	private boolean next;
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getPage() {
		return page;
	}

	public void setRange(int range) {
		this.range = range;
	}
	
	public int getRange() {
		return range;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	
	public int getStartPage() {
		return startPage;
	}

	public int getRangeSize() {
		return rangeSize;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getListSize() {
		return listSize;
	}
	
	public void setListCnt(int listCnt) {
		this.listCnt = listCnt;
	}
	
	public int getListCnt() {
		return listCnt;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	
	public boolean isPrev() {
		return prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public void setListSize(int listSize) {
		this.listSize = listSize;
	}

	public int getStartList() {
		return startList;
	}

	public void pageInfo(int page, int range, int listCnt) {
		this.page = page;
		this.range = range;
		this.listCnt = listCnt;
		
		this.pageCnt = (int) Math.ceil(listCnt/listSize);
		this.startPage = (range - 1) * rangeSize + 1;
		this.endPage = range * rangeSize;
		this.startList = (page -1) * listSize;
		this.prev = range == 1 ? false : true;
		this.next = endPage > pageCnt ? false : true;
		if(this.endPage > this.pageCnt) {
			this.endPage = this.pageCnt;
			this.next = false;
		}
	}
}
