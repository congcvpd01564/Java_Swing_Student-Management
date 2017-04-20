/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class St extends Person{
    String Id;
    String Classe;
    String Address;
    String Dateofbirth;

    public St() {
    }

    public St(String Id, String Classe, String Address, String Dateofbirth, String Fullname, String Email, String Gender, String Phone) {
        super(Fullname, Email, Gender, Phone);
        this.Id = Id;
        this.Classe = Classe;
        this.Address = Address;
        this.Dateofbirth = Dateofbirth;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getClasse() {
        return Classe;
    }

    public void setClasse(String Classe) {
        this.Classe = Classe;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getDateofbirth() {
        return Dateofbirth;
    }

    public void setDateofbirth(String Dateofbirth) {
        this.Dateofbirth = Dateofbirth;
    }
    
    
    
    
    
}
