package Exercicios.Collections.Generics;

public class Main {
    public static void main(String[] args) {

        Estoque<String> estoqueLivros = new Estoque<>();
        estoqueLivros.adicionarItem("Livro A");
        estoqueLivros.adicionarItem("Livro B");
        estoqueLivros.adicionarItem("Livro C");
        estoqueLivros.exibirItens();
        estoqueLivros.removerItem(1);
        estoqueLivros.exibirItens();
        System.out.println("Quantidade no estoque: " + estoqueLivros.quantidade());

        Estoque<Integer> estoqueNumeros = new Estoque<>();
        estoqueNumeros.adicionarItem(10);
        estoqueNumeros.adicionarItem(20);
        estoqueNumeros.adicionarItem(30);
        estoqueNumeros.exibirItens();
    }
}