package org.example;

public class NavegadorImpl implements Navegador{

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");
    }
}
