
package Model;


public class Point {
    
    private double TopNotch;
    private double Java;
    private double SQL;
    private double Mang;
    private double DTB;
    private String Id;
    private String Username;

    public Point() {
    }

    public Point(double TopNotch, double Java, double SQL, double Mang, double DTB, String Id, String Username) {
        this.TopNotch = TopNotch;
        this.Java = Java;
        this.SQL = SQL;
        this.Mang = Mang;
        this.DTB = DTB;
        this.Id = Id;
        this.Username = Username;
    }

    public double getTopNotch() {
        return TopNotch;
    }

    public void setTopNotch(double TopNotch) {
        this.TopNotch = TopNotch;
    }

    public double getJava() {
        return Java;
    }

    public void setJava(double Java) {
        this.Java = Java;
    }

    public double getSQL() {
        return SQL;
    }

    public void setSQL(double SQL) {
        this.SQL = SQL;
    }

    public double getMang() {
        return Mang;
    }

    public void setMang(double Mang) {
        this.Mang = Mang;
    }

    public double getDTB() {
        return(TopNotch + Java + SQL + Mang)/4.0;
    }

    public void setDTB(double DTB) {
        this.DTB = DTB;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }
    
    
    
}
