import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        //Elementos para add na Lista
        adicionar(lista, "Item 1");
        adicionar(lista, "Item 2");
        adicionar(lista, "Item 3");

        //Update de elementos na lista
        atualizar(lista, 1, "Item Atualizado");

        //Get de elementos na lista
        ler(lista);

        //Delete elemento na lista
        remover(lista, 0);

        //Get após Deletar
        ler(lista);
    }

    //Método add na Lista
    public static void adicionar(ArrayList<String> lista, String elemento) {
        lista.add(elemento);
        System.out.println("Adicionando Elemento: " + elemento);
    }

    //Método Update de elementos na lista
    public static void atualizar(ArrayList<String> lista, int indice, String novoElemento) {
        if (indice >= 0 && indice < lista.size()) {
            lista.set(indice, novoElemento);
            System.out.println("Elemento Atualizado " + indice);
        } else {
            System.out.println("Item inválido para Atualização");
        }
    }

    //Método Get de elementos na lista
    public static void ler(ArrayList<String> lista) {
        System.out.println("Todos os elementos da Lista:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }

    //Método Delete elemento na lista
    public static void remover(ArrayList<String> lista, int indice){
        if(indice >= 0 && indice < lista.size()) {
            String elementoDeletado = lista.remove(indice);
            System.out.println("Elemento Deletado: " + elementoDeletado);
        }else {
            System.out.println("Item inválido para Exclusão");
        }
    }
}