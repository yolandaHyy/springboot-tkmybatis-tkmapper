package com.loger.common.page;

import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.List;

/**
 * @author Loger
 */
public class PageResult<T> implements Serializable {

    private long total;

    private List<T> list;

    /**
     * 使用PageHelper分页的结果集
     * PageHelper.startxxxx返回的是一个Page对象，该对象继承ArrayList,
     *
     * @param list
     */
    public PageResult(List<T> list) {
        if (list instanceof Page) {
            total = ((Page) list).getTotal();
            this.list = list;
        } else {
            throw new PageResultException("你应该使用PageHelper进行分页,否则请使用重载的构造方法");
        }
    }

    /**
     * 手动分页
     *
     * @param total
     * @param list
     */
    public PageResult(long total, List<T> list) {
        this.total = total;
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    private static class PageResultException extends RuntimeException {

        public PageResultException(String message) {
            super(message);
        }

    }

}
