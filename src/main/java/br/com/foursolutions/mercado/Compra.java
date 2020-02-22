package br.com.foursolutions.mercado;

import java.util.ArrayList;
import java.util.List;

public class Compra {


    private List<ItemVenda> itemVendas = new ArrayList<>();


   public void adicionar(Produto produto, int qtde) {
        this.itemVendas.add(new ItemVenda(produto, qtde));
    }

    public double obterValorTotal() {
        double total = 0;

        for (ItemVenda itemVenda : itemVendas) {
            total += itemVenda.getQtde() * itemVenda.getProduto().getValor();
        }

        return total;
    }

}
