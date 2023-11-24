package main.data;

import java.util.ArrayList;
import java.util.List;

public class Historico {

    protected List<Corrida> corridas = new ArrayList<>();
    protected List<Avaliacao> avaliacoes = new ArrayList<>();
    protected List<Reserva> reservas = new ArrayList<>();

    public boolean adicionarAvaliacaoHistorico(Avaliacao avaliacao){
        if(!avaliacoes.contains(avaliacao)){
            avaliacoes.add(avaliacao);
            return true;
        }
        return false;
    }

    public boolean adicionarCorridaHistorico(Corrida corrida){
        if(!corridas.contains(corrida)){
            corridas.add(corrida);
            return true;
        }
        return false;
    }

    public boolean adicionarReservaHistorico(Reserva reserva){
        if(!reservas.contains(reserva)){
            reservas.add(reserva);
            return true;
        }
        return false;
    }

    public List<Corrida> getCorridas() {
        return corridas;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}
