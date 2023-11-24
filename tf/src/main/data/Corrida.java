package main.data;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cabral
 */
public class Corrida {
   private String idCorrida;
   private double distancia;
   private String origem;
   private String destino;
   private double valor;
   private boolean isFinalizada;

   public Corrida(String idCorrida, double distancia, String origem, String destino, double valor, boolean isFinalizada) {
       this.idCorrida= idCorrida;
       this.distancia = distancia;
       this.origem = origem;
       this.destino = destino;
       this.valor = valor;
       this.isFinalizada = isFinalizada;
   }

    public String getIdCorrida() {
        return idCorrida;
    }

    public void setIdCorrida(String idCorrida) {
        this.idCorrida = idCorrida;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isFinalizada() {
        return isFinalizada;
    }

    public void setFinalizada(boolean finalizada) {
        isFinalizada = finalizada;
    }

    public void finalizaCorrida(){
       isFinalizada = true;
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "idCorrida='" + idCorrida + '\'' +
                ", distancia=" + distancia +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", valor=" + valor +
                ", isFinalizada=" + isFinalizada +
                '}';
    }
}