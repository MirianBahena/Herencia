public class Student extends Person{
    private int ControlNumber;
    private String carrer;
    private double generalAverage;

    public Student() {
    }

    public Student(String name, String latsName, String email, String adress) {
        super(name, latsName, email, adress);
    }

    public Student(String name, String latsName, String email,
                   String adress, int controlNumber, String carrer, double generalAverage) {
        super(name, latsName, email, adress);
        ControlNumber = controlNumber;
        this.carrer = carrer;
        this.generalAverage = generalAverage;

    }

    public int getControlNumber() {
        return ControlNumber;
    }

    public void setControlNumber(int controlNumber) {
        ControlNumber = controlNumber;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public double getGeneralAverage() {
        return generalAverage;
    }

    public void setGeneralAverage(double generalAverage) {
        this.generalAverage = generalAverage;
    }

    //sobrecargando el metodo toString
    public String toString(){
        String texto = "El alumno es:" + getName() + " " + getLatsName() +
                "\n con numero de control: " + getControlNumber() + " " +
                "\n correo electronico: " + getEmail() + " " +
                "\n direccion:" + getAdress() +
                "\n inscrito en la carrera de: " + " " + getCarrer()+
                "\n con un promedio general de: " + " "+ getGeneralAverage();
        return texto;

    }
    public String Soy(){
        return "soy una persona y Estudiante";
    }
}
