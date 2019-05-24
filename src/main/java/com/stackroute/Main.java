package com.stackroute;

import com.stackroute.db.CrudOperation;
import com.stackroute.db.DatabaseMetaDataDemo;
import com.stackroute.db.JDBCBatchProcessingDemo;
import com.stackroute.db.ResultSetMetaDataDemo;

import java.sql.ResultSetMetaData;

public class Main {
    public static void main(String[] args) {
        CrudOperation crudOperation = new CrudOperation();
//        crudOperation.displayData();
        crudOperation.displayCustomrerByName("Aditya");
        ResultSetMetaDataDemo resultsetmetadata=new ResultSetMetaDataDemo();
                resultsetmetadata.display();
       DatabaseMetaDataDemo databasemetadatademo=new DatabaseMetaDataDemo();
        databasemetadatademo.display();
        JDBCBatchProcessingDemo jdbcbatchprocessingdemo=new JDBCBatchProcessingDemo();
        jdbcbatchprocessingdemo.display();
    }
}
