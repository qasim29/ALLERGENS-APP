/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App_Classes;

import java.util.ArrayList;
import openfoodfacts_API.APIClass;

/**
 *
 * @author Qasim.29
 */
public class AllergyCheckUp{
    private String barcode;
    private String product_name;
    private ArrayList<String> matched_allergies = new ArrayList<>();
    ArrayList<String> UserAllergieslist;
    APIClass p1;
    
    AllergyCheckUp(){
    }
    
    public AllergyCheckUp(String barcode,String product_name,ArrayList<String> UserAllergieslist){
        this.barcode=barcode;
        this.product_name=product_name;
        this.UserAllergieslist=UserAllergieslist;
        p1 = new APIClass(barcode); 
    }    
 
    public void setUserAllergies(ArrayList<String> list_of_allergy){
        this.UserAllergieslist =list_of_allergy;
    }
    
    ArrayList<String> getIngredientsFromAPI(){
        return p1.getingredients();
    }    
    
    ArrayList<String> getMatchedAllergies(){
        return matched_allergies;
    }
    
    public void checkAllergy(){
        
        for(String i:UserAllergieslist){
            for(String j:getIngredientsFromAPI()){
                if(i==j){
                    matched_allergies.add(i);
                }
            }
        }
    }
    public boolean isProductAllergic(){
        if(matched_allergies.isEmpty()){
            return false;
        }
        else return true;
    }
    
    public String emrgency(MedicalEmergency e1){
        return e1.showSuggestion();
        
    }
    
}