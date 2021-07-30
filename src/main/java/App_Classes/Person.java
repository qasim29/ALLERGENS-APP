package App_Classes;
import java.util.*;
/**
 *
 * @author Qasim.29
 */
public abstract class Person {
    private String name;
    private String address;
    private int phone;
    private String email;
    public Person(){
        
    }
    public Person(String name, String email, String address, int phone){
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

}





