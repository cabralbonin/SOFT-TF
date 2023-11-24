package main.data;

public class Reserva {

    private String idReserva;
    private String data;
    private String horario;
    private Corrida corrida;

    public Reserva(String idReserva, String data, String horario, Corrida corrida) {
        this.idReserva = idReserva;
        this.data = data;
        this.horario = horario;
        this.corrida = corrida;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Corrida getCorrida() {
        return corrida;
    }

    public void setCorrida(Corrida corrida) {
        this.corrida = corrida;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "idReserva='" + idReserva + '\'' +
                ", data='" + data + '\'' +
                ", horario='" + horario + '\'' +
                ", corrida=" + corrida +
                '}';
    }
}
