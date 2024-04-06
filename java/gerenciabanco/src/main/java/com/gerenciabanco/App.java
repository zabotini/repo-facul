package com.gerenciabanco;

/**
 * Construa a aplicação em um único arquivo do tipo java main Class. Isso porque o método principal, que é chamado pela maquina virtual, deve estar nesse mesmo arquivo. No seu código você deverá construir, basicamente:
        a) a classe principal
        b) classe para para dados pessoais e operações bancárias
        c) método para exibição do menu.
 * Aplicação de gerencia de banco com procedimentos básicos como informação de usuário(nome, sobrenome e CPF), e procedimentos bancários como consulta de saldo, depósitoeretiradaeinterrupção da execução do código, contendo uma mensagem de despedida.
 * Meu primeiro código em Java!
 */

public class App 
{
    public static void main( String[] args )
    { 
        Cliente um = new Cliente(0, "064.788.519-07", "Rafael", "Z", "0001");

        System.out.println(um.id);
        System.out.println(um.account);
        System.out.println(um.cpf);
        System.out.println(um.name + " " + um.last);
        
        
        Cliente dois = new Cliente(1, null, null, null, "0002");

        dois.setCpf("123.456.789-01");
        dois.setName("Abublebe");
        dois.setLastName("Doido");

        System.out.println(dois.id);
        System.out.println(dois.account);
        System.out.println(dois.cpf);
        System.out.println(dois.name + " " + dois.last);

        um.cpf = "000000000";
        System.out.println(um.cpf);
    }

    static class Cliente {
        public int id;
        private String cpf;
        private String name;
        private String last;
        public String account;

        public Cliente (int id, String cpf, String name, String last, String account) {
            this.id = id;
            this.cpf = cpf;
            this.name = name;
            this.last = last;
            this.account = account;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        
        public void setName(String name) {
            this.name = name;
        }

        public void setLastName(String last) {
            this.last = last;
        }
        
    }
}
