package criacionais.factory.Exercicio1;

public class Main {
    public static void main(String[] args) {
        Produto p = Fabrica.criarProduto("Celular");
        System.out.println("Produto criado: " + p.getNome());
}
}