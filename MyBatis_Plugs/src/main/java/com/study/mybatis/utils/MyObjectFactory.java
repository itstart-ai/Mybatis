package com.study.mybatis.utils;

import com.study.mybatis.beans.Dept;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

/**
 * @Description: 自定义工厂模式
 * @Author: rands
 * @Date: Created in 10:44 2020/4/29
 * @Modified By:
 */
public class MyObjectFactory extends DefaultObjectFactory {
    /**
     * /重新定义Dept类实例对象创建规则，其他类实例对象创建规则不改变
     *
     * @param type
     * @return
     */
    @Override
    public Object create(Class type) {
        if (Dept.class == type) {
            //依靠父类提供create方法创建Dept实例对象
            Dept dept = (Dept) super.create(type);
            //设置自定义规则
            dept.setCountry("China");
            return dept;
        }
        return super.create(type);
    }
}
