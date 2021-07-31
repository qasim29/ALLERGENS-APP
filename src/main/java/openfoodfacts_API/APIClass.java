/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openfoodfacts_API;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Qasim.29
 */
public class APIClass {        
    private String barcode;
    public APIClass(String barcode){
      this.barcode = barcode;
    }
    public ArrayList<String> getingredients(){
        
        ArrayList<String> listdata = new ArrayList<String>();
        try {
            URL url = new URL("https://world.openfoodfacts.org/api/v0/product/"+ barcode +".json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            //Getting the response code
            int responsecode = conn.getResponseCode();

            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } 
            else {
                String inline = "";
                Scanner scanner = new Scanner(url.openStream());
                //Write all the JSON data into a string using a scanner
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }
                // Parsing api response  
                JSONObject jsnobject = new JSONObject(inline);  
                JSONObject obj = (JSONObject) jsnobject.get("product");
                String obj2 = (String) ", "+ obj.get("ingredients_text_en");    
                String[] words = obj2.split(", ");
                for(String w:words){  
                listdata.add(w);
                }
                listdata.remove(0);
//                System.out.println("forloop arralist");
//                 for(String w:listdata){  
//                    System.out.println(w);
//                }
//                System.out.println(listdata);
                }  
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
            return listdata;
    }
}

//Creating an empty ArrayList of type Object  
        //        ArrayList<Object> listdata = new ArrayList<Object>();
//        JSONObject jsnobject = new JSONObject(inline);  
//        JSONObject obj = (JSONObject) jsnobject.get("product");
//        //Getting languages JSON array from the JSON object  
//        JSONArray jsonArray = obj.getJSONArray("ingredients_ids_debug");          
//        //Checking whether the JSON array has some value or not  
//        if (jsonArray != null) {
//            //Iterating JSON array  
//            for (int i=0;i<jsonArray.length();i++){   
//                  
//                //Adding each element of JSON array into ArrayList  
//                listdata.add(jsonArray.get(i));  
//            }   
//        }  
//        //Iterating ArrayList to print each element  
//  
//        System.out.println("Each element of ArrayList");  
//        for(int i=0; i<listdata.size(); i++) {  
//            //Printing each element of ArrayList  
//            System.out.println(listdata.get(i)); 
//            
//            
//  