package br.com.foursolutions.mercado;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private static final Logger LOGGER = LoggerFactory.getLogger(Cliente.class);

    private String nome;

    private Cliente cliente;
    private List<Compra> compraList = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;

    }

    public void adicionarCompra(Compra compra) {
        this.compraList.add(compra);
    }

    public double obterValorTotal() {
        double total = 0;
        for (Compra compra : compraList) {
            total += compra.obterValorTotal();
        }
        return total;
    }

}
