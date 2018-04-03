package com.hzq.demo.dao.base;

import java.util.List;

/**
 * Created by zhengxgs on 2018/1/10.
 */
public interface BaseDao<T> {
    public Boolean insert(T var);
    public Boolean delete(T var);
    public Boolean update(T var);
    public List<T> select(T var);
}