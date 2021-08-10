/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App_Classes;

import openfoodfacts_API.MedicalEmergency;
import java.io.IOException;
import java.util.ArrayList;
import openfoodfacts_API.APIClass;

/**
 *
 * @author Qasim.29
 */
public class AllergyCheckUp {

    private String barcode;
    private ArrayList<String> matched_allergies = new ArrayList<>();
    APIClass p1;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public AllergyCheckUp(String barcode) {
        this.barcode = barcode;
        p1 = new APIClass(barcode);
    }

    public ArrayList<String> getIngredientsFromAPI() {
        return p1.getingredients(barcode);
    }

    public ArrayList<String> getMatchedAllergies() {
        return matched_allergies;
    }

    public void checkAllergy(ArrayList<String> UserAllergieslist, String barcode) {
        //getIngredientsFromAPI();
        for (String i : UserAllergieslist) {
            for (String j : getIngredientsFromAPI()) {
                int n = i.compareToIgnoreCase(j);
                if (n == 0) {
                    matched_allergies.add(i);
                }
            }
        }
    }

    public boolean isProductAllergic() {
        return !matched_allergies.isEmpty();
    }

    public ArrayList<String> emrgency(MedicalEmergency m1) throws IOException {
        return m1.showSuggestion(matched_allergies);
    }

}
