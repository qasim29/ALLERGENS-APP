/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App_Classes;

/**
 *
 * @author Qasim.29
 */


public class MedicalEmergency extends ClientMedicalProfile{

    public MedicalEmergency(String blood_group, String gender, int age,
            int height, int weight, String name, String email, String address,
            int phone) {
            super(blood_group, gender, age, height, weight, name, email, address,phone);
    }
    public void showSuggestion(){
        //Qasim Btaega
    }
}