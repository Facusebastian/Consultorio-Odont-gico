package logica;

public class Horario {
    private int id_horario;
    private String horario_entra, horario_salid;

    public Horario() {
    }

    public Horario(int id_horario, String horario_entra, String horario_salid) {
        this.id_horario = id_horario;
        this.horario_entra = horario_entra;
        this.horario_salid = horario_salid;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getHorario_entra() {
        return horario_entra;
    }

    public void setHorario_entra(String horario_entra) {
        this.horario_entra = horario_entra;
    }

    public String getHorario_salid() {
        return horario_salid;
    }

    public void setHorario_salid(String horario_salid) {
        this.horario_salid = horario_salid;
    }
    
    
}
