import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;
public class Registro {
    static Scanner entrada=new Scanner(System.in); 
    static Persona persona = new Persona();
    static boolean existenciaCita;
    public static void main(String[] args) {
        Datos(persona);
    }
    public static void Datos(Persona persona){
        ArrayList <Persona> concita=new ArrayList <Persona>();
        ArrayList <Persona> sincita=new ArrayList <Persona>();
        Calendar fecha=Calendar.getInstance();
        String nombre, apellidoP, apellidoM, domicilio, curp;
        int edad, cita;
         System.out.println("ingrese su nombre:");
         persona.setNombre(entrada.next());
         System.out.println("ingrese su apellido paterno:");
         persona.setApellidoP(entrada.next());
         System.out.println("ingrese su Apellido materno:");
         persona.setApellidoM(entrada.next());
         System.out.println("ingrese su direccion:");
         persona.setDomicilio(entrada.next());
         do {
            System.out.println("ingrese su edad:");
            edad=entrada.nextInt(); 
            persona.setEdad(edad);
           
        }while(persona.validarEdad());
        do{
            System.out.println("ingrese su curp:");
            curp=entrada.next();
            persona.setCurp(curp);
        } while(persona.ValidarCurp());
         System.out.println("tiene cita 1.-si 2.-no");
         cita=entrada.nextInt();
        validarCita(cita, persona, fecha, concita, sincita);
        
    }
    public static void validarCita(int cita, Persona persona, Calendar fecha, ArrayList <Persona> concita,ArrayList <Persona> sincita){
        TramiteNuevo nuevo=new TramiteNuevo();
        TramitePorExtravio extravio=new TramitePorExtravio();
        TramitePorRenovacion renovacion=new TramitePorRenovacion();
       Cita datos=new Cita ();
        ArrayList<Integer> Citas =new  ArrayList<Integer>();
        Citas.add(120346879);
        Citas.add(987123654);
        Citas.add(123456789);
        int folio;
        int dia;
        int mes;
        int anio;
        int tipo, elecc;
        if (cita==1){
            System.out.println("ingrese dia");
            dia=entrada.nextInt();
            System.out.println("ingrese mes");
            mes=entrada.nextInt();
            System.out.println("ingrese año");
            anio=entrada.nextInt();
            fecha.set(anio, mes, dia);
            System.out.println("ingrese su folio");
            folio=entrada.nextInt();
            datos.setFolio(folio);
            for(int i=0; i<=Citas.size(); i++){
                if(Citas.get(i)==folio){
                    System.out.println("Su folio lo temenos registrado podra pasar a la fila 1 despues de revisar tus requisitos");
                    concita.add(persona);
                    break;
                }else{
                    System.out.println("Su folio no existe podra pasar a la fila 2 despues de revisar tus requisitos");
                    sincita.add(persona);
                }
            }
        }else{
            System.out.println("Podra pasar a la fila 2 despues de revisar tus requisitos");
            sincita.add(persona);
        }  
        System.out.println(" que tipo de tramite es:\n1.-tramite nuevo\n2.-tramite por extravio\n3.- tramite por renovacion");
        tipo=entrada.nextInt();
        switch (tipo) {
           case 1:
               nuevo.Requisitos();
               System.out.println("cuenta con los requisitos:\n1.-si\n2.-no");
               elecc=entrada.nextInt();
               if (elecc==1){
                   System.out.println("Muy bien por favor pase a la fila que le es asignado");
               }else{
                   System.out.println("lo sentimos pero no se le puede atender, le sugerimos conseguir los requisitos y vuelva a visitarnos");
               }
           break;
           case 2:
              extravio.Requisitos();
              System.out.println("cuenta con los requisitos:\n1.-si\n2.-no");
               elecc=entrada.nextInt();
              if (elecc==1){
               System.out.println("Muy bien por favor pase a la fila que le es asignado");
              }else{
               System.out.println("lo sentimos pero no se le puede atender, le sugerimos conseguir los requisitos y vuelva a visitarnos");
              }
           break;
           case 3:
              renovacion.Requisitos();
              System.out.println("cuenta con los requisitos:\n1.-si\n2.-no");
               elecc=entrada.nextInt();
              if (elecc==1){
                System.out.println("Muy bien por favor pase a la fila que le es asignado");
              }else{
                System.out.println("lo sentimos pero no se le puede atender, le sugerimos conseguir los requisitos y vuelva a visitarnos");
              }
           break;
           default:
              System.out.println("Seleccion invalida, intente nuevamente\n");
      } while (tipo != 3);
    }
}