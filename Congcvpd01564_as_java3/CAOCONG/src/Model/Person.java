
package Model;


public class Person {
    private String Fullname;
    private String Email;
    private String Gender;
    private String Phone;

    public Person() {
    }

    public Person(String Fullname, String Email, String Gender, String Phone) {
        this.Fullname = Fullname;
        this.Email = Email;
        this.Gender = Gender;
        this.Phone = Phone;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
    
}

