/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlcompare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author belciñaan_sd2081
 */
public class SqlCompare {

//    public Connection dbConn() {
//        // create a mysql database connection
//        String myDriver = "com.mysql.jdbc.Driver";
//        String myUrl = "jdbc:mysql://localhost/compare";
//        try {
//            Class.forName(myDriver);
//            Connection connection = DriverManager.getConnection(myUrl, "root", "");
//            return connection;
//        } catch (Exception e) {
//            System.err.println("Got an exception!");
//            System.err.println(e.getMessage());
//            return null;
//        }
//    }
//
//    public Boolean execute(String sqlString) {
//        try {
//            Connection conn = dbConn();
//            Statement st = conn.createStatement();
//            st.executeUpdate(sqlString);
//            conn.close();
//            return true;
//        } catch (Exception e) {
//            System.err.println("Got an exception!");
//            System.err.println(e.getMessage());
//            return false;
//        }
//    }
//   
//        int num1 = 0;   int num2 = 1;    int num3 = 2;    int num4 = 3;    int num5 = 4;
//   
//    public void insert() {
//        int counter = 0;
//        Date today = new Date();
//        long start = today.getTime();
//        SimpleDateFormat startTime = new SimpleDateFormat("hh:mm:ss a");
//        System.out.println("starting time: " + startTime.format(today));
//        for (int i = 0; i < 1000; i++) {
//            num1 = num1 + 1;
//            num2 = num2 + 1;
//            num3 = num3 + 1;
//            num4 = num4 + 1;
//            num5 = num5 + 1;
//            String sqlString = "INSERT INTO sqlcompare (firstnum, secondnum, thirdnum,fourthnum, fifthnum )" + "VALUES ('" + num1 + "','" + num2 + "','" + num3 + "','" + num4 + "','" + num5 + "')";
//            execute(sqlString);
//            counter = counter + 1;
//        }
//        System.out.println("Insert row " + counter + " in database");
//        Date endtoday = new Date();
//        SimpleDateFormat endTime = new SimpleDateFormat("hh:mm:ss a");
//        System.out.println("end time: " + endTime.format(endtoday));
//    }
//
//    public void delete() {
//        int counter = 0;
//        Date today = new Date();
//        long start = today.getTime();
//        SimpleDateFormat startTime = new SimpleDateFormat("hh:mm:ss a");
//        System.out.println("starting time: " + startTime.format(today));
//        for (int i = 0; i < 1000; i++) {
//            num1 = num1 + 1;
//            String sqlString = "DELETE FROM sqlcompare WHERE firstnum = " + num1;
//            execute(sqlString);
//            counter = counter + 1;
//        }
//        System.out.println("delete row " + counter + " in database");
//        Date endtoday = new Date();
//        SimpleDateFormat endTime = new SimpleDateFormat("hh:mm:ss a");
//        System.out.println("end time: " + endTime.format(endtoday));
//
//
//    }
    
    public Connection write(String myDriver, String myUrl, int num1, int num2, int num3, int num4, int num5){
     int counter = 0;
        Date today = new Date();
        long start = today.getTime();
        SimpleDateFormat startTime = new SimpleDateFormat("hh:mm:ss a");
        System.out.println("starting time: " + startTime.format(today));
        for (int i = 0; i < 300; i++) {
            num1 = num1 + 1;
            num2 = num2 + 1;
            num3 = num3 + 1;
            num4 = num4 + 1;
            num5 = num5 + 1;
            String sqlString = "INSERT INTO sqlcompare (firstnum, secondnum, thirdnum,fourthnum, fifthnum )" + "VALUES ('" + num1 + "','" + num2 + "','" + num3 + "','" + num4 + "','" + num5 + "')";
            execute(sqlString);
            counter = counter + 1;
            
            try {
            Class.forName(myDriver);
            Connection connection = DriverManager.getConnection(myUrl, "root", "");
            return connection;
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
            return null;
        }
    }
        return null;
      
        
        
    }
    
    
    
    

    public static void main(String[] args) {
        SqlCompare c = new SqlCompare();

        c.insert();
//        c.delete();

    }

    private void execute(String sqlString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}