/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App_Classes;

import java.util.ArrayList;

/**
 *
 * @author Qasim.29
 */


public class ClientMedicalProfile extends Person{
    private String blood_group;
    private String gender;
    private int age;
    private double height;
    private double weight;
    public ArrayList<String> UserAllergieslist;
    
    public ClientMedicalProfile(String name,String email,String blood_group,int age,double height,double weight,String phone, String gender) {
       super(name,email,phone);
        this.blood_group = blood_group;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender=gender;
    }


    public  ArrayList<String> getUserAllergieslist() {
        return UserAllergieslist;
    }

    
    public ClientMedicalProfile(){
       
    }

    public ClientMedicalProfile(String name, String email,String phone) {
        super(name, email, phone);
    }

    /**
     * @return the blood_group
     */
    public String getBlood_group() {
        return blood_group;
    }

    /**
     * @param blood_group the blood_group to set
     */
    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    
    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
    
    public ArrayList<String> getUserAllergies(){
        return UserAllergieslist;
    }

    public void setUserAllergies(ArrayList<String> UserAllergieslist){
        this.UserAllergieslist =UserAllergieslist;

    }
    
    @Override
    public String toString() {
        return "ClientMedicalProfile{" + "blood_group=" + blood_group + ", gender=" + gender + ", age=" + age + ", height=" + height + ", weight=" + weight + '}';
    }
    
}
