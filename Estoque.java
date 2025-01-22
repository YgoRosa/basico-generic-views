package Exercicios.Generics;

import java.util.ArrayList;
import java.util.List;

public class Estoque<T> {
    private List<T> itens = new ArrayList<>();

    public void adicionarItem(T item){
        itens.add(item);
    }

    public void removerItem(int index){
        if(index >= 0 && index < itens.size())
            itens.remove(index);
        else
            System.out.println("Indice não disponível!");
    }

    public void exibirItens(){
        for (T item : itens)
            System.out.println(item);
    }

    public int quantidade(){
        return itens.size();
    }
}
