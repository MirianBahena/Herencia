import com.sun.jdi.event.StepEvent;

public class Teacher extends Person{
    private String abscription;
    private int bioCard;
    private int assignedHours;

    public Teacher() {
    }

    public Teacher(String name, String latsName, String email, String adress) {
        super(name, latsName, email, adress);
    }

    public String getAbscription() {
        return abscription;
    }

    public void setAbscription(String abscription) {
        this.abscription = abscription;
    }

    public int getBioCard() {
        return bioCard;
    }

    public void setBioCard(int bioCard) {
        this.bioCard = bioCard;
    }

    public int getAssignedHours() {
        return assignedHours;
    }

    public void setAssignedHours(int assignedHours) {
        this.assignedHours = assignedHours;
    }
    public String toString(){
        String texto = "La maestra " + getName() + " " + getLatsName() +
              "\n con biocard: " +" "+ getBioCard() +
                "\n horas asignadas: " + " " + getAssignedHours() + " "+  "a la semana"+ " "+
                "\n en el area de: " + getAbscription()+
                "\n con correo electronico: " + " "+ getEmail() +
                "\n y direccion: "+ " "+ getAdress();
        return texto;
    }


    public String Soy(){
        return "Soy una persona y profesora";
    }


}
