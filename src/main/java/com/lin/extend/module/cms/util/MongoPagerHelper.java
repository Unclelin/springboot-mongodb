package com.lin.extend.module.cms.util;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.io.Serializable;

/**
 * @Author: tom-lin
 * @Description:
 * @Date: Created in 01:02 17/7/2
 * @Modified by:
 */
public class MongoPagerHelper  implements Serializable, Pageable{

    private Integer pagesize = 20;

    private Integer pageNo = 1;

    private Sort sort;

    //private Integer totalRows;

    @Override
    public int getPageNumber() {
        return getPageNo();
    }

    @Override
    public int getPageSize() {
        return getPagesize();
    }

    @Override
    public int getOffset() {
        return (getPageNumber()-1)* getPageSize();
    }

    @Override
    public Sort getSort() {
        return sort;
    }

    public Integer getPageNo(){
        return pageNo;
    }

    public void setPageNo(Integer pageNo){
        this.pageNo = pageNo;
    }

    public Integer getPagesize(){
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    @Override
    public Pageable next() {
        return null;
    }

    @Override
    public Pageable previousOrFirst() {
        return null;
    }

    @Override
    public Pageable first() {
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }
}
