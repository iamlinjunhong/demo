package com.manage.util;

import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.List;

public class PageSerializable<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    protected long total;
    protected List<T> list;

    public PageSerializable() {
    }

    public PageSerializable(List<T> list) {
        this.list = list;
        if (list instanceof Page) {
            this.total = ((Page)list).getTotal();
        } else {
            this.total = (long)list.size();
        }

    }

    public static <T> com.github.pagehelper.PageSerializable<T> of(List<T> list) {
        return new com.github.pagehelper.PageSerializable(list);
    }

    public long getTotal() {
        return this.total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getList() {
        return this.list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public String toString() {
        return "{\"total\":" + this.total + ", \"list\":" + this.list + '}';
    }
}

