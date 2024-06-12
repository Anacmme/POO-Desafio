package org.example;

public class ReprodutorMusicaImpl implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("TOCANDO");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MUSICA");
    }
}
