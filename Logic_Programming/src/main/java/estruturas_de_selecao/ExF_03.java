package estruturas_de_selecao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExF_03 {

    /*
        Uma loja de produtos eletrônicos com vendas
        regulares opta por contratar uma equipe para a
        organização de um sistema de gerenciamento
        de vendas. Seu desafio será elaborar um algoritmo
        que, a partir de dados fornecidos pelo
        usuário, calcule o valor da venda de um produto,
        exibindo uma saída em vídeo contendo
        o código do produto, o nome, a quantidade
        comprada, o valor unitário e o valor total.

     */

    static class Produto {

        private String nome;
        private String codigoProduto;
        private int quntidadeComprada;
        private double valorUnitario;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCodigoProduto() {
            return codigoProduto;
        }

        public void setCodigoProduto(String codigoProduto) {
            this.codigoProduto = codigoProduto;
        }

        public int getQuntidadeComprada() {
            return quntidadeComprada;
        }

        public void setQuntidadeComprada(int quntidadeComprada) {
            this.quntidadeComprada = quntidadeComprada;
        }

        public double getValorUnitario() {
            return valorUnitario;
        }

        public void setValorUnitario(double valorUnitario) {
            this.valorUnitario = valorUnitario;
        }
        // methods

        public double valorTotal (double valor, int quantidade) {
            return valor * quantidade;
        }
        public void statusDeCompra () {
            // exibir codigo do produto , o nome e a quantidade comprada, valor unitario e valor total
            System.out.printf("codigo do produto: %s%n", codigoProduto);
            System.out.printf("nome do produto: %s%n", nome);
            System.out.printf("quantidade comprada: %d%n", quntidadeComprada);
            System.out.printf("valor unitario: %.2f%n", valorUnitario);
            System.out.printf("valor total: %.2f%n", valorTotal(valorUnitario,quntidadeComprada));
        }

        @Override
        public String toString() {
            return "Produto{" +
                    "nome='" + nome + '\'' +
                    ", codigoProduto='" + codigoProduto + '\'' +
                    ", quntidadeComprada=" + quntidadeComprada +
                    ", valorUnitario=" + valorUnitario +
                    '}';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        // dados fornecidos pelos clientes
         produto.setNome("Arroz");
         produto.setQuntidadeComprada(2);
         produto.setCodigoProduto("arr");
         produto.setValorUnitario(25.00);



        // exibir codigo do produto , o nome e a quantidade comprada, valor unitario e valor total
        produto.statusDeCompra();
        
    }
}
