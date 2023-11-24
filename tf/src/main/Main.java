package main;

import main.data.Cliente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        int op = 0;
        do {
            op = menu();
            switch (op) {
                case 1:
                    int opAdm = 0;
                    do {
                        opAdm = menuAdm();
                        switch (opAdm) {
                            case 1:
                                sistema.novoCliente();
                                break;
                            case 2:
                                sistema.novoMotorista();
                                break;
                            case 3:
                                sistema.deletarCliente();
                                break;
                            case 4:
                                sistema.deletarMotorista();
                                break;
                            case 5:
                                sistema.imprimirHistoricoCorridas();
                                break;
                            case 6:
                                sistema.imprimirHistoricoAvaliacoes();
                                break;
                            case 7:
                                sistema.imprimirHistoricoReservas();
                                break;
                        }

                    } while (opAdm > 0 && opAdm < 5);
                    continue;
                case 2:
                    Cliente c = sistema.encontrarCliente();
                    if(c == null){
                        System.out.println("Cliente nao encontrado");
                        continue;
                    }
                    int opCliente = 0;
                    do {
                        opCliente = menuCliente();
                        switch (opCliente) {
                            case 1:
                                sistema.gerarCorrida(c);
                                break;
                            case 2:
                                sistema.escreverAvaliacao(c);
                                break;
                            case 3:
                                sistema.solicitarReembolso(c);
                                break;
                        }
                    } while (opCliente > 0 && opCliente < 4);
            }
        } while (op > 0 && op < 3);
    }

    private static int menu() {
        System.out.println("");
        System.out.println("1 - Entrar como administrador");
        System.out.println("2 - Entrar como cliente");
        System.out.println("Digite qualquer outro valor para sair");
        System.out.print("Sua opção: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    private static int menuAdm() {
        System.out.println("");
        System.out.println("1 - Inserir um novo cliente");
        System.out.println("2 - Inserir um novo motorista");
        System.out.println("3 - Remover um cliente");
        System.out.println("4 - Remover um motorista");
        System.out.println("5 - Imprimir o histórico de corridas");
        System.out.println("6 - Imprimir o histórico de avaliações");
        System.out.println("7 - Imprimir o histórico de reservas");
        System.out.println("Digite qualquer outro valor para sair");
        System.out.print("Sua opção: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static int menuCliente() {
        System.out.println("");
        System.out.println("1 - Solicitar uma corrida");
        System.out.println("2 - Escrever uma avaliação");
        System.out.println("3 - Solicitar reembolso de uma corrida");
        System.out.println("Digite qualquer outro valor para sair");
        System.out.print("Sua opção: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    

}
