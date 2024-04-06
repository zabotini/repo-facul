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
        public String conta;
        private String cpf;
        private String nome;
        private String ultimoNome;
        private double saldo;


        public Cliente () {
            /**this.id = id;
            this.cpf = cpf;
            this.nome = nome;
            this.ultimoNome = ultimoNome;
            this.conta = conta;
            this.saldo = 0.0;*/
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
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

    public static class OperacoesBancarias {
        /**
         * Aqui declararemos as operações que o cliente pode executar e também uma saída segura de sua sessão
         */

        static Scanner scanner = new Scanner(System.in);

        static void saldo(Cliente cliente) {
            System.out.println("Seu saldo atual é: R$" + cliente.getSaldo());
        }

        static double deposito(Cliente cliente) {

            System.out.println("Digite o valor a ser depositado: ");
            double valor = scanner.nextDouble();
            if (valor > 0) {
                System.out.println("Foi depositada a quantia de R$" + valor + " em sua conta.\nObrigado por utilizar nossos serviços! \n");
                cliente.setSaldo(valor);
                return valor;
            } else {
                throw new IllegalArgumentException("Valor inválido para depósito, tente novamente");
            }
        }

        static double saque(Cliente cliente) {

            System.out.println("Digite o valor a ser sacado: ");
            double valor = scanner.nextDouble();
            System.out.println("Valor do saque R$" + valor);
            if (valor > 0 && valor < cliente.saldo) {
                System.out.println("Foi sacada a quantia de R$" + valor + " em sua conta.\nSeu saldo atualizado é de R$" + cliente.getSaldo() + "\nObrigado por utilizar nossos serviços! \n");
                cliente.setSaldo(-valor);
                return valor;
            } else {
                throw new IllegalArgumentException("Valor maior que seu saldo ou inválido para saque, tente novamente");
            }
        }

        static void encerra() {
            System.out.println("Obrigado por utilizar nossos serviços! Até uma próxima :)");
            scanner.close();
        }
    }

    public static void main( String[] args )
    { 
        Cliente um = new Cliente();
        um.setCpf("123.456.789-01");
        um.setnome("Rafa");
        um.setUltimoNome("Z");
        System.out.println("ID do Cliente: " + um.id);
        System.out.println(um.conta);
        System.out.println(um.saldo %.2f);
        System.out.println(um.cpf);
        System.out.println(um.nome + " " + um.ultimoNome + "\n");

        Cliente dois = new Cliente();
        dois.setCpf("123.456.789-01");
        dois.setnome("Abublebe");
        dois.setUltimoNome("Doido");
        System.out.println("ID do Cliente: " + dois.id);

        System.out.println(dois.conta);
        System.out.println(um.saldo);
        System.out.println(dois.cpf);
        System.out.println(dois.nome + " " + dois.ultimoNome + "\n");

        OperacoesBancarias.deposito(um);

        OperacoesBancarias.saldo(um);

        OperacoesBancarias.saque(um);

        OperacoesBancarias.saldo(um);

    }
}
