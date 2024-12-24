
package logica;

import java.util.Date;
import javax.persistence.Entity;
@Entity
public class Responsable extends Persona{
  //  private int id_responsable;
    private String tipo_respon;

    public Responsable() {
    }

    public Responsable(String tipo_respon, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.tipo_respon = tipo_respon;
    }

    

  

   /* public int getId_responsable() {
        return id_responsable;
    }

    public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }*/

    public String getTipo_respon() {
        return tipo_respon;
    }

    public void setTipo_respon(String tipo_respon) {
        this.tipo_respon = tipo_respon;
    }
    
}
