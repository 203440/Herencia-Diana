public class Persona {
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int edad;
    private String curp;
    private String domicilio;
    public String getNombre(){
       return nombre; 
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getApellidoP(){
        return apellidoP; 
    }
     public void setApellidoP(String apellidoP){
         this.apellidoP=apellidoP;
    }
     public String getApellidoM(){
        return apellidoM; 
    }
     public void setApellidoM(String apellidoM){
         this.apellidoM=apellidoM;
    }
    public int getEdad(){
        return edad; 
     }
     public void setEdad(int edad){
         this.edad=edad;
     }
     public String getCurp(){
         return curp; 
     }
      public void setCurp(String curp){
          this.curp=curp;
    }
      public String getDomicilio(){
         return domicilio; 
    }
      public void setDomicilio(String domicilio){
          this.domicilio=domicilio;
    }
    public boolean validarEdad() {
        if (edad<=18){
           return true;
    
        }else{
            return false;
        }
    }
    public boolean ValidarCurp(){
      
        if( curp.length()!=18){
            return true;
        }else{
            return false;
        }
    }
}

