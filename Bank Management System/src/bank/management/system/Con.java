package bank.management.system;

import java.sql.*;

public class Con {
       Connection connection;
        public Statement statement;
    public Con(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root","Rampur@123");
            statement = connection.createStatement();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
