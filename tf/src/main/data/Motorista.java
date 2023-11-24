package main.data;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Motorista extends Historico{
    private String cnh;
    private String cpf;
    private String telefone;
    private String nome;
    private double saldo;
    private double avaliacao;
    private Carro carro;
    private Corrida corrida_atual;

    public Motorista(String cnh, String cpf, String telefone, String nome, double saldo, double avaliacao) {
        this.cnh = cnh;
        this.cpf = cpf;
        this.telefone = telefone;
        this.nome = nome;
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

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

   public boolean aceitarCorrida(Corrida corrida){
        if(corrida_atual.isFinalizada()){
            adicionarCorridaHistorico(corrida_atual);
            corrida_atual = corrida;
            return true;
        }
        return false;
   }

    public boolean cancelarCorrida(){
        if(!corrida_atual.isFinalizada()) {
            corrida_atual.setFinalizada(true);
            return true;
        }
        return false;
    }

    public void saldoPosCorrida(double valor){
        double saldo_atual = getSaldo();
        double saldo_pos = saldo_atual + valor;
        setSaldo(saldo_pos);
    }

    public boolean registrarCarro(Carro novo_carro){
        if(!carro.equals(novo_carro)){
            setCarro(novo_carro);
            return true;
        }
        return false;
    }

    public String verificaSaldo(){
        return "Saldo atual: " + getSaldo();
    }



}
