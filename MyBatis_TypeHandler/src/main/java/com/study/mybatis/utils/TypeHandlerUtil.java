package com.study.mybatis.utils;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Description:
 * @Author: rands
 * @Date: Created in 16:01 2020/4/27
 * @Modified By:
 */
public class TypeHandlerUtil implements TypeHandler {
    private Logger logger = LoggerFactory.getLogger(TypeHandlerUtil.class);

    /**
     * 生产SQL语句的时候调用
     *
     * @param preparedStatement
     * @param i
     * @param parameter
     * @param jdbcType
     * @throws SQLException
     */
    public void setParameter(PreparedStatement preparedStatement, int i, Object parameter, JdbcType jdbcType) throws SQLException {
        if (parameter == null) {
            preparedStatement.setInt(i, 0);
            return;
        }
        logger.warn("*****类型转换器开始工作*****");
        Boolean flag = (Boolean) parameter;
        if (flag) {
            preparedStatement.setInt(i, 1);
        } else {
            preparedStatement.setInt(i, 0);
        }
    }

    /**
     * 查询结束之后，在将ResultSet数据行装换为实体类对象时
     * 通知TypeHandler将当前数据行某个字段转换为何种类型
     *
     * @param resultSet
     * @param columnName
     * @return
     * @throws SQLException
     */
    public Object getResult(ResultSet resultSet, String columnName) throws SQLException {
        int flag = resultSet.getInt(columnName);
        Boolean myFlag = Boolean.FALSE;
        if (flag == 1) {
            myFlag = Boolean.TRUE;
        }
        return myFlag;
    }

    public Object getResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    public Object getResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
