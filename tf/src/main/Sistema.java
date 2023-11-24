package main;

import main.data.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sistema {

    private List<Motorista> motoristas= new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Carro> carros = new ArrayList<>();
    private Historico historico = new Historico();
    private int count_idAvaliacao = 0;
    private int count_idCorrida = 0;



    public List<Motorista> getMotoristas() {
        return motoristas;
    }

    public void setMotoristas(List<Motorista> motoristas) {
        this.motoristas = motoristas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

    public boolean cadastrarCliente(Cliente cliente){
        if(!clientes.contains(cliente)) {
            clientes.add(cliente);
            return true;
        }
        return false;
    }

    public void removerCliente(Cliente cliente){
        clientes.remove(cliente);
    }

    public boolean cadastrarMotorista(Motorista motorista){
        if(!motoristas.contains(motorista)) {
            motoristas.add(motorista);
            return true;
        }
        return false;
    }

    public void removerMotorista(Motorista motorista){
        motoristas.remove(motorista);
    }

    public void novoCliente(){
        Scanner input = new Scanner(System.in);
        String idCliente = String.valueOf(clientes.size()+1);
        System.out.println("Digite o nome do cliente: ");
        String nome = input.next();
        System.out.println("Digite o email do cliente: ");
        String email = input.next();
        System.out.println("Digite o telefone do cliente: ");
        String telefone = input.next();
        System.out.println("Digite o saldo do cliente: ");
        double saldo = input.nextDouble();
        cadastrarCliente(new Cliente(idCliente, nome, email, telefone, saldo, 0));
        System.out.println(idCliente);
    }

    public void novoMotorista(){
        Scanner input = new Scanner(System.in);
        String idMotorista = String.valueOf(motoristas.size());
        System.out.println("Digite o nome do motorista: ");
        String nome = input.next();
        System.out.println("Digite o cpf do motorista: ");
        String cpf = input.next();
        System.out.println("Digite o telefone do cliente: ");
        String telefone = input.next();
        System.out.println("Digite o saldo do cliente: ");
        double saldo = input.nextDouble();
        cadastrarMotorista(new Motorista(idMotorista, cpf, telefone, nome, saldo, 0));
    }

    public void deletarCliente(){
        Cliente c = encontrarCliente();
        removerCliente(c);
    }

    public void deletarMotorista(){
        Motorista m = encontrarMotorista();
        removerMotorista(m);
    }

    public void escreverAvaliacao(Cliente c){
        Scanner input = new Scanner(System.in);
        count_idAvaliacao+=1;
        String idAvaliacao = String.valueOf(count_idAvaliacao);
        System.out.println("Digite a nota da avaliação: ");
        double nota = input.nextDouble();
        System.out.println("Digite a descricao da avaliação: ");
        String descricao = input.next();
        System.out.println("Digite a data: ");
        String data = input.next();
        Avaliacao avalicao = new Avaliacao(idAvaliacao, nota, descricao, data);
        historico.adicionarAvaliacaoHistorico(avalicao);
    }

    public void gerarCorrida(Cliente c){
        int distancia = ThreadLocalRandom.current().nextInt(3, 14 + 1);
        double valor = ThreadLocalRandom.current().nextDouble(6, 30);
        Scanner input = new Scanner(System.in);
        count_idCorrida+=1;
        String idCorrida = String.valueOf(count_idCorrida);
        System.out.println("Digite a origem: ");
        String origem = input.next();
        System.out.println("Digite o destino: ");
        String destino = input.next();
        Corrida corrida = new Corrida(idCorrida, distancia, origem, destino, valor, false);
        historico.adicionarCorridaHistorico(corrida);
        c.solicitarCorrida(corrida);
    }

    public Cliente encontrarCliente(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o cpf do cliente: ");
        String idCliente = input.next();
        for(Cliente c: clientes){
            System.out.println("CPF: "+ c.getCpf());
            if(Objects.equals(idCliente, c.getCpf())){
                return c;
            }
        }
        return null;
    }

    public Motorista encontrarMotorista(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a cnh do motorista: ");
        String idMotorista = input.next();
        for(Motorista m: motoristas){
            if(Objects.equals(idMotorista, m.getCnh())){
                return m;
            }
        }
        return null;
    }

    public Corrida encontrarCorrida(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o id da corrida: ");
        String idCorrida = input.next();
        for(Corrida c: historico.getCorridas()){
            if(Objects.equals(idCorrida, c.getIdCorrida())){
                return c;
            }
        }
        return null;
    }

    public void solicitarReembolso(Cliente cliente){
        Corrida c = encontrarCorrida();
        double reembolso = c.getValor();
        cliente.reembolsoPosCancelamento(reembolso);
    }

    public void imprimirHistoricoCorridas(){
        for (Corrida c : historico.getCorridas()){
            System.out.println(c.toString());
        }
    }

    public void imprimirHistoricoAvaliacoes(){
        for (Avaliacao a : historico.getAvaliacoes()){
            System.out.println(a.toString());
        }
    }

    public void imprimirHistoricoReservas(){
        for (Reserva r : historico.getReservas()){
            System.out.println(r.toString());
        }
    }
}
