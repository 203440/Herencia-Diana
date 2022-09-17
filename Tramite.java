import java.util.Scanner;
public abstract class Tramite {
    Scanner entrada= new Scanner (System.in);
    String nombre;
    String requisitos;
    public String getNombre(){
        return nombre;
    }
    public  void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getRequisitos(){
        return requisitos;
    }
    public Tramite(){}
    public abstract void Requisitos();
}
