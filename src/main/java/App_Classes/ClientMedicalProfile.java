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
    private int height;
    private int weight;
    public ArrayList<ClientMedicalProfile> list_of_allergy = new ArrayList<>();
    
    ClientMedicalProfile(String blood_group, String gender, int age, int height,
            int weight, String name, String email, String address, int phone){
        super(name, email, address, phone);
        this.blood_group = blood_group;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
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
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    ArrayList<ClientMedicalProfile> getAllergyList(){
        return list_of_allergy;
    }
     @Override
    public String toString() {
        return "ClientMedicalProfile{" + "blood_group=" + blood_group + ", gender=" + gender + ", age=" + age + ", height=" + height + ", weight=" + weight + '}';
    }
    
}
