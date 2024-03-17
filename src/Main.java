public class Main {
    public static void main(String[] args) {


        Produto frango = new Produto("Frango", 3, 5.25);
        Produto danone = new Produto("Danone", 2, 11.51);
        Produto fandangos = new Produto("Fandangos", 5, 7.00);

        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto(frango);
        carrinho.adicionarProduto(danone);
        carrinho.adicionarProduto(danone);
        carrinho.adicionarProduto(fandangos);



       carrinho.exibirCarrinho();


        }
    }





