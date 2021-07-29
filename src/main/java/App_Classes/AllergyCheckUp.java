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
public class AllergyCheckUp{
    private String barcode;
    private String product_name;
    private final ArrayList<String> matched_allergies = new ArrayList<>();
    
    AllergyCheckUp(){
    }
    
    AllergyCheckUp(String barcode){
        //Qasim Btaega
    }
    
    ArrayList<String> getIngredientsAPI(int barcode){
        return matched_allergies; // yahan api ki array list aegi ye matched_allergies nhi aega
    }
    
    void checkAllergy(){
        //Qasim Btaega
    }
    
    ArrayList<String> getMatchedAllergies(){
        return matched_allergies;
    }
}