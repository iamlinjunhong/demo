package com.manage.util;

import com.github.pagehelper.Page;

import java.util.Collection;
import java.util.List;

public class PageInfo<T> extends PageSerializable<T> {
    private int pageNum;
    private int pageSize;
    private int size;
    private int startRow;
    private int endRow;
    private int pages;

    private boolean isFirstPage;
    private boolean isLastPage;


    public PageInfo() {
        this.isFirstPage = false;
        this.isLastPage = false;
    }

    public PageInfo(List<T> list) {
        this(list, 8);
    }

    public PageInfo(List<T> list, int navigatePages) {
        super(list);
        this.isFirstPage = false;
        this.isLastPage = false;

        if (list instanceof Page) {
            Page page = (Page) list;
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.pages = page.getPages();
            this.size = page.size();
            if (this.size == 0) {
                this.startRow = 0;
                this.endRow = 0;
            } else {
                this.startRow = page.getStartRow() + 1;
                this.endRow = this.startRow - 1 + this.size;
            }
        } else if (list instanceof Collection) {
            this.pageNum = 1;
            this.pageSize = list.size();
            this.pages = this.pageSize > 0 ? 1 : 0;
            this.size = list.size();
            this.startRow = 0;
            this.endRow = list.size() > 0 ? list.size() - 1 : 0;
        }

        if (list instanceof Collection) {

            this.judgePageBoudary();
        }

    }

    public static <T> com.github.pagehelper.PageInfo<T> of(List<T> list) {
        return new com.github.pagehelper.PageInfo(list);
    }

    public static <T> com.github.pagehelper.PageInfo<T> of(List<T> list, int navigatePages) {
        return new com.github.pagehelper.PageInfo(list, navigatePages);
    }


    private void judgePageBoudary() {
        this.isFirstPage = this.pageNum == 1;
        this.isLastPage = this.pageNum == this.pages || this.pages == 0;
//        this.hasPreviousPage = this.pageNum > 1;
//        this.hasNextPage = this.pageNum < this.pages;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStartRow() {
        return this.startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getEndRow() {
        return this.endRow;
    }

    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    /** @deprecated */
//    @Deprecated
//    public int getFirstPage() {
//        return this.navigateFirstPage;
//    }

    /** @deprecated */
//    @Deprecated
//    public void setFirstPage(int firstPage) {
//        this.navigateFirstPage = firstPage;
//    }

//    public int getPrePage() {
//        return this.prePage;
//    }
//
//    public void setPrePage(int prePage) {
//        this.prePage = prePage;
//    }
//
//    public int getNextPage() {
//        return this.nextPage;
//    }
//
//    public void setNextPage(int nextPage) {
//        this.nextPage = nextPage;
//    }

    /**
     * @deprecated
     */
//    @Deprecated
//    public int getLastPage() {
//        return this.navigateLastPage;
//    }
//
//    /** @deprecated */
//    @Deprecated
//    public void setLastPage(int lastPage) {
//        this.navigateLastPage = lastPage;
//    }
    public boolean isIsFirstPage() {
        return this.isFirstPage;
    }

    public void setIsFirstPage(boolean isFirstPage) {
        this.isFirstPage = isFirstPage;
    }

    public boolean isIsLastPage() {
        return this.isLastPage;
    }

    public void setIsLastPage(boolean isLastPage) {
        this.isLastPage = isLastPage;
    }


    public String toString() {
        String listString = "";
        if (this.list.toString().substring(0, 1).equals("[")) {
            listString = this.list.toString();
        } else {
            listString = this.list.toString().substring(this.list.toString().indexOf("}") + 1, this.list.toString().length());
        }
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"pageNum\":").append(this.pageNum);
        sb.append(", \"pageSize\":").append(this.pageSize);
        sb.append(", \"size\":").append(this.size);
        sb.append(", \"startRow\":").append(this.startRow);
        sb.append(", \"endRow\":").append(this.endRow);
        sb.append(", \"total\":").append(this.total);
        sb.append(", \"pages\":").append(this.pages);
        sb.append(", \"isFirstPage\":").append(this.isFirstPage);
        sb.append(", \"isLastPage\":").append(this.isLastPage);
        sb.append(", \"list\":").append(listString);
        sb.append('}');
        System.out.println("sb"+sb);
        return sb.toString();
    }
}

