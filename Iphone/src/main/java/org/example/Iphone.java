package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Iphone {
    public static void main(String[] args) {
           ReprodutorMusical reprodutorMusical = new ReprodutorMusicaImpl();
           AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonicoImpl();
           Navegador navegador = new NavegadorImpl();

           reprodutorMusical.tocar();
           reprodutorMusical.pausar();
           reprodutorMusical.selecionarMusica();

           aparelhoTelefonico.atender();
           aparelhoTelefonico.ligar();
           aparelhoTelefonico.iniciarCorreioDeVoz();

           navegador.adicionarNovaAba();
           navegador.atualizarPagina();
           navegador.exibirPagina();
        }
    }
