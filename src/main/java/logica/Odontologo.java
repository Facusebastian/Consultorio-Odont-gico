
package logica;

import java.util.Date;
import java.util.List;


public class Odontologo extends Persona{
    private int id_odontologo;
    private String especialidad;
    private List<Turno> listaTurnos;
    private Usuario usuario = null;
    private Horario horario;

    public Odontologo() {
    }

   
    public Odontologo(int id_odontologo, String especialidad, List<Turno> listaTurnos, Horario horario, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.id_odontologo = id_odontologo;
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.horario = horario;
    }

    public int getId_odontologo() {
        return id_odontologo;
    }

    public void setId_odontologo(int id_odontologo) {
        this.id_odontologo = id_odontologo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
    
}
