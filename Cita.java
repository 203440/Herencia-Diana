import java.util.Calendar;

public class Cita {
    private int folio;
    private Calendar fecha;

    public int getFolio(){
        return folio; 
    }
     public void setFolio(int folio){
         this.folio=folio;
    }
    public Calendar getFecha(){
        return fecha; 
    }
     public void setFecha(Calendar fecha){
        this.fecha=fecha;
    }
}