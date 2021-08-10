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
public class LoginClass {

    private String email;
    private String password;

    public LoginClass(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public LoginClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
