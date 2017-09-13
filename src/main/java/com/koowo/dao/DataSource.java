package com.koowo.dao;

import org.mybatis.spring.SqlSessionTemplate;

/**
 * Author: mac
 * Date: 2017/9/8
 * Description: 根据业务选择不同的数据源
 */
public class DataSource {

    public static SqlSessionTemplate getDataSource(String serviceName) {
        return null;
    }
}
