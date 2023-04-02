import org.w3c.dom.ls.LSOutput;

public class SchoolApp {
    public static void main(String[] args) {
        Student student1 = new Student("Juan ", "Perez",
                "Juanp@Gmail.com","Rufo Figueroa");
        Teacher teacher1 = new Teacher("Maria", "Morales",
                "MariaM@gmail.com", "Rufo Figueroa");

        teacher1.setBioCard(7845);
        teacher1.setAssignedHours(5);
        teacher1.setAbscription("Servicios escolares");

        student1.setControlNumber(123456);
        student1.setCarrer("Informatica");
        student1.setGeneralAverage(9.6);

        System.out.println("El nombre de la maestra es = " + teacher1.getName() + " " + teacher1.getLatsName());
        System.out.println("El nombre del estudiante = " + student1.getName() + " " + student1.getLatsName());



        //Probando la sobrecarga de metodos
        System.out.println("Metodo To String() de student: " + student1.toString());
        System.out.println("Metodo to string () de teacher: " + teacher1.toString());


        System.out.println( ""+ student1.Soy());
        System.out.println(""+ teacher1.Soy());


    }


}
