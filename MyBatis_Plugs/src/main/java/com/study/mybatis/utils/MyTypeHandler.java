package com.study.mybatis.utils;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Description:
 * @Author: rands
 * @Date: Created in 10:51 2020/4/29
 * @Modified By:
 */
public class MyTypeHandler implements TypeHandler {
    /**
     * 在生成SQL语句时被调用
     *
     * @param preparedStatement
     * @param i
     * @param o
     * @param jdbcType
     * @throws SQLException
     */
    public void setParameter(PreparedStatement preparedStatement, int i, Object o, JdbcType jdbcType) throws SQLException {
        /* dept.flag=null   insert sql  flag设置0*/
        if (o == null) {
            preparedStatement.setInt(i, 0);
            return;
        }

        System.out.println("类型转换器开始工作");
        Boolean flag = (Boolean) o;
        if (flag == true) {
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
     * @param s
     * @return
     * @throws SQLException
     */
    public Object getResult(ResultSet resultSet, String s) throws SQLException {
        int flag = resultSet.getInt(s);
        Boolean result = Boolean.FALSE;
        if (flag == 1) {
            result = Boolean.TRUE;
        }
        return result;
    }

    public Object getResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    public Object getResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
