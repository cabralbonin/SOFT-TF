package main.data;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cabral
 */
public class Cliente extends Historico{
    private String cpf;
    private String nome;
    private String email;
    private String telefone;
    private double saldo;
    private double avaliacao;
    private Corrida corrida_atual;

   public Cliente(String cpf, String nome, String email, String telefone, double saldo, double avaliacao) {
       this.cpf = cpf;
       this.nome= nome;
       this.email= email;
       this.telefone = telefone;
       this.saldo = saldo;
       this.avaliacao = avaliacao;
       corridas = new ArrayList<>();
       avaliacoes = new ArrayList<>();
       reservas = new ArrayList<>();
   }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Corrida getCorrida_atual() {
        return corrida_atual;
    }

    public void setCorrida_atual(Corrida corrida_atual) {
        this.corrida_atual = corrida_atual;
    }

    public boolean solicitarCorrida(Corrida corrida){
       if(corrida_atual == null){
           return false;
       }
       if(corrida_atual.isFinalizada()) {
           setCorrida_atual(corrida);
           return true;
       }
       return false;
    }

    public void saldoPosCorrida(double valor){
        double saldo_atual = getSaldo();
        double saldo_pos = saldo_atual - valor;
        setSaldo(saldo_pos);
    }

    public void reembolsoPosCancelamento(double reembolso){
        double saldo_atual = getSaldo();
        double saldo_reembolso = saldo_atual+reembolso;
        setSaldo(saldo_reembolso);
    }

    public boolean realizarReserva(String idReserva,String data, String horario, Corrida corrida){
       Reserva reserva = new Reserva(idReserva, data, horario, corrida);
       if(!reservas.contains(reserva)){
           adicionarReservaHistorico(reserva);
           return true;
       }
       return false;
    }

    public String verificaSaldo(){
        return "Saldo atual: " + getSaldo();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", saldo=" + saldo +
                ", avaliacao=" + avaliacao +
                ", corrida_atual=" + corrida_atual +
                '}';
    }
}
