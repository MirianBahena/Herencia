import java.security.PrivateKey;

public class Person {

    private String name;

    private String latsName;

    private String email;

    private String adress;

    //Constructor vacio

    public Person() {
    }
    // Constructor Parametrizado

    public Person(String name, String latsName, String email, String adress) {
        this.name = name;
        this.latsName = latsName;
        this.email = email;
        this.adress = adress;


    }
    // Creacion de metodos get y set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatsName() {
        return latsName;
    }

    public void setLatsName(String latsName) {
        this.latsName = latsName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    //metodo soy
    public String Soy(){
        return  "soy una persona";


    }
}
