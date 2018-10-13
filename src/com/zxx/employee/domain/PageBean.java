package com.zxx.employee.domain;

/**
 * @author zxx
 * @date 2018/10/13 11:50
 */

import java.util.List;

/**
 * 分页封装的类
 */
public class PageBean<T> {
    //当前页数
    private int currPage;
    //每页显示的记录数
    private int pageSize;
    //总记录数
    private int totalCount;

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    //总页数
    private int totalPage;
    //每页显示的数据
    private List<T> list;


}
