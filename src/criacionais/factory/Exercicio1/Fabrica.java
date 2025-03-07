package criacionais.factory.Exercicio1;

public class Fabrica {
    public static Produto criarProduto(String nome) {
        return new Produto(nome);
    }
}