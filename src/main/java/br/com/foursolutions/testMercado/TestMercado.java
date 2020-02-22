package br.com.foursolutions.testMercado;

import br.com.foursolutions.mercado.Cliente;
import br.com.foursolutions.mercado.Compra;
import br.com.foursolutions.mercado.Produto;

public class TestMercado {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("diego");

        var compra1 = new Compra();
        compra1.adicionar(new Produto("arroz", 2.4), 12);
        compra1.adicionar(new Produto("arroz", 2.4), 12);
        compra1.adicionar(new Produto("arroz", 2.4), 12);
        compra1.adicionar(new Produto("arroz", 2.4), 12);

        var compra2 = new Compra();
        compra2.adicionar(new Produto("arroz", 25), 100);
        compra2.adicionar(new Produto("arroz", 2), 1);
        compra2.adicionar(new Produto("arroz", 45), 5);
        compra2.adicionar(new Produto("arroz", 23), 2);

        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        System.out.printf("O valor total da compra2 foi de R$%.2f" , cliente.obterValorTotal());


    }
}
