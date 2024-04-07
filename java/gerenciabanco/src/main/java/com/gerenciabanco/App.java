package com.gerenciabanco;
import java.util.Scanner;

/**
 * Construa a aplicação em um único arquivo do tipo java main Class. Isso porque o método principal, que é chamado pela maquina virtual, deve estar nesse mesmo arquivo. No seu código você deverá construir, basicamente:
        a) a classe principal
        b) classe para para dados pessoais e operações bancárias
        c) método para exibição do menu.
 * Aplicação de gerencia de banco com procedimentos básicos como informação de usuário(nome, sobrenome e CPF), e procedimentos bancários como consulta de saldo, depósito e retirada e interrupção da execução do código, contendo uma mensagem de despedida.
 * Meu primeiro código em Java!
 */

public class App 
{
    static class Cliente {
        /**
         * Nessa Classe, é modelado nosso cliente, e seus dados necessários para o cadastro interno
        */

        public int id;
        public int agencia = 0001;
        public String conta;
        private String nome;
        private String ultimoNome;
        private double saldo = 0.0;


        public Cliente () {
        }

        public void setID (int id) {
            this.id = id;
        }

        public void setConta (String conta) {
            this.conta = conta;
        }
        
        public void setnome(String nome) {
            this.nome = nome;
        }

        public void setUltimoNome(String ultimoNome) {
            this.ultimoNome = ultimoNome;
        }

        public void setSaldo(double saldo) {
            this.saldo += saldo;
        }

        public double getSaldo() { return saldo; }

        /** Fim da Classe do Cliente */

    }

    static class OperacoesBancarias {
        /**
         * Aqui declararemos as operações que o cliente pode executar e também uma saída segura de sua sessão
         */

        static Scanner scanner = new Scanner(System.in);

        static void saldo(Cliente cliente) {
            System.out.println("Seu saldo atual é: R$" + cliente.getSaldo());
        }

        static void deposito(Cliente cliente) {

            System.out.println("Digite o valor a ser depositado: ");
            double valor = scanner.nextDouble();
            if (valor > 0) {
                cliente.setSaldo(+valor);
                System.out.println("Foi depositada a quantia de R$" + valor + " em sua conta.\nObrigado por utilizar nossos serviços! \n");
            } else {
                System.out.println("Valor inválido para depósito, tente novamente\n\n\n");
            }
        }

        static void saque(Cliente cliente) {

            System.out.println("Digite o valor a ser sacado: ");
            double valor = scanner.nextDouble();
            System.out.println("Valor do saque R$" + valor);
            if (valor > 0 && valor < cliente.saldo) {
                cliente.setSaldo(-valor);
                System.out.println("Foi sacada a quantia de R$" + valor + " em sua conta.\nSeu saldo atualizado é de R$" + cliente.getSaldo() + "\nObrigado por utilizar nossos serviços! \n");
            } else {
                System.out.println("Valor maior que seu saldo ou inválido para saque, tente novamente");
            }
        }

        static void encerra() {
            System.out.println("Obrigado por utilizar nossos serviços! Até uma próxima :)\n\n\n");
            scanner.close();
        }
    }

    static class Menu {
        public static Scanner entradaSelecao = new Scanner(System.in);
        public static int entradaUsuario = 0;

        static void apresentaMenu(Cliente cliente){
            System.out.printf("\nBem-vindo %s %s ao Seu Banco\n", cliente.nome, cliente.ultimoNome);
            System.out.printf("Agência %d | Conta: %s | Saldo: %9.2f%n\n\n", cliente.agencia, cliente.conta, cliente.getSaldo());
            System.out.println("1\tConsultar saldo\n2\tEfetuar depósito\n3\tEfetuar saque\n4\tFinalizar sessão\n");
        }

        static void selecaoMenu(Cliente cliente) {

            do {
                System.out.printf("Digite o número da funcionalidade desejada: ");
                entradaUsuario = entradaSelecao.nextInt();
                if (entradaUsuario > 0 && entradaUsuario < 5) {

                    switch (entradaUsuario) {
                        case 1:
                            OperacoesBancarias.saldo(cliente);
                            clearConsole();
                            apresentaMenu(cliente);
                            break;
                        case 2:
                            OperacoesBancarias.deposito(cliente);
                            clearConsole();
                            apresentaMenu(cliente);
                            break;
                        case 3:
                            OperacoesBancarias.saque(cliente);
                            clearConsole();
                            apresentaMenu(cliente);
                            break;
                        case 4:
                            OperacoesBancarias.encerra();
                            break;
                        default:
                            System.out.println("Algo inesperado aconteceu, tente delisgar e ligar novamente este caixa :)\n");
                            entradaSelecao.close();
                            break;
                    }
            
                } else {
                    System.out.println("Número inválido, tente novamente\n");
                    clearConsole();
                    apresentaMenu(cliente);
                    selecaoMenu(cliente);
                }
            } while (entradaUsuario > 0 && entradaUsuario < 4);
            entradaSelecao.close();
        }

        public final static void clearConsole(){
            try
            {
                final String os = System.getProperty("os.name");
                
                if (os.contains("Windows"))
                {
                    Runtime.getRuntime().exec("cls");
                }
                else
                {
                    Runtime.getRuntime().exec("clear");
                }
            }
            catch (final Exception e) { }
        }

        static void clienteTeste(Cliente cliente){
            cliente.setID(900000001);
            cliente.setConta("12329-6");
            cliente.setnome("Rafael");
            cliente.setUltimoNome("Venjenski");
        }

    }

    public static void main( String[] args )
    { 
        Cliente um = new Cliente();
        Menu.clienteTeste(um);
        Menu.apresentaMenu(um);
        Menu.selecaoMenu(um);
    }
}
