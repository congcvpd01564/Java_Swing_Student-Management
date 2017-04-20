/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class User extends Person{
    private String Username;
    private String Password;
    private String Author;

    public User() {
    }

    public User(String Username, String Password, String Author, String Fullname, String Email, String Gender, String Phone) {
        super(Fullname, Email, Gender, Phone);
        this.Username = Username;
        this.Password = Password;
        this.Author = Author;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }
    
    
    
    

    
}
