package br.com.exemplo.arvorebinaria;

public class Main {
    public static void main(String[] args) {

        Arvore arvore = new Arvore();
        arvore.inserir(10);
        arvore.inserir(7);
        arvore.inserir(15);
        arvore.inserir(5);
        arvore.inserir(3);
        arvore.inserir(12);
        arvore.inserir(20);
        arvore.inserir(25);
        arvore.inserir(30);
        System.out.println("Árvore binária:");
        arvore.imprimir();
        System.out.println("\n**** Impressão dos valores da Árvore ****");
        System.out.println("\nIN-ORDEM");
        arvore.imprimirInOrdem();
        System.out.println("\nPRÉ-ORDEM");
        arvore.imprimirPreOrdem();
        System.out.println("\nPÓS-ORDEM");
        arvore.imprimirPosOrdem();
        int valorProcurado = 7;
        boolean encontrado = arvore.pesquisar(valorProcurado);
        System.out.println("Valor " + valorProcurado + " encontrado na árvore: " + encontrado);
        System.out.println("raiz " + arvore.getRaiz().valor);
        int menorElemento = encontrarMaiorValor(arvore.getRaiz());
        System.out.println("maior elemento na árvore: " + menorElemento);
    }

    private static int encontrarMaiorValor(No node) {
        int maiorValor = node.valor;
        while (node.direita != null) {
            maiorValor = node.direita.valor;
            node = node.direita;
        }
        return maiorValor;
    }
}

