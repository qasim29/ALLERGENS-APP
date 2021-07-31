package openfoodfacts_API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Qasim.29
 */
public class MedicalEmergency {

    public MedicalEmergency() {
    }

    public ArrayList<String> showSuggestion(ArrayList<String> matched_Allergies) throws MalformedURLException, IOException {
        
        ArrayList<String> links = new ArrayList<>();
        String key = "AIzaSyCigc45V06EllX-6RZ-rs7a7ODgQTRdgyw";
        
        for(String qry : matched_Allergies){
            URL url = null;
            try {
                url = new URL("https://www.googleapis.com/customsearch/v1?key=" + key + "&cx=013036536707430787589:_pqjad5hr1a&q=" + qry + "+allergy" + "&alt=json");
            } catch (MalformedURLException ex) {
                Logger.getLogger(MedicalEmergency.class.getName()).log(Level.SEVERE, null, ex);
            }

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            try {
                conn.setRequestProperty("Accept", "application/json");
            } catch (Exception e) {
                System.out.println("main nhi bataunga");
                e.printStackTrace();
            }

            conn.setRequestProperty("Accept", "application/json");
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");

            int j = 0;
            try {
                while ((output = br.readLine()) != null && j < 2) {

                    if (output.contains("\"link\": \"")) {
                        String link = output.substring(output.indexOf("\"link\": \"") + ("\"link\": \"").length(), output.indexOf("\","));
                        links.add(link);
                        //System.out.println(link);       //Will print the google search links
                        j++;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            conn.disconnect();
        }   
        return links;
    }

}


// google api key
//    AIzaSyCigc45V06EllX-6RZ-rs7a7ODgQTRdgyw                             
