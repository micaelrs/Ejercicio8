import java.security.PublicKey;

public class Main {
    public static void main(String[] args){
        //objeto persona en el main
        Persona persona = new Persona(); //es el objeto
        //Utiliza los gets y sets, valores a las propiedades
        //edad, nombre, telefono
        persona.setEdad(34);
        persona.setNombre("Mickael");
        persona.setTelefono("6274-534");

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}
class Persona{ //clase Persona.
    //Variables privadas
    private int edad;
    private String Nombre;
    private String Telefono;

    //Gets y sets de cada propiedad
    public void setEdad(int edad){
                    this.edad = edad;
    }
    public int getEdad(){
                    return this.edad;
    }
    public void setNombre(String nombre){
                    this.Nombre = nombre;
    }
    public String getNombre(){
                    return this.Nombre;
    }
    public void setTelefono(String telefono){
                    this.Telefono = telefono;
    }
    public String getTelefono(){
                    return this.Telefono;
    }
}