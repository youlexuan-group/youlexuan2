package com.offcn.entity;

import java.io.Serializable;

public class PageResult implements Serializable {

    private long total;
    private long rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getRows() {
        return rows;
    }

    public void setRows(long rows) {
        this.rows = rows;
    }

    public PageResult(long total, long rows) {
        this.total = total;
        this.rows = rows;
    }

    public PageResult() {
    }
}
