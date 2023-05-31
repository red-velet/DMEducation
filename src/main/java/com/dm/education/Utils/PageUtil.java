package com.dm.education.Utils;


import java.util.ArrayList;
import java.util.List;

/*
 * 分页信息辅助类
 */
public class PageUtil {
	//当前页
	private Integer pageNum;
	//每页的数量
	private Integer pageSize;
	//当前页的数量
	private Integer size;
	//排序
	private String orderBy;
	//当前页面第一个元素在集合中的行号
	private Integer startIndex;
	//当前页面最后一个元素在集合中的行号
	private Integer endIndex;
	//总记录数
	private Integer total;
	//总页数
	private Integer pages;
	//结果集
	private List list;
	//第一页
	private Integer firstPage;
	//前一页
	private Integer prePage;
	//下一页
	private Integer nextPage;
	//最后一页
	private Integer lastPage;
	//是否为第一页
	private boolean isFirstPage = false;
	//是否为最后一页
	private boolean isLastPage = false;
	//是否有前一页
	private boolean hasPreviousPage = false;
	//是否有下一页
	private boolean hasNextPage = false;
	//导航页码数
	private Integer navigatePages;
	//所有导航页号
	private List<Integer> navigatepageNums = new ArrayList<>();
	//当前显示页码数
	private List<Integer> currentNavigatepageNums = new ArrayList<>();



	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public Integer getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	public Integer getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(Integer endIndex) {
		this.endIndex = endIndex;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Integer getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(Integer firstPage) {
		this.firstPage = firstPage;
	}

	public Integer getPrePage() {
		return prePage;
	}

	public void setPrePage(Integer prePage) {
		this.prePage = prePage;
	}

	public Integer getNextPage() {
		return nextPage;
	}

	public void setNextPage(Integer nextPage) {
		this.nextPage = nextPage;
	}

	public Integer getLastPage() {
		return lastPage;
	}

	public void setLastPage(Integer lastPage) {
		this.lastPage = lastPage;
	}

	public boolean isFirstPage() {
		return isFirstPage;
	}

	public void setFirstPage(boolean firstPage) {
		isFirstPage = firstPage;
	}

	public boolean isLastPage() {
		return isLastPage;
	}

	public void setLastPage(boolean lastPage) {
		isLastPage = lastPage;
	}

	public boolean isHasPreviousPage() {
		return hasPreviousPage;
	}

	public void setHasPreviousPage(boolean hasPreviousPage) {
		this.hasPreviousPage = hasPreviousPage;
	}

	public boolean isHasNextPage() {
		return hasNextPage;
	}

	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	public Integer getNavigatePages() {
		return navigatePages;
	}

	public void setNavigatePages(Integer navigatePages) {
		this.navigatePages = navigatePages;
	}

	public List<Integer> getNavigatepageNums() {
		return navigatepageNums;
	}

	public void setNavigatepageNums(List<Integer> navigatepageNums) {
		this.navigatepageNums = navigatepageNums;
	}

	public List<Integer> getCurrentNavigatepageNums() {
		return currentNavigatepageNums;
	}

	public void setCurrentNavigatepageNums(List<Integer> currentNavigatepageNums) {
		this.currentNavigatepageNums = currentNavigatepageNums;
	}

	@Override
	public String toString() {
		return "PageUtil{" +
				"pageNum=" + pageNum +
				", pageSize=" + pageSize +
				", size=" + size +
				", orderBy='" + orderBy + '\'' +
				", startIndex=" + startIndex +
				", endIndex=" + endIndex +
				", total=" + total +
				", pages=" + pages +
				", list=" + list +
				", firstPage=" + firstPage +
				", prePage=" + prePage +
				", nextPage=" + nextPage +
				", lastPage=" + lastPage +
				", isFirstPage=" + isFirstPage +
				", isLastPage=" + isLastPage +
				", hasPreviousPage=" + hasPreviousPage +
				", hasNextPage=" + hasNextPage +
				", navigatePages=" + navigatePages +
				", navigatepageNums=" + navigatepageNums +
				", currentNavigatepageNums=" + currentNavigatepageNums +
				'}';
	}

	public PageUtil(Integer pageNum, Integer pageSize, List list) {
		//当前页
		this.pageNum = pageNum;
		//每页的数量
		this.pageSize = pageSize;
		//总记录数
		this.total = list.size();
		//总页数
		if (this.total == 0) {
			this.pages = 1;
		} else {
			this.pages = this.total % pageSize == 0 ? (this.total / pageSize) : (this.total / pageSize + 1);
		}
		//结果集
		if(pageNum.equals(this.pages)){
			this.list = list.subList((pageNum - 1) * pageSize, this.total);
		}else{
			this.list = list.subList((pageNum - 1) * pageSize, pageNum * pageSize);
		}
		//是否为第一页
		if (pageNum == 1) {
			this.isFirstPage = true;
		}

		//是否为最后一页
		if (pageNum == this.pages) {
			this.isLastPage = true;
		}
		//是否有前一页
		if (pageNum != 1) {
			this.hasPreviousPage = true;
		}
		//是否有下一页
		if (pageNum != this.pages) {
			this.hasNextPage = true;
		}
		//当前页的数量
		if (pageNum != this.pages) {
			this.size = this.pageSize;
		} else {
			this.size = this.total - (pageNum - 1) * pageSize;
		}
		//第一页
		this.firstPage = 1;
		//前一页
		if (!this.hasPreviousPage) {
			this.prePage = 1;
		} else {
			this.prePage = pageNum - 1;
		}
		//最后一页
		this.lastPage = this.pages;
		//下一页
		if (!this.hasNextPage) {
			this.nextPage = this.lastPage;
		} else {
			this.nextPage = pageNum + 1;
		}
		if (this.total != 0) {
			//当前页面第一个元素在集合中的位置
			this.startIndex = (pageNum - 1) * pageSize;
			//当前页面最后一个元素在集合中的行号
			if (!hasNextPage) {
				this.endIndex = this.startIndex + this.size - 1;
			} else {
				this.endIndex = this.startIndex + pageSize - 1;
			}
		}
	}

	public PageUtil(Integer pageNum, Integer pageSize, List list, Integer navigatePages) {
		//当前页
		this.pageNum = pageNum;
		//每页的数量
		this.pageSize = pageSize;
		//总记录数
		this.total = list.size();
		//总页数
		if (this.total == 0) {
			this.pages = 1;
		} else {
			this.pages = this.total % pageSize == 0 ? (this.total / pageSize) : (this.total / pageSize + 1);
		}
		//结果集
		if(pageNum == this.pages){
			this.list = list.subList((pageNum - 1) * pageSize, this.total);
		}else{
			this.list = list.subList((pageNum - 1) * pageSize, pageNum * pageSize);
		}

		//是否为第一页
		if (pageNum == 1) {
			this.isFirstPage = true;
		}

		//是否为最后一页
		if (pageNum == this.pages) {
			this.isLastPage = true;
		}
		//是否有前一页
		if (pageNum != 1) {
			this.hasPreviousPage = true;
		}
		//是否有下一页
		if (pageNum != this.pages) {
			this.hasNextPage = true;
		}
		//当前页的数量
		if (pageNum != this.pages) {
			this.size = this.pageSize;
		} else {
			this.size = this.total - (pageNum - 1) * pageSize;
		}
		//第一页
		this.firstPage = 1;
		//前一页
		if (!this.hasPreviousPage) {
			this.prePage = 1;
		} else {
			this.prePage = pageNum - 1;
		}
		//最后一页
		this.lastPage = this.pages;
		//下一页
		if (!this.hasNextPage) {
			this.nextPage = this.lastPage;
		} else {
			this.nextPage = pageNum + 1;
		}
		if (this.total != 0) {
			//当前页面第一个元素在集合中的位置
			this.startIndex = (pageNum - 1) * pageSize;
			//当前页面最后一个元素在集合中的行号
			if (!hasNextPage) {
				this.endIndex = this.startIndex + this.size - 1;
			} else {
				this.endIndex = this.startIndex + pageSize - 1;
			}
		}
		//导航页码数
		this.navigatePages = navigatePages;
		//所有导航页号
		for (Integer i = 1; i <= this.pages; i++) {
			this.navigatepageNums.add(i);
		}

		//当前显示页码号
		if (navigatePages >= this.pages) {
			this.currentNavigatepageNums = this.navigatepageNums;
		} else {
			if (navigatePages % 2 == 0) {
				//第一个页码
				Integer start = pageNum - navigatePages / 2 + 1;
				//最后一个页码
				Integer end = pageNum + navigatePages / 2;
				if (start < 1) {
					if (end > this.pages) {
						this.currentNavigatepageNums = this.navigatepageNums.subList(0, this.pages);
					} else {
						this.currentNavigatepageNums = this.navigatepageNums.subList(0, end);
					}
				} else {
					if (end > this.pages) {
						this.currentNavigatepageNums = this.navigatepageNums.subList(start-1, this.pages);
					} else {
						this.currentNavigatepageNums = this.navigatepageNums.subList(start-1, end);
					}
				}
			} else {
				//第一个页码
				Integer start = pageNum - navigatePages / 2;
				//最后一个页码
				Integer end = pageNum + navigatePages / 2;
				if (start < 1) {
					if (end > this.pages) {
						this.currentNavigatepageNums = this.navigatepageNums.subList(0, this.pages);
					} else {
						this.currentNavigatepageNums = this.navigatepageNums.subList(0, end);
					}
				} else {
					if (end > this.pages) {
						this.currentNavigatepageNums = this.navigatepageNums.subList(start-1, this.pages);
					} else {
						this.currentNavigatepageNums = this.navigatepageNums.subList(start - 1, end);
					}
				}
			}
		}
	}
}
