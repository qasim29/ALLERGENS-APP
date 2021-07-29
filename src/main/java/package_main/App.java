package package_main;

import java.util.*;
import openfoodfacts_API.APIClass;


public class App {

    public static void main(String[] args) {
    
        APIClass apicall = new APIClass("8961014021585");
        apicall.getingredients();
    }

}



