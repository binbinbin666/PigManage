package com.bd.pigmanage.util;

/**
 * 读取视图表对应的物理表的工具类
 */
public class TableUtil {
    //获取当前下项目的在此电脑上的路径
    //获取物理表需访问的配置文件路路径
    private final static String PATH= "D:\\javahome\\PigManageProject\\resource\\DataTable.properties";
    private final static String PATHs="DataTable.properties";
    public TableUtil(){

    }

    //获取对应的物理表
    public static String[] getTables(String key) throws Exception {
        PropertiesUtil pro=new PropertiesUtil();
        String value=pro.getValue(PATH,key);
        return value.split("\\.");

    }
}
