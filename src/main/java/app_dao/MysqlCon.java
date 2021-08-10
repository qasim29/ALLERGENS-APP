/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_dao;

import App_Classes.ClientMedicalProfile;
import App_Classes.LoginClass;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Qasim.29
 */
//There are 5 steps to connect any java application with the database using JDBC. These steps are as follows:
//Register the Driver class
//Create connection
//Create statement
//Execute queries
//Close connection
public class MysqlCon {

    static Connection create() {
        Connection con = null;
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/allergyappdb", "root", "qasimmohammad");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static ClientMedicalProfile readClientProfile(String arg) {
        ClientMedicalProfile c1 = null;
        try {
            Connection con = create();
            //create preparedStatement
            String query = "SELECT * FROM client_profile WHERE EMAIL= ?";

            PreparedStatement state = con.prepareStatement(query);
            state.setString(1, arg);

            ResultSet rs = state.executeQuery();
            rs.next();
            String name = rs.getString("name");
            String email = rs.getString("email");
            String blood_group = rs.getString("blood_group");
            int age = rs.getInt("age");
            int height = rs.getInt("height");
            Double weight = rs.getDouble("weight");
            String phone = rs.getString("phone");
            String gender = rs.getString("gender");
            // 
            c1 = new ClientMedicalProfile(name, email, blood_group, age, height, weight, phone, gender);
            //close connection
            state.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c1;
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

    public static void updateClientProfile(ClientMedicalProfile c1) {
        try {
            Connection con = create();
            String query = "UPDATE client_profile SET Name=?,Blood_Group=?, Age=?,Height=?,Weight=?,Phone=?,Gender=? where email = ? ";

            PreparedStatement state = con.prepareStatement(query);
            state.setString(1, c1.getName());
            state.setString(2, c1.getBlood_group());
            state.setInt(3, c1.getAge());
            state.setDouble(4, c1.getHeight());
            state.setDouble(5, c1.getWeight());
            state.setString(6, c1.getPhone());
            state.setString(7, c1.getGender());
            state.setString(8, c1.getEmail());
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

            String query = "DELETE FROM client_profile  WHERE Email = ? ";

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

    public static boolean checkEmail(String arg) {
        try {
            Connection con = create();
            String queryCheck = "SELECT * from client_profile WHERE email = ?";
            PreparedStatement ps = con.prepareStatement(queryCheck);
            ps.setString(1, arg);
            final ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                return true;
            }
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
            return false;
        }
        return false;
    }

    public static void setCredentials(LoginClass lc) {
        try {
            Connection con = create();
            String queryCheck = "INSERT INTO login_table(Email,password) values(?,?) ";
            PreparedStatement state = con.prepareStatement(queryCheck);
            state.setString(1, lc.getEmail());
            state.setString(2, lc.getPassword());
            int result = state.executeUpdate();
            System.out.println(result + " records affected");
            state.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("im setcredentials  method in msql con ");
        }

    }

    public static boolean checkCredentials(LoginClass lc) {
        try {
            Connection con = create();
            String queryCheck = "SELECT * from login_table WHERE email = ? AND password=?";
            PreparedStatement state = con.prepareStatement(queryCheck);
            state.setString(1, lc.getEmail());
            state.setString(2, lc.getPassword());

            final ResultSet rs = state.executeQuery();
            if (rs.next()) {
                return true;
            }
            state.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("im setcredentials  method in msql con ");
        }
        return false;
    }

    public static String getPassword(String email) {
        String pass = null;
        try {
            Connection con = create();
            String query = "Select * From Login_table where email = ?";
            PreparedStatement state = con.prepareStatement(query);
            state.setString(1, email.trim());
            final ResultSet rs = state.executeQuery();
            if (rs.next()) {
                pass = rs.getString("password");
                return pass;
            }
            state.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("im getpassword method in msql con ");
        }
        return pass;
    }

    public static void updatePassword(LoginClass lc) {
        try {
            Connection con = create();
            String query = "UPDATE LOGIN_TABLE SET PASSWORD =? WHERE EMAIL=?";
            PreparedStatement state = con.prepareStatement(query);
            state.setString(1, lc.getPassword());
            state.setString(2, lc.getEmail());
            int result = state.executeUpdate();
            System.out.println(result + " records affected");
            state.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("im Updatepassword method in msql con ");
        }
    }

    public static void deleteFromLoginTable(LoginClass lc) {
        try {
            Connection con = create();
            String query = "DELETE FROM login_table WHERE EMAIL=?";
            PreparedStatement state = con.prepareStatement(query);
            state.setString(1, lc.getEmail());
            int result = state.executeUpdate();
            System.out.println(result + " records affected");
            state.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("im deleteFromLoginTable method in msql con ");
        }
    }


    public static DefaultListModel jListretrieve(String email) {
        DefaultListModel dm = new DefaultListModel();

        //SQL STMT
        String query = " SELECT Allergies FROM user_allergies WHERE EMAIL = ? ";

        try {
            Connection con = create();

            //PREPARED STMT
            PreparedStatement state = con.prepareStatement(query);
            state.setString(1, email);
            ResultSet rs = state.executeQuery();

            //LOOP THRU GETTING ALL VALUES
            while (rs.next()) {
                //GET VALUES
                String allergy = rs.getString("Allergies");

                //ADD TO DM
                dm.addElement(allergy);
            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static Boolean jListDelete(String value) {
        //SQL STMT
        String sql = "DELETE FROM user_allergies WHERE  Allergies = ?";

        try {
            //CONNECTION
            Connection con = create();

            //sTAETEMT
            PreparedStatement state = con.prepareStatement(sql);
            state.setString(1, value);
            
            //EXECUTE
            int result = state.executeUpdate();
            System.out.println(result + " records affected");
            state.close();
            con.close();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        
    }
     public static Boolean jListInsert(String Email, String allergy) {
        String query ="Insert into user_allergies (Email,Allergies) values (?,?)";

        try {
            Connection con = create();
            
            //STATEMENT
            PreparedStatement state = con.prepareStatement(query);

            //EXECUTEx
            state.setString(1, Email);
            state.setString(2, allergy);
            
            int result = state.executeUpdate();
            System.out.println(result + " records affected");
            state.close();
            con.close();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            
            return false;
        }
    }
    public static ArrayList<String> userAllergyRetrieve(String email) {
         ArrayList<String> userAllergy = new ArrayList<String>();

        //SQL STMT
        String query = " SELECT Allergies FROM user_allergies WHERE EMAIL = ? ";

        try {
            Connection con = create();

            //PREPARED STMT
            PreparedStatement state = con.prepareStatement(query);
            state.setString(1, email);
            ResultSet rs = state.executeQuery();

            //LOOP THRU GETTING ALL VALUES
            while (rs.next()) {
                //GET VALUES
                String allergy = rs.getString("Allergies");

                //ADD TO DM
                userAllergy.add(allergy);
            }
            return userAllergy;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
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
