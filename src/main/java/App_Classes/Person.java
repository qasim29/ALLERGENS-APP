package App_Classes;

import java.util.*;

/**
 *
 * @author Qasim.29
 */
public abstract class Person {

    private String name;
    private String phone;
    private String email;

    public Person() {

    }

    public Person(String name, String email,String phone) {
        this.name = name;

        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
