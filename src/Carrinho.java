import java.util.ArrayList;

public class Carrinho {

    ArrayList<Produto> carrinho;
    Produto produto;

    public Carrinho() {
        this.carrinho = new ArrayList<Produto>();
    }

    void adicionarProduto(Produto produto){
        if (carrinho.contains(produto)){
            produto.quantidade++;
        }
        else {
            carrinho.add(produto);
        }
    }

    void removeProduto(){
        carrinho.remove(produto);
    }

    double valorTotal () {
        double valor = 0;

        for (Produto produtos : carrinho) {
            valor += produtos.quantidade * produtos.preco;

        }
        return valor;
    }

    public void exibirCarrinho() {
        System.out.println("Carrinho de Compras:");
        for (int i = 0; i < carrinho.size(); i++) {
            System.out.println((i + 1) + ". " + carrinho.get(i));
        }
        System.out.println("Total: R$ " + valorTotal());
    }


}
