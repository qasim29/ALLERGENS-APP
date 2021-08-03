/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_dao;

import App_Classes.ClientMedicalProfile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Qasim.29
 */
public class MysqlCon {

    static Connection create() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/allergyappdb", "root", "qasimmohammad");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    public static void readClientProfile(String arg) {

        try {
            Connection con = create();
            //create preparedStatement
            String query = "SELECT * FROM Customers WHERE EMAIL= ?";
            
            PreparedStatement state = con.prepareStatement(query);
            state.setString(1, arg);
            
            ResultSet rs = state.executeQuery(query);
                String name  = rs.getString("name");
                String email= rs.getString("email");
                String blood_group  = rs.getString("blood_group");
                int age  = rs.getInt("age");
                int height  = rs.getInt("height");
                Double weight= rs.getDouble("weight");
                String phone  = rs.getString("phone");
                String gender= rs.getString("gender");

                // ClientMedicalProfile c1 = new ClientMedicalProfile()
            //close connection
            state.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void insertClientProfile(ClientMedicalProfile c1) {
        try {
            Connection con = create();
            String query = "INSERT INTO client_profile(Name,Email,Blood_Group, Age,Height,Weight,Phone,Gender) values (?,?,?,?,?,?,?,?) ";

            PreparedStatement state = con.prepareStatement(query);
            state.setString(1, c1.getName());
            state.setString(2, c1.getEmail());
            state.setString(3, c1.getBlood_group());
            state.setInt(4, c1.getAge());
            state.setDouble(5, c1.getHeight());
            state.setDouble(6, c1.getWeight());
            state.setString(7, c1.getPhone());
            state.setString(8, c1.getGender());
            int result = state.executeUpdate();
            System.out.println(result + " records affected");
            state.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("im addCLientProfle method in msql con ");
        }
    }

    public static void addClientProfile(ClientMedicalProfile c1) {
        try {
            Connection con = create();
            String query = "UPDATE client_profile SET Name=?,Email=?,Blood_Group=?, Age=?,Height=?,Weight=?,Phone=?,Gender=? ";

            PreparedStatement state = con.prepareStatement(query);
            state.setString(1, c1.getName());
            state.setString(2, c1.getEmail());
            state.setString(3, c1.getBlood_group());
            state.setInt(4, c1.getAge());
            state.setDouble(5, c1.getHeight());
            state.setDouble(6, c1.getWeight());
            state.setString(7, c1.getPhone());
            state.setString(8, c1.getGender());
            int result = state.executeUpdate();
            System.out.println(result + " records affected");
            state.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("im addCLientProfle method in msql con ");
        }
    }

    public static void deleteClientProfile(String arg) {
        try {
            Connection con = create();

            String query = "DELETE * FROM client_profile  WHERE Email = ? ";
           
            PreparedStatement state = con.prepareStatement(query);
            state.setString(1, arg);
            int result = state.executeUpdate();
            
            System.out.println(result + " records affected");
            state.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("im deleteCLientProfle method in msql con ");
        }
    }


}



//getting table
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/allergyappdb", "root", "qasimmohammad");
//            //here sonoo is database name, root is username and password  
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from client_profile");
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//            }
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }