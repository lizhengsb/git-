package edu.tzl.entity;

import java.util.List;

public class PaperHelp {
	private int pageRow;
	private int totalRow;
	private int totalPage;
	private int nowPage;
	private List list;

	public PaperHelp(int pageRow, int totalRow, int nowPage, List list) {
		super();
		this.pageRow = pageRow;
		this.totalRow = totalRow;
		if (totalRow % pageRow == 0) {
			this.totalPage = totalRow / pageRow;
		} else {
			this.totalPage = totalRow / pageRow + 1;
		}
		this.nowPage = nowPage;
		this.list = list;
	}

	public PaperHelp() {
		super();
	}

	public int getPageRow() {
		return pageRow;
	}

	public void setPageRow(int pageRow) {
		this.pageRow = pageRow;
	}

	public int getTotalRow() {
		return totalRow;
	}

	public void setTotalRow(int totalRow) {
		this.totalRow = totalRow;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

}
