package celular;

import funcoes.AparelhoTelefonico;
import funcoes.Navegador;
import funcoes.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, Navegador {
    @Override
    public void tocarMusica() {
        // TODO Auto-generated method stub
        System.out.println("Tocando musica");
    }

    @Override
    public void pausarMusica() {
        // TODO Auto-generated method stub
        System.out.println("Musica pausada");

    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
        System.out.println("Selecionar musica");
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void exibirPagina() {
        // TODO Auto-generated method stub
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Pagina atualizada");
    }
}
